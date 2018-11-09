package com.huawei.it.m6.vo;/*
 * @author 片尾solo
 * @Date  2018/11/8  12:00
 */


public class UserVO {
    private long id;
    private String name;
    private long addTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAddTime() {
        return addTime;
    }

    public void setAddTime(long addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addTime=" + addTime +
                '}';
    }
}
