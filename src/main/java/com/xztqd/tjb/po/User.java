package com.xztqd.tjb.po;

public class User {
    private String id;
    private String userid;
    private String hashpassword;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getHashpassword() {
        return hashpassword;
    }

    public void setHashpassword(String hashpassword) {
        this.hashpassword = hashpassword;
    }
    public User(){

    }

    public User(String id, String userid, String hashpassword) {
        this.id = id;
        this.userid = userid;
        this.hashpassword = hashpassword;
    }
    public User(String userid, String hashpassword) {
        this.userid = userid;
        this.hashpassword = hashpassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userid='" + userid + '\'' +
                ", hashpassword='" + hashpassword + '\'' +
                '}';
    }
}
