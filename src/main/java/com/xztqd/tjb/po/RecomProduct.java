package com.xztqd.tjb.po;

import java.util.Date;

public class RecomProduct {
    private String prono;
    private String proname;
    private String prodesc;
    private String prorate;
    private long saleamt;
    private Date invaliddate;
    private Date expiredate;
    private String fsflwno;

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

    public Date getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }

    public String getFsflwno() {
        return fsflwno;
    }

    public void setFsflwno(String fsflwno) {
        this.fsflwno = fsflwno;
    }

    public RecomProduct(){

    }
    public RecomProduct(String prono, String proname, String prodesc, String prorate, long saleamt, Date invaliddate, Date expiredate, String fsflwno) {
        this.prono = prono;
        this.proname = proname;
        this.prodesc = prodesc;
        this.prorate = prorate;
        this.saleamt = saleamt;
        this.invaliddate = invaliddate;
        this.expiredate = expiredate;
        this.fsflwno = fsflwno;
    }

    @Override
    public String toString() {
        return "RecomProduct {" +
                "prono: '" + prono + "', " +
              "prono: '"+ prono + "', "+
             "proname: '" + proname + "', " +
             "prodesc: '" + prodesc + "', " +
             "prorate: '" + prorate + "', " +
            "saleamt: " + saleamt + ", " +
             "invaliddate: '" + invaliddate + "', " +
             "expiredate: '" + expiredate + "', " +
             "fsflwno: '"+ fsflwno + "'}";
    }
}
