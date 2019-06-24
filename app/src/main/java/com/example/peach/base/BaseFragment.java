package com.example.peach.base;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.peach.widget.LoadingDialog;

/**
 * @author Administrator on2019/6/10 9:37
 * @desc
 */
public abstract class BaseFragment extends Fragment {

    private View rootView;
    private LoadingDialog mLoadingDialog;
    private int UiThreadId = (int) Thread.currentThread().getId();
    protected Handler mHandler = new Handler(Looper.getMainLooper());

    /**
     * 是否已经加载视图
     */
    protected boolean isViewPrepared;
    /**
     * 是否已经加载数据
     */
    protected boolean isDataLoaded;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(getLayoutResId(), container, false);
        return rootView;
    }

    protected abstract int getLayoutResId();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        isViewPrepared = true;
        init(view);
        lazyLoad();
    }


    protected abstract void init(View view);


    public void showLoadingDialog() {
        if (mLoadingDialog != null) {
            if (Thread.currentThread().getId() == UiThreadId) {
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

    public void hideLoadingDialog() {
        if (mLoadingDialog != null) {
            if (Thread.currentThread().getId() == UiThreadId) {
                mLoadingDialog.dismiss();
                return;
            }
            mHandler.post(new Runnable() {
                @Override
                public void run() {
                    mLoadingDialog.dismiss();
                }
            });
        }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        lazyLoad();
    }

    private void lazyLoad() {
        if (!isViewPrepared) {
            return;
        }
        if (getUserVisibleHint()) {
            if (!isDataLoaded) {
                onLazyLoad();
            }
        }
    }

    protected abstract void onLazyLoad();
}
