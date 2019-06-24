package com.example.peach.base;


import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;
import android.widget.Toast;

import com.example.peach.widget.LoadingDialog;

import java.util.Objects;


public abstract class BaseActivity extends AppCompatActivity implements IBaseView {


    private Handler mHandler = new Handler(Looper.getMainLooper());
    private Long uiThreadId = Thread.currentThread().getId();
    private LoadingDialog mLoadingDialog;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Objects.requireNonNull(getSupportActionBar()).hide();
        initBaseView();
        setContentView(getLayoutResId());
        init();
        doBusiness();
    }

    public void initBaseView() {
        mLoadingDialog = new LoadingDialog.Builder(this)
                .setMessage("加载中...")
                .setLoadingCallBack(new LoadingDialog.LoadingCallback() {
                    @Override
                    public void onTimeOut() {
                        Toast.makeText(getBaseContext(), "请求超时！", Toast.LENGTH_SHORT).show();
                    }
                })
                .showTime(10000)
                .build();
    }


    @Override
    public void showLoadingDialog() {
        if (mLoadingDialog != null) {
            if (Thread.currentThread().getId() == uiThreadId) {
                if (mLoadingDialog.isShowing()) {
                    return;
                }
                mLoadingDialog.show();
                return;
            }
            mHandler.post(new Runnable() {
                @Override
                public void run() {
                    if (mLoadingDialog.isShowing()) {
                        return;
                    }
                    mLoadingDialog.show();
                }
            });

        }
    }

    @Override
    public void hideLoadingDialog() {
        if (Thread.currentThread().getId() == uiThreadId) {
            mLoadingDialog.dismiss();
        }
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                mLoadingDialog.dismiss();
            }
        });

    }

}
