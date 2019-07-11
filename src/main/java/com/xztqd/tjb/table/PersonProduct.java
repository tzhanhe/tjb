package com.xztqd.tjb.table;

import java.util.Date;

public class PersonProduct {
    private String PPFLWNO;//
    private String CSTNO;//
    private String PRONO;//
    private Long BUYAMT;//
    private Date BUYDATE;//
    private Date ENDDATE;//
    private int PROSTATE;//

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

    public Long getBUYAMT() {
        return BUYAMT;
    }

    public void setBUYAMT(Long BUYAMT) {
        this.BUYAMT = BUYAMT;
    }

    public Date getBUYDATE() {
        return BUYDATE;
    }

    public void setBUYDATE(Date BUYDATE) {
        this.BUYDATE = BUYDATE;
    }

    public Date getENDDATE() {
        return ENDDATE;
    }

    public void setENDDATE(Date ENDDATE) {
        this.ENDDATE = ENDDATE;
    }

    public int getPROSTATE() {
        return PROSTATE;
    }

    public void setPROSTATE(int PROSTATE) {
        this.PROSTATE = PROSTATE;
    }

    public PersonProduct() {
    }

    public PersonProduct(String PPFLWNO, String CSTNO, String PRONO, Long BUYAMT, Date BUYDATE, Date ENDDATE, int PROSTATE) {
        this.PPFLWNO = PPFLWNO;
        this.CSTNO = CSTNO;
        this.PRONO = PRONO;
        this.BUYAMT = BUYAMT;
        this.BUYDATE = BUYDATE;
        this.ENDDATE = ENDDATE;
        this.PROSTATE = PROSTATE;
    }
    @Override
    public String toString() {
        return "PersonProduct{" +
                "PPFLWNO='" + PPFLWNO + '\'' +
                ", CSTNO='" + CSTNO + '\'' +
                ", PRONO='" + PRONO + '\'' +
                ", BUYAMT=" + BUYAMT +
                ", BUYDATE=" + BUYDATE +
                ", ENDDATE=" + ENDDATE +
                ", PROSTATE=" + PROSTATE +
                '}';
    }
}
