package com.aishang.shop_api.util;

import com.aishang.shop_api.po.AdminUser;
import com.aishang.shop_api.service.AdminUserService;
import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JWTUtil {
    @Resource
    private AdminUserService us;

    static private AdminUserService adminUserService;
    @PostConstruct
    public void init(){
        adminUserService = us;
    }
    /**
     * 过期时间5分钟
     */
    private static final long EXPIRE_TIME=60*60*1000;
    /**
     * 加密密钥
     */
    private static final String KEY = "aishang";

    /**
     * 生成token
     */
    public static Map<String,Object> createToken(AdminUser adminUser){
        Map<String,Object> map = new HashMap();
        map.put("typ","JWT");
        map.put("alg","HS256");
        JwtBuilder builder = Jwts.builder().setHeader(map)
                .setId(adminUser.getAdminId()+"")
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRE_TIME)) //setExpiration:token过期时间  当前时间+有效时间
                .setSubject(adminUser.getUsername())         //setSubject:用户名
                .setIssuedAt(new Date())         //setIssuedAt:token创建时间
                .signWith(SignatureAlgorithm.HS256,KEY);    //signWith:加密方式
        String token = builder.compact();//返回签名
        map.clear();
        map.put("user",adminUser);
        map.put("token",token);
        return map;
    }

    public static Map<String, Object> checkToken(String token) {
        Map<String, Object> map = new HashMap();
        Claims claims = null;
        try {
            //token过期后，会抛出ExpiredJwtException 异常，通过这个来判定token过期，
            claims = Jwts.parser().setSigningKey(KEY).parseClaimsJws(token).getBody();
        } catch (ExpiredJwtException e) {
            return map;
        }
//        {jti=1, exp=1621323565, sub=asjy, iat=1621323265}
//        从token中获取用户id，查询该Id的用户是否存在，存在则token验证通过
        System.out.println(claims.toString()+"+++++++++++++++++++");

        String id = claims.getId();
        AdminUser adminUser = adminUserService.selectUserById(id);
        if (adminUser != null) {
            map.put("user", adminUser);
            map.put("token", token);
            return map;
        }
        return map;
    }
}
