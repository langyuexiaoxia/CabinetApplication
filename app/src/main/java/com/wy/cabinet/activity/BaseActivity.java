package com.wy.cabinet.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wy.cabinet.R;
import com.wy.cabinet.utils.ViewUtil;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2018/6/12.
 */

public abstract class BaseActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ViewUtil.initSystemBar(this, R.color.red);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        //数据初始化
        initData();

    }

    public abstract int getLayoutId();


    public abstract void initData();


}
