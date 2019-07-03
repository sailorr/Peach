package com.example.peach.net;

import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Administrator on2019/7/2 15:41
 * @desc
 */
public class FiveoneDetailJsoup {

    private ExecutorService mService;
    private ArrayList<String> urls ;
    private BigImageCallBack mCallBack;
    private int picCount;
    private String originalUrl;

    private FiveoneDetailJsoup() {
        mService = Executors.newCachedThreadPool();
    }

    private static class Holder {
        final static FiveoneDetailJsoup instance = new FiveoneDetailJsoup();
    }

    public static FiveoneDetailJsoup getInstance() {
        return Holder.instance;
    }

    public void get(final String url, final BigImageCallBack callBack) {
        this.mCallBack = callBack;
        originalUrl = url;
        urls = new ArrayList<>();
        mService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Document document = Jsoup.connect(url).get();
                    String nums = document.getElementsByClass("cf contentpage").select("span>i").text();
                    String[] strings = nums.split("/");
                    picCount = Integer.parseInt(strings[1].split("\\)")[0]);
                    Log.e("TestTag", "首先获取一共有多少页"+picCount);
                    get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void get() {
        Log.e("TestTag", "批量开启线程");
        for (int i = 1; i <= picCount; i++) {
            final int num = i;
            mService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        String url = originalUrl + "/" + num;
                        Document document = Jsoup.connect(url).get();
                        String imgUrl = document.getElementById("bigImg").attr("src");
                        urls.add(imgUrl);
                        Log.e("TestTag", "请求地址："+url+" name "+Thread.currentThread().getName()+" 图片地址"+imgUrl);
                        if (urls.size() == picCount) {
                            mCallBack.backImgs(urls);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.e("TestTag", "FiveoneDetailJsoup-run: "+e.getMessage());
                    }
                }
            });
        }
    }
}
