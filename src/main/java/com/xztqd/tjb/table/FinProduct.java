package com.xztqd.tjb.table;

import java.util.Date;

public class FinProduct {
    //产品表属性
    private String PRONO;//产品号
    private String PRONAME;//产品名称
    private String PRODESC;//产品描述
    private String PRORATE;//产品利率
    private String PRRISK;//产品风险系数
    private String FINDATE;//期限
    private Long INITMONEY;//最低认购额度
    private Date BEGINDAT;//开始售卖日期
    private Date ENDDATE;//停止售卖日期
    private Date EXPIREDATE;//到期日期


    public String getPRONO() {
        return PRONO;
    }

    public void setPRONO(String PRONO) {
        this.PRONO = PRONO;
    }

    public String getPRONAME() {
        return PRONAME;
    }

    public void setPRONAME(String PRONAME) {
        this.PRONAME = PRONAME;
    }

    public String getPRODESC() {
        return PRODESC;
    }

    public void setPRODESC(String PRODESC) {
        this.PRODESC = PRODESC;
    }

    public String getPRORATE() {
        return PRORATE;
    }

    public void setPRORATE(String PRORATE) {
        this.PRORATE = PRORATE;
    }

    public String getPRRISK() {
        return PRRISK;
    }

    public void setPRRISK(String PRRISK) {
        this.PRRISK = PRRISK;
    }

    public String getFINDATE() {
        return FINDATE;
    }

    public void setFINDATE(String FINDATE) {
        this.FINDATE = FINDATE;
    }

    public Long getINITMONEY() {
        return INITMONEY;
    }

    public void setINITMONEY(Long INITMONEY) {
        this.INITMONEY = INITMONEY;
    }

    public Date getBEGINDAT() {
        return BEGINDAT;
    }

    public void setBEGINDAT(Date BEGINDAT) {
        this.BEGINDAT = BEGINDAT;
    }

    public Date getENDDATE() {
        return ENDDATE;
    }

    public void setENDDATE(Date ENDDATE) {
        this.ENDDATE = ENDDATE;
    }

    public Date getEXPIREDATE() {
        return EXPIREDATE;
    }

    public void setEXPIREDATE(Date EXPIREDATE) {
        this.EXPIREDATE = EXPIREDATE;
    }

    public FinProduct() {
    }

    public FinProduct(String PRONO, String PRONAME, String PRODESC, String PRORATE, String PRRISK, String FINDATE, Long INITMONEY, Date BEGINDAT, Date ENDDATE, Date EXPIREDATE) {
        this.PRONO = PRONO;
        this.PRONAME = PRONAME;
        this.PRODESC = PRODESC;
        this.PRORATE = PRORATE;
        this.PRRISK = PRRISK;
        this.FINDATE = FINDATE;
        this.INITMONEY = INITMONEY;
        this.BEGINDAT = BEGINDAT;
        this.ENDDATE = ENDDATE;
        this.EXPIREDATE = EXPIREDATE;
    }

    @Override
    public String toString() {
        return "FinProduct{" +
                "PRONO='" + PRONO + '\'' +
                ", PRONAME='" + PRONAME + '\'' +
                ", PRODESC='" + PRODESC + '\'' +
                ", PRORATE='" + PRORATE + '\'' +
                ", PRRISK='" + PRRISK + '\'' +
                ", FINDATE='" + FINDATE + '\'' +
                ", INITMONEY=" + INITMONEY +
                ", BEGINDAT='" + BEGINDAT + '\'' +
                ", ENDDATE='" + ENDDATE + '\'' +
                ", EXPIREDATE='" + EXPIREDATE + '\'' +
                '}';
    }
}
