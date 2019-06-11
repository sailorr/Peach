package com.example.peach.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @author Administrator on2019/6/10 11:46
 * @desc
 */
public class FiveOnePagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> mList;
    private String[] mStrings = {"翘臀", "大奶", "美腿","美乳","浴室","湿身","少妇","爆乳","萝莉","高跟鞋","丝袜","美腿","旗袍","女仆","丁字裤","学生妹"};

    public FiveOnePagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.mList = fragmentList;
    }

    @Override
    public Fragment getItem(int i) {
        return mList.get(i);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mStrings[position];
    }
}
