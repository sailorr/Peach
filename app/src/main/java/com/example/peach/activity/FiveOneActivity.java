package com.example.peach.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.peach.adapter.FiveOnePagerAdapter;
import com.example.peach.base.CommonFrag;
import com.example.peach.base.WebBaseActivity;
import com.example.peach.contant.LinMeiMeiUrl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator on2019/6/10 11:09
 * @desc
 */
public class FiveOneActivity extends WebBaseActivity {
    private FiveOnePagerAdapter mFiveOnePagerAdapter;
    private List<Fragment> mList = new ArrayList<>();

    @Override
    public void init() {
        CommonFrag frag1 = CommonFrag.newInstance(LinMeiMeiUrl.QIAOTUN);
        CommonFrag frag2 = CommonFrag.newInstance(LinMeiMeiUrl.DANAI);
        CommonFrag frag3 = CommonFrag.newInstance(LinMeiMeiUrl.MEITUN);
        CommonFrag frag4 = CommonFrag.newInstance(LinMeiMeiUrl.MEIRU);
        CommonFrag frag10= CommonFrag.newInstance(LinMeiMeiUrl.YUSHI);
        CommonFrag frag11= CommonFrag.newInstance(LinMeiMeiUrl.SHISHEN);
        CommonFrag frag5= CommonFrag.newInstance(LinMeiMeiUrl.SHAOFU);
        CommonFrag frag6= CommonFrag.newInstance(LinMeiMeiUrl.BAORU);
        CommonFrag frag7= CommonFrag.newInstance(LinMeiMeiUrl.LUOLI);
        CommonFrag frag8= CommonFrag.newInstance(LinMeiMeiUrl.GAOGENXIE);
        CommonFrag frag9= CommonFrag.newInstance(LinMeiMeiUrl.SIWA);

        CommonFrag frag12= CommonFrag.newInstance(LinMeiMeiUrl.MEITUI);
        CommonFrag frag13= CommonFrag.newInstance(LinMeiMeiUrl.QIPAO);
        CommonFrag frag14= CommonFrag.newInstance(LinMeiMeiUrl.NVPU);
        CommonFrag frag15= CommonFrag.newInstance(LinMeiMeiUrl.DINGZIKU);
        CommonFrag frag16= CommonFrag.newInstance(LinMeiMeiUrl.XUESHENGMEI);
        mList.add(frag1);
        mList.add(frag2);
        mList.add(frag3);
        mList.add(frag4);
        mList.add(frag5);
        mList.add(frag6);
        mList.add(frag7);
        mList.add(frag8);
        mList.add(frag9);
        mList.add(frag10);
        mList.add(frag11);
        mList.add(frag12);
        mList.add(frag13);
        mList.add(frag14);
        mList.add(frag15);
        mList.add(frag16);
        mFiveOnePagerAdapter = new FiveOnePagerAdapter(getSupportFragmentManager(), mList);
        super.init();
    }

    @Override
    protected FragmentPagerAdapter initAdapter() {
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
