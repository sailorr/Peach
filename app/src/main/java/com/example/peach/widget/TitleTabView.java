package com.example.peach.widget;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.peach.R;

/**
 * @author Administrator on2019/6/10 11:19
 * @desc
 */
public class TitleTabView extends LinearLayout {
    public TabLayout mLayout;
    public TextView mTextView;

    public TitleTabView(Context context) {
        this(context, null);
    }

    public TitleTabView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.widget_titletab, this);
        init();
    }

    private void init() {
        mTextView = findViewById(R.id.titleTab_tv_title);
        mLayout = findViewById(R.id.titleTab_tab);
    }


}
