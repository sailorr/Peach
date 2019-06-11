package com.example.peach.base;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.peach.ImageItemBean;
import com.example.peach.R;
import com.example.peach.adapter.CommonRVAdapter;
import com.example.peach.net.JsoupUtil;
import com.example.peach.net.ResponsCallBack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator on2019/6/10 14:31
 * @desc
 */
public class CommonFrag extends BaseFragment {
    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mRefreshLayout;
    private CommonRVAdapter mRVAdapter;
    private List<ImageItemBean> mBeanList = new ArrayList<>();
    private int pageCount;
    private String url;

    @Override
    protected int getLayoutResId() {
        return R.layout.frag_common_main;
    }

    @Override
    protected void doBusiness() {

    }

    @Override
    protected void init(View view) {
        url = getArguments().getString("url");
        mRecyclerView = view.findViewById(R.id.rvList);
        mRefreshLayout = view.findViewById(R.id.srlLayout);
        mRVAdapter = new CommonRVAdapter(mBeanList);
        mRVAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        mRecyclerView.setAdapter(mRVAdapter);
        mRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                doNetWork(false);
            }
        });
    }

    @Override
    protected void onLazyLoad() {
        doNetWork(false);
    }

    public static CommonFrag newInstance(String url) {
        Bundle bundle = new Bundle();
        bundle.putString("url", url);
        CommonFrag frag = new CommonFrag();
        frag.setArguments(bundle);
        return frag;
    }

    private void doNetWork(Boolean isLoadMore) {
        if (isLoadMore) {
            pageCount++;
        }
        JsoupUtil.get(url, 0, new ResponsCallBack() {
            @Override
            public void success(final List<ImageItemBean> data) {
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Log.e("TestTag", "CommonFrag-run: "+data.get(0));
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
