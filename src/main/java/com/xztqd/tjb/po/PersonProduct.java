package com.xztqd.tjb.po;

import java.util.Date;

public class PersonProduct {
    private String ppflwno;
    private String cstno;
    private String prono;
    private long buyamt;
    private Date buydate;
    private Date enddate;
    private int prostate;

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

    public long getBuyamt() {
        return buyamt;
    }

    public void setBuyamt(long buyamt) {
        this.buyamt = buyamt;
    }

    public Date getBuydate() {
        return buydate;
    }

    public void setBuydate(Date buydate) {
        this.buydate = buydate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public int getProstate() {
        return prostate;
    }

    public void setProstate(int prostate) {
        this.prostate = prostate;
    }

    public PersonProduct() {}

    public PersonProduct(String ppflwno, String cstno, String prono, long buyamt, Date buydate, Date enddate, int prostate) {
        this.ppflwno = ppflwno;
        this.cstno = cstno;
        this.prono = prono;
        this.buyamt = buyamt;
        this.buydate = buydate;
        this.enddate = enddate;
        this.prostate = prostate;
    }

    @Override
    public String toString() {
        return "PersonProduct {" +
                "ppflwno: '" + ppflwno + "', " +
                "cstno: '"+ cstno + "', "+
                "prono: '" + prono + "', " +
                "buyamt: " + buyamt + ", " +
                "buydate: '" + buydate + "', " +
                "enddate: '" + enddate + "', " +
                "prostate: " + prostate + "}";
    }
}
