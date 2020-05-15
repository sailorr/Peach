package com.example.peach.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.peach.adapter.LinMeiMeiPagerAdapter;
import com.example.peach.adapter.MyPagerAdapter;
import com.example.peach.base.WebBaseActivity;
import com.example.peach.fragment.MyImageFrag;

import java.util.ArrayList;
import java.util.List;

/**
 * -description:
 * -author: created by tang on 2020/5/14 16:45
 */
public class MyImageActivity extends WebBaseActivity {
    private MyPagerAdapter myPagerAdapter;
    private List<Fragment> mList = new ArrayList<>();

    @Override
    public void init() {
        mList.add(MyImageFrag.newInstance(1));
        mList.add(MyImageFrag.newInstance(2));
        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), mList);
        super.init();
    }


    @Override
    protected FragmentPagerAdapter initAdapter() {
        return myPagerAdapter;
    }

    @Override
    protected String setTitle() {
        return "后台";
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, MyImageActivity.class);
        context.startActivity(starter);
    }
}
