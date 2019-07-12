package com.xztqd.tjb.po;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class FinProduct {
    //产品表属性
    private String prono;//产品号
    private String proname;//产品名称
    private String prodesc;//产品描述
    private String prorate;//产品利率
    private String prrisk;//产品风险系数
    private String findate;//期限
    private long initmoney;//最低认购额度
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date begindat;//开始售卖日期
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date enddate;//停止售卖日期
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date expiredate;//到期日期


    public String getProno() {
        return prono;
    }

    public void setProno(String prono) {
        this.prono = prono;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getProdesc() {
        return prodesc;
    }

    public void setProdesc(String prodesc) {
        this.prodesc = prodesc;
    }

    public String getProrate() {
        return prorate;
    }

    public void setProrate(String prorate) {
        this.prorate = prorate;
    }

    public String getPrrisk() {
        return prrisk;
    }

    public void setPrrisk(String prrisk) {
        this.prrisk = prrisk;
    }

    public String getFindate() {
        return findate;
    }

    public void setFindate(String findate) {
        this.findate = findate;
    }

    public long getInitmoney() {
        return initmoney;
    }

    public void setInitmoney(long initmoney) {
        this.initmoney = initmoney;
    }

    public Date getBegindat() {
        return begindat;
    }

    public void setBegindat(Date begindat) {
        this.begindat = begindat;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Date getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }

    public FinProduct() {
    }

    public FinProduct(String prono, String proname, String prodesc, String prorate, String prrisk, String findate, long initmoney, Date begindat, Date enddate, Date expiredate) {
        this.prono = prono;
        this.proname = proname;
        this.prodesc = prodesc;
        this.prorate = prorate;
        this.prrisk = prrisk;
        this.findate = findate;
        this.initmoney = initmoney;
        this.begindat = begindat;
        this.enddate = enddate;
        this.expiredate = expiredate;
    }

    @Override
    public String toString() {
        return "FinProduct{" +
                "prono='" + prono + '\'' +
                ", proname='" + proname + '\'' +
                ", prodesc='" + prodesc + '\'' +
                ", prorate='" + prorate + '\'' +
                ", prrisk='" + prrisk + '\'' +
                ", findate='" + findate + '\'' +
                ", initmoney=" + initmoney +
                ", begindat=" + begindat +
                ", enddate=" + enddate +
                ", expiredate=" + expiredate +
                '}';
    }
}
