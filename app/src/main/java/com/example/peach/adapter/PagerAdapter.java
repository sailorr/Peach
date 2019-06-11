package com.example.peach.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @author Administrator on2019/6/10 9:30
 * @desc
 */
public class PagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mList;

    public PagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.mList = fragmentList;
    }

    @Override
    public Fragment getItem(int i) {
        return mList.get(i);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "首页";
            case 1:
                return "我的";
            default:
                return "";
        }
    }

    @Override
    public int getCount() {
        return mList.size();
    }
}
