package com.wy.cabinet.activity;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wy.cabinet.R;
import com.wy.cabinet.adapters.ShoppingCartAdapter;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/6/15.
 * <p>
 * 购物车结算界面
 */

public class ShoppingCartActivity extends BaseJumpActivity {

    @BindView(R.id.recycler_shoppingCart)
    RecyclerView recycler_shoppingCart;



    @Override
    public int getLayoutId() {
        return R.layout.activity_shopping_cart;
    }

    @Override
    public void initData() {
        recycler_shoppingCart.setLayoutManager(new LinearLayoutManager(this));
        ShoppingCartAdapter shoppingCartAdapter = new ShoppingCartAdapter(this);
        recycler_shoppingCart.setAdapter(shoppingCartAdapter);
    }



    @OnClick({ R.id.tv_pay})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_pay:
                Intent intent=new Intent(this,PayActivity.class);
                startActivity(intent);
                break;
        }
    }
}
