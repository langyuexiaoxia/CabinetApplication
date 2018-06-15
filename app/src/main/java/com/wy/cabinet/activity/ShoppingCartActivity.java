package com.wy.cabinet.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.wy.cabinet.R;
import com.wy.cabinet.adapters.ShoppingCartAdapter;

import java.util.List;

import butterknife.BindView;

/**
 * Created by Administrator on 2018/6/15.
 *
 * 购物车结算界面
 */

public class ShoppingCartActivity extends BaseActivity{

    @BindView(R.id.recycler_shoppingCart)
    RecyclerView recycler_shoppingCart;




    @Override
    public int getLayoutId() {
        return R.layout.activity_shopping_cart;
    }

    @Override
    public void intData() {
        recycler_shoppingCart.setLayoutManager(new LinearLayoutManager(this));
        ShoppingCartAdapter shoppingCartAdapter=new ShoppingCartAdapter(this);
        recycler_shoppingCart.setAdapter(shoppingCartAdapter);
    }
}
