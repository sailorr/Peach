package com.example.peach.util;

import android.support.v4.app.Fragment;

import com.example.peach.base.CommonFrag;
import com.example.peach.contant.WebType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator on2019/6/11 9:42
 * @desc
 */
public class CommonFragManager {

    private List<Fragment> mFragmentList;

    private CommonFragManager() {
        mFragmentList = new ArrayList<>();
    }

    public static CommonFragManager getInstance() {
        return CommonFragManagerHolder.instance;
    }

    private static class CommonFragManagerHolder {
        static CommonFragManager instance = new CommonFragManager();
    }

    public void buildCommonFrag(String url, WebType type) {
//        mFragmentList.add(CommonFrag.newInstance(url));
    }

    public List<Fragment> getFragmentList() {
        return mFragmentList;
    }
}
