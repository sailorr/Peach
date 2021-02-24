package com.example.peach.fragment;

import android.os.Bundle;
import android.util.Log;

import com.example.peach.ImageItemBean;
import com.example.peach.base.CommonFrag;
import com.example.peach.net.LinMeiMeiJsoup;
import com.example.peach.net.ResponsCallBack;

import java.util.List;

/**
 * @author Administrator on2019/6/11 10:22
 * @desc
 */
public class LinMeiMeiFrag extends CommonFrag {
    private int pageCount=1;

    public static CommonFrag newInstance(String url) {
        Bundle bundle = new Bundle();
        bundle.putString("url", url);
        LinMeiMeiFrag frag = new LinMeiMeiFrag();
        frag.setArguments(bundle);
        return frag;
    }

    @Override
    protected void doNetWork(Boolean isLoadMore) {
        if (isLoadMore) {
            pageCount++;
            Log.w("Test", "loadmore page--->"+pageCount);
            net(getMoreUrl(url,pageCount),true);
        }else {
            net(url,false);
        }

    }

    private void net(String url, final boolean isLoadmore){
        Log.w("Test", "url--"+url);
        LinMeiMeiJsoup.get(url,new ResponsCallBack() {
            @Override
            public void success(final List<ImageItemBean> data) {

                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        hideLoadingDialog();
                        mRefreshLayout.setRefreshing(false);
                        if (isLoadmore){
                            mRVAdapter.addData(data);
                        }else {
                            mRVAdapter.replaceData(data);
                        }

                    }
                });
            }
            @Override
            public void fail(Exception e) {
            }
        });
    }

    private String getMoreUrl(String url,int pageCount){
        return url+"index_"+pageCount+".html";
    }

}
