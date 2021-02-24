package com.example.peach.util;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.example.peach.R;

/**
 * -description:
 * -author: created by tang on 2021/2/24 16:04
 */
public enum GlideUtil {
    INSTANCE;

    RequestOptions mOptions;
    GlideUtil() {
        mOptions = new RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.anim_loading)
                .timeout(10*1000)
                .error(R.drawable.ic_beauty);
    }

    public void load(String url, ImageView imageView){
        Glide.with(imageView)
                .applyDefaultRequestOptions(mOptions)
                .load(url)
                .into(imageView);
    }
}
