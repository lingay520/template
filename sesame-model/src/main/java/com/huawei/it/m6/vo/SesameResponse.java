package com.huawei.it.m6.vo;/*
 * @author 片尾solo
 * @Date  2018/11/9  6:32
 */

public class SesameResponse {

    private String code;
    private boolean status;
    private Object data;
    private String msg;

    public SesameResponse(String code, boolean status, Object data,String msg) {
        this.code = code;
        this.status = status;
        this.data = data;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
