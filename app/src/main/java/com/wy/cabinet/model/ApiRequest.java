package com.wy.cabinet.model;


import com.wy.cabinet.utils.AppConfig;

/**
 * Created by Administrator on 2015/11/13.
 * 网络请求模型
 */
public class ApiRequest<T> {
    private String token;
    private String tm;
    private String sign;
    private String appId;
    private T data;

    public ApiRequest (){
        this.token= AppConfig.token;
    }

    public ApiRequest(T data) {
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
