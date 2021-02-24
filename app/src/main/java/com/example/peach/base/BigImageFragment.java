package com.example.peach.base;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.example.peach.R;
import com.example.peach.util.GlideUtil;
import com.example.peach.widget.PhotoImageView;

/**
 * @author Administrator on2019/7/3 10:49
 * @desc
 */
public class BigImageFragment extends BaseFragment {
    private PhotoImageView mImageView;
    private String url;

    public static BigImageFragment newInstance(String url) {
        BigImageFragment bigImageFragment = new BigImageFragment();
        Bundle mBundle = new Bundle();
        mBundle.putString("url", url);
        bigImageFragment.setArguments(mBundle);
        return bigImageFragment;
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.frag_bigimage;
    }

    @Override
    protected void init(View view) {
        mImageView = view.findViewById(R.id.photo_img);
        url = getArguments().getString("url");
        Log.e("TestTag", "BigImageFragment-init: "+url);
        GlideUtil.INSTANCE.load(url,mImageView);
    }

    @Override
    protected void onLazyLoad() {

    }
}
