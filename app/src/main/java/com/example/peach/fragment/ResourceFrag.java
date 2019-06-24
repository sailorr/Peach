package com.example.peach.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.peach.R;
import com.example.peach.activity.FiveOneActivity;
import com.example.peach.activity.LinMeiMeiActivity;
import com.example.peach.adapter.HomeRVAdapter;
import com.example.peach.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator on2019/6/10 10:05
 * @desc
 */
public class ResourceFrag extends BaseFragment {
    private RecyclerView mRecyclerView;
    private List<String> mListWeb = new ArrayList<>();
    private HomeRVAdapter mRVAdapter;

    @Override
    protected void onLazyLoad() {

    }

    @Override
    public int getLayoutResId() {
        return R.layout.frag_resource;
    }



    @Override
    protected void init(View view) {
        mListWeb.add("林妹妹");
        mListWeb.add("51");
        mListWeb.add("煎蛋");
        mListWeb.add("豆瓣");
        mListWeb.add("美图");
        mRecyclerView = view.findViewById(R.id.rv_home);
        mRVAdapter = new HomeRVAdapter(mListWeb);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        mRecyclerView.setAdapter(mRVAdapter);

        mRVAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                switch (position) {
                    case 0:
                        LinMeiMeiActivity.start(getActivity());
                        break;
                    case 1:
                        FiveOneActivity.start(getActivity());
                        break;
                }
            }
        });

    }
}
