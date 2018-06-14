package com.wy.cabinet.receivers;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.wy.cabinet.activity.AdvertisementActivity;

/**
 * Created by Administrator on 2018/6/12.
 * 开机自启
 */

public class BootBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent bootIntent = new Intent(context, AdvertisementActivity.class);
        bootIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(bootIntent);
        Log.i("BootBroadcastReceiver","intent"+intent.getAction());

    }

}