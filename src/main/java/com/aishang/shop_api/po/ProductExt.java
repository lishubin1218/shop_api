package com.aishang.shop_api.po;

public class ProductExt {
    private int pageNow = 1;
    private int pageSize = 8;
    private Integer cId;
    private Integer csId;
    private String pName;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "ProductExt{" +
                "pageNow=" + pageNow +
                ", pageSize=" + pageSize +
                ", cId=" + cId +
                ", csId=" + csId +
                ", pName='" + pName + '\'' +
                '}';
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getCsId() {
        return csId;
    }

    public void setCsId(Integer csId) {
        this.csId = csId;
    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
