package com.example.peach.net;

import com.example.peach.ImageItemBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator on2019/6/10 15:33
 * @desc
 */
public interface ResponsCallBack {
    void success(List<ImageItemBean> data);

    void fail(Exception e);
}
