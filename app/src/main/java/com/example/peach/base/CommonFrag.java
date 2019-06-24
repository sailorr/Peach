package com.example.peach.base;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.peach.ImageItemBean;
import com.example.peach.R;
import com.example.peach.adapter.CommonRVAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator on2019/6/10 14:31
 * @desc
 */
public class CommonFrag extends BaseFragment {
    private RecyclerView mRecyclerView;
    public SwipeRefreshLayout mRefreshLayout;
    public CommonRVAdapter mRVAdapter;
    private List<ImageItemBean> mBeanList = new ArrayList<>();

    public String url;
    private String name;

    @Override
    protected int getLayoutResId() {
        return R.layout.frag_common_main;
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

        mRVAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                doNetWork(true);
            }
        }, mRecyclerView);
    }

    @Override
    protected void onLazyLoad() {
        doNetWork(false);
    }


    protected void doNetWork(Boolean isLoadMore) {
    }
}
