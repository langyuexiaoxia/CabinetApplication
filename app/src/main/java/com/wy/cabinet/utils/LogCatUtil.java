package com.wy.cabinet.utils;

import android.os.Environment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by Administrator on 2018/6/21.
 */

public class LogCatUtil {

    public static void getLog() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Process mLogcatProc = null;
                try {
                    //获取logcat日志信息
                    ArrayList<String> commandLine = new ArrayList<String>();
                    commandLine.add( "logcat");
                    commandLine.add( "-d");
                    commandLine.add( "-v");
                    commandLine.add( "time");
                    commandLine.add( "-s");
                    commandLine.add( "cabinet:I");
                    mLogcatProc = Runtime.getRuntime().exec( commandLine.toArray( new String[commandLine.size()]));
                    final InputStream is = mLogcatProc.getInputStream();
                    File file=new File(Environment.getExternalStorageDirectory(),"cabinetLog.txt");
                    FileOutputStream os = new FileOutputStream(file);
                    int len = 0;
                    byte[] buf = new byte[1024];
                    while (-1 != (len = is.read(buf))) {
                        os.write(buf, 0, len);
                        os.flush();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
