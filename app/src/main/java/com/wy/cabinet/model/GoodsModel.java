package com.wy.cabinet.model;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;
import com.wy.cabinet.db.AppDatabase;

/**
 * Created by Administrator on 2018/6/19.
 */
@Table(database = AppDatabase.class)
public class GoodsModel extends BaseModel{

    @PrimaryKey(autoincrement = true)
    public long id;

    @Column
    public String name;

    @Column
    public String price;
}
