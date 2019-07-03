package com.example.peach.fragment;

import android.os.Bundle;

import com.example.peach.ImageItemBean;
import com.example.peach.base.CommonFrag;
import com.example.peach.net.FiveOneJsoup;
import com.example.peach.net.LinMeiMeiJsoup;
import com.example.peach.net.ResponsCallBack;

import java.util.List;

/**
 * @author Administrator on2019/6/11 10:22
 * @desc
 */
public class FiveOneFrag extends CommonFrag {
    private int pageCount;


    public static CommonFrag newInstance(String url) {
        Bundle bundle = new Bundle();
        bundle.putString("url", url);
        FiveOneFrag frag = new FiveOneFrag();
        frag.setArguments(bundle);
        return frag;
    }

    @Override
    protected void doNetWork(Boolean isLoadMore) {
        showLoadingDialog();
        if (isLoadMore) {
            pageCount++;
        }
        FiveOneJsoup.get(url, pageCount, new ResponsCallBack() {
            @Override
            public void success(final List<ImageItemBean> data) {

                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        hideLoadingDialog();
                        mRefreshLayout.setRefreshing(false);
                        mRVAdapter.replaceData(data);
                    }
                });

            }

            @Override
            public void fail(Exception e) {

            }
        });
    }
}
