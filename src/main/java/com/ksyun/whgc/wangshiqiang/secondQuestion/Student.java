package com.ksyun.whgc.wangshiqiang.secondQuestion;

import java.util.Date;

public class Student {

    @FieldName("姓名")
    private String name;
    @FieldName("年龄")
    private int age;
    @FieldName("住址")
    private String address;
    @FieldName("出生年月")
    private Date birthday;

    public Student(String name, String address, Date birthday) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        Date currentDate=new Date();
        this.age=currentDate.getYear()-birthday.getYear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthdate() {
        return birthday;
    }

    public void setBirthdate(Date birthdate) {
        this.birthday = birthdate;
    }

}
