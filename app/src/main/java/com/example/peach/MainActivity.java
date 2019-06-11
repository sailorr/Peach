package com.example.peach;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.example.peach.adapter.PagerAdapter;
import com.example.peach.base.BaseActivity;
import com.example.peach.fragment.MeFrag;
import com.example.peach.fragment.ResourceFrag;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {


    private ViewPager mPager;
    private TabLayout mTabLayout;
    private PagerAdapter mAdapter;
    private List<Fragment> mList = new ArrayList<>();


    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {

        ResourceFrag resourceFrag = new ResourceFrag();
        MeFrag meFrag = new MeFrag();
        mList.add(resourceFrag);
        mList.add(meFrag);

        mPager = findViewById(R.id.pager);
        mTabLayout = findViewById(R.id.tab);

        mAdapter = new PagerAdapter(getSupportFragmentManager(), mList);
        mPager.setAdapter(mAdapter);
        mTabLayout.setupWithViewPager(mPager);
    }

    @Override
    public void doBusiness() {

    }

}
