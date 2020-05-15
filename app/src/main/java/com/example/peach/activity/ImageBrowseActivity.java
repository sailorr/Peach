package com.example.peach.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.example.peach.R;
import com.example.peach.base.BaseActivity;
import com.example.peach.base.BigImageFragment;
import com.example.peach.net.BigImageCallBack;
import com.example.peach.net.FiveoneDetailJsoup;

import java.util.ArrayList;

public class ImageBrowseActivity extends BaseActivity implements BigImageCallBack {
    public ViewPager mPager;
    public ArrayList<String> mUrls = new ArrayList<>();
    private String url;
    public MeiziPagerAdapter mAdapter;


    @Override
    public int getLayoutResId() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);//remove title bar  即隐藏标题栏
        getSupportActionBar().hide();// 隐藏ActionBar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//remove notification bar  即全屏
        return R.layout.activity_image_browse;
    }

    @Override
    public void init() {
        mPager = findViewById(R.id.pager);
        url = getIntent().getStringExtra("url");
        mAdapter = new MeiziPagerAdapter(getSupportFragmentManager());
        mPager.setOffscreenPageLimit(5);
        mPager.setAdapter(mAdapter);
    }


    @Override
    public void doBusiness() {
        showLoadingDialog();
        FiveoneDetailJsoup.getInstance().get(url, this);
    }

    public static void start(Context context, String url) {
        Intent starter = new Intent(context, ImageBrowseActivity.class);
        starter.putExtra("url", url);
        context.startActivity(starter);
    }

    @Override
    public void backImgs(final ArrayList<String> list) {
        Log.e("TestTag", "ImageBrowseActivity-backImgs: " + list.toString());
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mUrls = list;
                mAdapter.notifyDataSetChanged();
                hideLoadingDialog();
            }
        });
    }

    public class MeiziPagerAdapter extends FragmentStatePagerAdapter {

        public MeiziPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return BigImageFragment.newInstance(mUrls.get(i));
        }

        @Override
        public int getCount() {
            return mUrls.size();
        }
    }

}
