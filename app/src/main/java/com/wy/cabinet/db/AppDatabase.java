package com.wy.cabinet.db;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by Administrator on 2018/6/19.
 */

@Database(version = AppDatabase.VERSION,name = AppDatabase.NAME)
public class AppDatabase {
    //数据库名称
    public static final String NAME = "CabinetDatabase";
    //数据库版本号
    public static final int VERSION = 1;

}
