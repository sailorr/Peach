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
    private String[] mStrings = {"ROSI","少妇","肥臀","蕾丝","芦苞","美媛馆","美臀","童颜巨乳",
            "诱惑","湿身","性感","潘娇娇"};

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
