package com.wy.cabinet.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/2/27 0027.
 */

public class ToastUtil {


    public static void showShort(Context context, CharSequence message) {

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void showLong(Context context, CharSequence message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

}
