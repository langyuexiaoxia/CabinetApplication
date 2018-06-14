package com.wy.cabinet.utils;

import android.util.Log;

/**
 * Created by Administrator on 2018/2/7 0007.
 */

public class LogUtil {
    private static final String TAG="wy";
    public static boolean isDebug=true;


    public static void i(String tip){
        if (isDebug) {
            Log.i(TAG, tip);
        }
    }

}
