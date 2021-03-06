package com.wy.cabinet.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wy.cabinet.R;
import com.wy.cabinet.activity.ShoppingCartActivity;

/**
 * Created by Administrator on 2018/6/14.
 * 商品列表adapter
 */

public class GoodsAdapter extends RecyclerView.Adapter<GoodsAdapter.MyViewHolder>{
    private Context context;

    public GoodsAdapter( Context context){
        this.context=context;
    }

    @Override
    public GoodsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_goods, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText("100000");
        holder.ll_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,ShoppingCartActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView tv;
        LinearLayout ll_item;

        public MyViewHolder(View view)
        {
            super(view);
            tv = (TextView) view.findViewById(R.id.tv_price);
            ll_item = (LinearLayout) view.findViewById(R.id.ll_item);
        }
    }
}
