package com.xztqd.tjb.po;

public class ErrorMsg {
    private String errormsg;

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    public ErrorMsg(String errormsg) {
        this.errormsg = errormsg;
    }

    @Override
    public String toString() {
        return "ErrorMsg{" +
                "errormsg='" + errormsg + '\'' +
                '}';
    }
}
