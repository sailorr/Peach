package com.example.peach.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.example.peach.adapter.LinMeiMeiPagerAdapter;
import com.example.peach.base.WebBaseActivity;
import com.example.peach.contant.LinMeiMeiUrl;
import com.example.peach.fragment.LinMeiMeiFrag;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator on2019/6/10 11:09
 * @desc
 */
public class LinMeiMeiActivity extends WebBaseActivity {
    private LinMeiMeiPagerAdapter mLinMeiMeiPagerAdapter;
    private List<Fragment> mList = new ArrayList<>();

    @Override
    public void init() {
        mList.add(LinMeiMeiFrag.newInstance(LinMeiMeiUrl.QIAOTUN));
        mList.add(LinMeiMeiFrag.newInstance(LinMeiMeiUrl.MEITUN));
        mList.add(LinMeiMeiFrag.newInstance(LinMeiMeiUrl.MEIRU));
        mList.add(LinMeiMeiFrag.newInstance(LinMeiMeiUrl.DANAI));
        mList.add(LinMeiMeiFrag.newInstance(LinMeiMeiUrl.YUSHI));
        mList.add(LinMeiMeiFrag.newInstance(LinMeiMeiUrl.SHISHEN));
        mList.add(LinMeiMeiFrag.newInstance(LinMeiMeiUrl.BAORU));
        mList.add(LinMeiMeiFrag.newInstance(LinMeiMeiUrl.DINGZIKU));
        mList.add(LinMeiMeiFrag.newInstance(LinMeiMeiUrl.QIPAO));
        mList.add(LinMeiMeiFrag.newInstance(LinMeiMeiUrl.LUOLI));
        mList.add(LinMeiMeiFrag.newInstance(LinMeiMeiUrl.NVPU));
        mList.add(LinMeiMeiFrag.newInstance(LinMeiMeiUrl.SHAOFU));
        mList.add(LinMeiMeiFrag.newInstance(LinMeiMeiUrl.SIWA));
        mList.add(LinMeiMeiFrag.newInstance(LinMeiMeiUrl.MEITUI));
        mList.add(LinMeiMeiFrag.newInstance(LinMeiMeiUrl.XUESHENGMEI));
        mList.add(LinMeiMeiFrag.newInstance(LinMeiMeiUrl.GAOGENXIE));
        Log.e("TestTag", "LinMeiMeiActivity-init: " + mList.size());
        mLinMeiMeiPagerAdapter = new LinMeiMeiPagerAdapter(getSupportFragmentManager(), mList);
        super.init();
    }

    @Override
    protected FragmentPagerAdapter initAdapter() {
        return mLinMeiMeiPagerAdapter;
    }

    @Override
    protected String setTitle() {
        return "林妹妹";
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, LinMeiMeiActivity.class);
        context.startActivity(starter);
    }
}
