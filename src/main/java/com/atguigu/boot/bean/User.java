package com.atguigu.boot.bean;

public class User {
    private String usrname;
    private int age;

    public User() {
    }

    public User(String usrname, int age) {
        this.usrname = usrname;
        this.age = age;
    }

    public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
