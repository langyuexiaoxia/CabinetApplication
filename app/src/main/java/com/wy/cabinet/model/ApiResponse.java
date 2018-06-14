package com.wy.cabinet.model;

/**
 * api返回的响应 on 2015/11/12.
 */
public class ApiResponse<T> {
    public String token;//不是每个都要token
    public int status;//1表示成功 其他表示失败
    public String message;//失败的原因
    public String sign;//签名
    public T data;//数据
    public int totalCount;//总记录数

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
