package com.wy.cabinet.activity;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;
import com.lzy.okgo.request.base.Request;
import com.wy.cabinet.R;
import com.wy.cabinet.model.ApiRequest;
import com.wy.cabinet.model.ApiResponse;
import com.wy.cabinet.model.LoginReq;
import com.wy.cabinet.model.User;
import com.wy.cabinet.utils.AppConfig;
import com.wy.cabinet.utils.HttpUtil;
import com.wy.cabinet.utils.SPUtil;
import com.wy.cabinet.utils.StringUtil;
import com.wy.cabinet.utils.ToastUtil;
import com.wy.cabinet.view.LoadingDialog;

import java.lang.reflect.Type;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/6/12.
 * 商品选购界面
 */

public class ShoppingMallActivity extends BaseActivity{

    @BindView(R.id.ll_content)
    LinearLayout ll_content;
    @Override
    public int getLayoutId() {
        return R.layout.activity_shopping_mall;
    }

    @Override
    public void intData() {
        login();
    }

    public void login() {
        LoginReq loginReq = new LoginReq();
        loginReq.setUserName("18353363588");
        loginReq.setPassword(StringUtil.getMD5("111111"));
        ApiRequest<LoginReq> request = new ApiRequest<>(loginReq);
        Gson gson = new Gson();
        String json = gson.toJson(request);
        OkGo.<String>post(HttpUtil.api_userLogin).upJson(json).execute(new StringCallback() {

            @Override
            public void onStart(Request<String, ? extends Request> request) {
                super.onStart(request);
                LoadingDialog.showLoadingDialog(ShoppingMallActivity.this);
            }

            @Override
            public void onSuccess(Response<String> response) {
                String result = response.body().toString();
                Gson gson = new Gson();
                Type type = new TypeToken<ApiResponse<User>>() {
                }.getType();
                ApiResponse<User> jsonBean = gson.fromJson(result, type);
                if (jsonBean.getStatus() == 0) {
                    ToastUtil.showShort(ShoppingMallActivity.this, jsonBean.getMessage());
                    return;
                }
                User user = jsonBean.getData();
                AppConfig.token = jsonBean.getToken();
                SPUtil.save(ShoppingMallActivity.this, "token", jsonBean.getToken());
                SPUtil.save(ShoppingMallActivity.this, "userId", user.getUserId());

                if (jsonBean.getStatus() == 1) {
                    ToastUtil.showShort(ShoppingMallActivity.this,"登录成功");
                }
            }

            @Override
            public void onFinish() {
                super.onFinish();
                LoadingDialog.hideLoadingDialog();
            }
        });
    }

    @OnClick({R.id.ll_content})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_content:
                Intent intent=new Intent(this,AdvertisementActivity.class);
                startActivity(intent);
                break;
        }
    }
}
