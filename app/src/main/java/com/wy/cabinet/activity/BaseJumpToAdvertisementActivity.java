package com.wy.cabinet.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.MotionEvent;

import com.wy.cabinet.utils.JumpToAdvertisementUtil;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2018/6/20.
 */

public abstract class BaseJumpToAdvertisementActivity extends Activity{

    private JumpToAdvertisementUtil countTimerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);

        init();
        //数据初始化
        intData();
    }

    protected  void init(){
        //初始化CountTimer，设置倒计时为2分钟。
        countTimerView=new JumpToAdvertisementUtil(120000,1000,BaseJumpToAdvertisementActivity.this);
    }

    public abstract int getLayoutId();


    public abstract void intData();


    private void timeStart(){
        new Handler(getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                countTimerView.start();
            }
        });
    }

    /**
     * 主要的方法，重写dispatchTouchEvent
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            //获取触摸动作，如果ACTION_UP，计时开始。
            case MotionEvent.ACTION_UP:
                countTimerView.start();
                break;
            //否则其他动作计时取消
            default:countTimerView.cancel();
                break;
        }
        return super.dispatchTouchEvent(ev);
    }
    @Override
    protected void onPause() {
        super.onPause();
        countTimerView.cancel();
    }
    @Override
    protected void onResume() {

        super.onResume();
        timeStart();
    }

}
