package com.wy.cabinet.utils;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;

import com.wy.cabinet.activity.AdvertisementActivity;

/**
 * Created by Administrator on 2018/6/20.
 */

public class CountTimerUtil extends CountDownTimer{

    private Context context;
    /**
     * @param millisInFuture    The number of millis in the future from the call
     *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
     *                          is called.
     * @param countDownInterval The interval along the way to receive
     *                          {@link #onTick(long)} callbacks.
     */
    public CountTimerUtil(long millisInFuture, long countDownInterval, Context context) {
        super(millisInFuture, countDownInterval);
        this.context=context;
    }

    @Override
    public void onTick(long millisUntilFinished) {

    }

    @Override
    public void onFinish() {
        Intent intent=new Intent(context,AdvertisementActivity.class);
        context.startActivity(intent);
    }
}
