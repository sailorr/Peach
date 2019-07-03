package com.example.peach.adapter;

import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.peach.ImageItemBean;
import com.example.peach.R;

import java.util.List;
import java.util.Random;

/**
 * @author Administrator on2019/6/10 15:18
 * @desc
 */
public class CommonRVAdapter extends BaseQuickAdapter<ImageItemBean, BaseViewHolder> {
    private List<ImageItemBean> mBeanList;
    private ImageView mImageView;
    private TextView mTextView;

    public CommonRVAdapter(@Nullable List<ImageItemBean> data) {
        super(R.layout.item_common_main, data);
        this.mBeanList = data;
    }

    @Override
    protected void convert(BaseViewHolder helper, ImageItemBean item) {
        ViewGroup.LayoutParams params = helper.itemView.getLayoutParams();
        params.height = 800 + new Random().nextInt(400);
        helper.itemView.setLayoutParams(params);
        mImageView = helper.itemView.findViewById(R.id.ivGirlImage);
        mTextView = helper.itemView.findViewById(R.id.tvImageTitle);
        mTextView.setText(item.getTitle());
        Glide.with(helper.itemView).load(item.getImgUrl()).apply(new RequestOptions().placeholder(R.drawable.ic_beauty)).into(mImageView);
    }

    public void replaceData(List<ImageItemBean> data) {
        if (data != mBeanList) {
            this.mBeanList.clear();
            this.mBeanList.addAll(data);
        }
        this.notifyDataSetChanged();
    }
}
