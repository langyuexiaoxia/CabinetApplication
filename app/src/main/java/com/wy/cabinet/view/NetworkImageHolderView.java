package com.wy.cabinet.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.holder.Holder;


/**
 * Created by Administrator on 2018/4/25.
 */

public class NetworkImageHolderView implements Holder<Integer> {

    ImageView imageView;

    @Override
    public View createView(Context context) {
        imageView = new ImageView(context);  //轮播中存放图片的控件——imageview
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);  //图片充满控件
        return imageView;
    }
    @Override
    public void UpdateUI(Context context, int position, Integer data) {

        imageView.setImageResource(data);  //设置图片

    }
}



