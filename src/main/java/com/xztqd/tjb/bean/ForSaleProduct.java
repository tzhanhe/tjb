package com.xztqd.tjb.bean;

import java.util.Date;

public class ForSaleProduct {
    private String FSFLWNO;//待售产品订单号
    private String PPFLWNO;//个人订单号
    private String CSTNO;//客户号
    private String PRONO;//产品号
    private Long SALEAMT;//出售金额
    private Date INVALIDDATE;//失效日期
    private Boolean ISCANTRADE;//是否可以交易（1 true 0 false）

    public String getFSFLWNO() {
        return FSFLWNO;
    }

    public void setFSFLWNO(String FSFLWNO) {
        this.FSFLWNO = FSFLWNO;
    }

    public String getPPFLWNO() {
        return PPFLWNO;
    }

    public void setPPFLWNO(String PPFLWNO) {
        this.PPFLWNO = PPFLWNO;
    }

    public String getCSTNO() {
        return CSTNO;
    }

    public void setCSTNO(String CSTNO) {
        this.CSTNO = CSTNO;
    }

    public String getPRONO() {
        return PRONO;
    }

    public void setPRONO(String PRONO) {
        this.PRONO = PRONO;
    }

    public Long getSALEAMT() {
        return SALEAMT;
    }

    public void setSALEAMT(Long SALEAMT) {
        this.SALEAMT = SALEAMT;
    }

    public Date getINVALIDDATE() {
        return INVALIDDATE;
    }

    public void setINVALIDDATE(Date INVALIDDATE) {
        this.INVALIDDATE = INVALIDDATE;
    }

    public Boolean getISCANTRADE() {
        return ISCANTRADE;
    }

    public void setISCANTRADE(Boolean ISCANTRADE) {
        this.ISCANTRADE = ISCANTRADE;
    }

    public ForSaleProduct() {
    }

    public ForSaleProduct(String FSFLWNO, String PPFLWNO, String CSTNO, String PRONO, Long SALEAMT, Date INVALIDDATE, Boolean ISCANTRADE) {
        this.FSFLWNO = FSFLWNO;
        this.PPFLWNO = PPFLWNO;
        this.CSTNO = CSTNO;
        this.PRONO = PRONO;
        this.SALEAMT = SALEAMT;
        this.INVALIDDATE = INVALIDDATE;
        this.ISCANTRADE = ISCANTRADE;
    }

    @Override
    public String toString() {
        return "ForSaleProduct{" +
                "FSFLWNO='" + FSFLWNO + '\'' +
                ", PPFLWNO='" + PPFLWNO + '\'' +
                ", CSTNO='" + CSTNO + '\'' +
                ", PRONO='" + PRONO + '\'' +
                ", SALEAMT=" + SALEAMT +
                ", INVALIDDATE=" + INVALIDDATE +
                ", ISCANTRADE=" + ISCANTRADE +
                '}';
    }
}
