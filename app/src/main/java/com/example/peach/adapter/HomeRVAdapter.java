package com.example.peach.adapter;

import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.peach.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator on2019/6/10 10:37
 * @desc
 */
public class HomeRVAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    private List<String> mList = new ArrayList<>();

    public HomeRVAdapter( @Nullable List<String> data) {
        super(R.layout.item_rv_home, data);
        this.mList = data;
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        Log.d("HomeRVAdapter", "convert: ");

        helper.setText(R.id.item_tv_title,item);
    }
}
