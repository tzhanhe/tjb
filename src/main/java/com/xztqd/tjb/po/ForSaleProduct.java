package com.xztqd.tjb.po;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class ForSaleProduct {
    private String fsflwno;//待售产品订单号
    private String ppflwno;//个人订单号
    private String cstno;//客户号
    private String prono;//产品号
    private long saleamt;//出售金额
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date invaliddate;//失效日期
    private Boolean iscantrade;//是否可以交易（1 true 0 false）


    public String getFsflwno() {
        return fsflwno;
    }

    public void setFsflwno(String fsflwno) {
        this.fsflwno = fsflwno;
    }

    public String getPpflwno() {
        return ppflwno;
    }

    public void setPpflwno(String ppflwno) {
        this.ppflwno = ppflwno;
    }

    public String getCstno() {
        return cstno;
    }

    public void setCstno(String cstno) {
        this.cstno = cstno;
    }

    public String getProno() {
        return prono;
    }

    public void setProno(String prono) {
        this.prono = prono;
    }

    public long getSaleamt() {
        return saleamt;
    }

    public void setSaleamt(long saleamt) {
        this.saleamt = saleamt;
    }

    public Date getInvaliddate() {
        return invaliddate;
    }

    public void setInvaliddate(Date invaliddate) {
        this.invaliddate = invaliddate;
    }

    public Boolean getIscantrade() {
        return iscantrade;
    }

    public void setIscantrade(Boolean iscantrade) {
        this.iscantrade = iscantrade;
    }

    public ForSaleProduct() {
    }

    public ForSaleProduct(String fsflwno, String ppflwno, String cstno, String prono, Long saleamt, Date invaliddate, Boolean iscantrade) {
        this.fsflwno = fsflwno;
        this.ppflwno = ppflwno;
        this.cstno = cstno;
        this.prono = prono;
        this.saleamt = saleamt;
        this.invaliddate = invaliddate;
        this.iscantrade = iscantrade;
    }

    @Override
    public String toString() {
        return "ForSaleProduct{" +
                "fsflwno='" + fsflwno + '\'' +
                ", ppflwno='" + ppflwno + '\'' +
                ", cstno='" + cstno + '\'' +
                ", prono='" + prono + '\'' +
                ", saleamt=" + saleamt +
                ", invaliddate=" + invaliddate +
                ", iscantrade=" + iscantrade +
                '}';
    }
}
