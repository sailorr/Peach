package com.example.peach.base;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.peach.R;
import com.example.peach.widget.TitleTabView;

/**
 * @author Administrator on2019/6/10 11:32
 * @desc
 */
public abstract class WebBaseActivity extends BaseActivity {

    private TitleTabView mTitleTabView;
    private ViewPager mViewPager;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_webbase;
    }

    @Override
    public void init() {
        mTitleTabView = findViewById(R.id.title_tab);
        mViewPager = findViewById(R.id.webBase_pager);
        mViewPager.setAdapter(initAdapter());
        mTitleTabView.mTextView.setText(setTitle());
        mTitleTabView.mLayout.setupWithViewPager(mViewPager);
    }

    @Override
    public void doBusiness() {
    }


    protected abstract FragmentPagerAdapter initAdapter();

    protected abstract String setTitle();


}
