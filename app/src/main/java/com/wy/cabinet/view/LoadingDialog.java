package com.wy.cabinet.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.wang.avi.AVLoadingIndicatorView;
import com.wy.cabinet.R;


/**
 * Created by Administrator on 2018/2/27 0027.
 */

public class LoadingDialog {

    private static Dialog mLoadingDialog;
    /**
     * 显示加载对话框
     *
     * @param context    上下文
     */
    public static void showLoadingDialog(Context context) {
        if (context==null){
            return;
        }
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_loading, null);
        AVLoadingIndicatorView avLoadingIndicatorView = (AVLoadingIndicatorView) view.findViewById(R.id.AVLoadingIndicatorView);
        mLoadingDialog = new Dialog(context, R.style.loading_dialog_style);
        mLoadingDialog.setCancelable(false);
        mLoadingDialog.setContentView(view, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        if (!mLoadingDialog.isShowing()) {
             mLoadingDialog.show();
        }
        avLoadingIndicatorView.smoothToShow();
        mLoadingDialog.setOnKeyListener(new DialogInterface.OnKeyListener() {
            @Override
            public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK) {
                    mLoadingDialog.hide();
                    return true;
                }
                return false;
            }
        });

    }

    public static void hideLoadingDialog(){
        if (mLoadingDialog!=null && mLoadingDialog.isShowing()) {
            mLoadingDialog.dismiss();
        }

    }


}
