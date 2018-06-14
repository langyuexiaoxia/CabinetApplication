package com.wy.cabinet.activity;

import android.app.Application;

import okhttp3.OkHttpClient;

/**
 * Created by Administrator on 2018/6/12.
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        initOkGO();
    }


    //初始化网络请求OKGo
    public void initOkGO() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();

    }

}
