package com.wy.cabinet.activity;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.wy.cabinet.R;
import com.wy.cabinet.view.NetworkImageHolderView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

//待机广告界面
public class AdvertisementActivity extends BaseActivity {

    @BindView(R.id.A_Banner)
    ConvenientBanner ABanner;

    private ArrayList<Integer> bannerList;

    @Override
    public int getLayoutId() {
        return R.layout.activity_advertisement;
    }


    @Override
    public void intData() {
        bannerList = new ArrayList<>();
        bannerList.clear();
        bannerList.add(R.mipmap.toppri_01);
        bannerList.add(R.mipmap.toppri_02);
        bannerList.add(R.mipmap.toppri_03);

        ABanner.setPages(new CBViewHolderCreator() {
                    @Override
                    public Object createHolder() {
                        return new NetworkImageHolderView();
                    }
                 }, bannerList)
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.ALIGN_PARENT_RIGHT).startTurning(4000)//这里是轮播动画和时间的设置
                .setPageIndicator(new int[]{R.drawable.hot_select, R.drawable.hot_unselect})//小圆点
                .setOnItemClickListener(new OnItemClickListener() {//点击监听
                    @Override
                    public void onItemClick(int position) {
                        Intent intent=new Intent(AdvertisementActivity.this,ShoppingMallActivity.class);
                        startActivity(intent);
                    }
                });
    }



}
