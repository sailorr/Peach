package com.example.peach.fragment;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.peach.ImageItemBean;
import com.example.peach.R;
import com.example.peach.activity.MyImageBrowseActivity;
import com.example.peach.adapter.CommonRVAdapter;
import com.example.peach.base.BaseFragment;
import com.example.peach.net.Api;
import com.example.peach.pojo.SuitResp;
import com.example.peach.pojo.bean.SuitBean;
import com.sailor.net.retrofit.RetrofitManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * @author Administrator on2019/6/11 10:22
 * @desc
 */
public class MyImageFrag extends BaseFragment {
    private int pageCount = 1;
    private RecyclerView mRecyclerView;
    public SwipeRefreshLayout mRefreshLayout;
    public CommonRVAdapter mRVAdapter;
    private List<ImageItemBean> mBeanList = new ArrayList<>();

    public int type;

    public static MyImageFrag newInstance(int type) {
        Bundle bundle = new Bundle();
        bundle.putInt("type", type);
        MyImageFrag frag = new MyImageFrag();
        frag.setArguments(bundle);
        return frag;
    }


    @Override
    protected int getLayoutResId() {
        return R.layout.frag_common_main;
    }

    final Random random = new Random();

    @Override
    protected void init(View view) {
        type = getArguments().getInt("type");
        mRecyclerView = view.findViewById(R.id.rvList);
        mRefreshLayout = view.findViewById(R.id.srlLayout);
        mRVAdapter = new CommonRVAdapter(mBeanList);
        mRVAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        mRecyclerView.setAdapter(mRVAdapter);

        mRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                currentPage=1;
                doNetWork(true, getPage());
            }
        });

        mRVAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                currentPage++;
                doNetWork(false, currentPage);
            }
        }, mRecyclerView);
        mRVAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Log.w("Test", "onItemClick: suitId--->" + mBeanList.get(position).getDetailUrl());
                MyImageBrowseActivity.start(getContext(), mBeanList.get(position).getDetailUrl());
            }
        });
    }

    private int currentPage = 1;

    public int getPage() {
        if (totalPage > 1) {
            currentPage = random.nextInt(totalPage / 10 - 1) + 1;
            return currentPage;
        }
        return currentPage;
    }

    @Override
    protected void onLazyLoad() {
        doNetWork(true, 1);
    }

    private int totalPage;

    private void doNetWork(final boolean clear, int pageCount) {
        Log.d("MyImageFrag", "doNetWork: pageCount-->" + pageCount);
        hideLoadingDialog();
        RetrofitManager.getInstance().getServer(Api.class)
                .getSuit(pageCount, type)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<SuitResp>() {
                    @Override
                    public void accept(SuitResp suitResp) throws Exception {
                        totalPage = suitResp.getData().getTotal();
                        Log.d("MyImageFrag", "accept: " + totalPage);
                        if (clear){
                            mBeanList.clear();
                        }
                        mBeanList.addAll(convert(suitResp.getData().getList()));
                        mRVAdapter.notifyDataSetChanged();
                        if (suitResp.getData().isIsLastPage()) {
                            mRVAdapter.loadMoreEnd();
                        } else {
                            mRVAdapter.loadMoreComplete();
                        }
                        mRefreshLayout.setRefreshing(false);
                    }
                });
    }

    private List<ImageItemBean> convert(List<SuitBean> suitBeans) {
        List<ImageItemBean> imageItemBeans = new ArrayList<>();
        for (int i = 0; i < suitBeans.size(); i++) {
            ImageItemBean imageItemBean = new ImageItemBean();
            SuitBean suitBean = suitBeans.get(i);
            imageItemBean.setDetailUrl(String.valueOf(suitBean.getId()));
            imageItemBean.setTitle(suitBean.getSuit_name());
            imageItemBean.setImgUrl(suitBean.getThumb_url());
            imageItemBeans.add(imageItemBean);
        }
        return imageItemBeans;
    }
}
