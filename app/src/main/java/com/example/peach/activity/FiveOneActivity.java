package com.example.peach.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.peach.adapter.FiveOnePagerAdapter;
import com.example.peach.base.WebBaseActivity;
import com.example.peach.contant.FiveOneUrl;
import com.example.peach.fragment.FiveOneFrag;

import java.util.ArrayList;
import java.util.List;

public class FiveOneActivity extends WebBaseActivity {
    private FiveOnePagerAdapter mFiveOnePagerAdapter;
    private List<Fragment> mList = new ArrayList<>();

    @Override
    protected FragmentPagerAdapter initAdapter() {
        mList.add(FiveOneFrag.newInstance(FiveOneUrl.ROSI));
        mList.add(FiveOneFrag.newInstance(FiveOneUrl.SHAOFU));
        mList.add(FiveOneFrag.newInstance(FiveOneUrl.FEITUN));
        mList.add(FiveOneFrag.newInstance(FiveOneUrl.LEISI));
        mList.add(FiveOneFrag.newInstance(FiveOneUrl.LUBAO));
        mList.add(FiveOneFrag.newInstance(FiveOneUrl.MEIYUANGUAN));
        mList.add(FiveOneFrag.newInstance(FiveOneUrl.MEITUN));
        mList.add(FiveOneFrag.newInstance(FiveOneUrl.TONGYANJURU));
        mList.add(FiveOneFrag.newInstance(FiveOneUrl.YOUHUO));
        mList.add(FiveOneFrag.newInstance(FiveOneUrl.SHISHEN));
        mList.add(FiveOneFrag.newInstance(FiveOneUrl.XINGGAN));
        mList.add(FiveOneFrag.newInstance(FiveOneUrl.PANJIAOJIAO));
        mFiveOnePagerAdapter = new FiveOnePagerAdapter(getSupportFragmentManager(), mList);
        return mFiveOnePagerAdapter;
    }

    @Override
    protected String setTitle() {
        return "51";
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, FiveOneActivity.class);
        context.startActivity(starter);
    }
}
