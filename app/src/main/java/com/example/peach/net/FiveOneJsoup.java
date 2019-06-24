package com.example.peach.net;

import android.util.Log;

import com.example.peach.ImageItemBean;
import com.example.peach.contant.LinMeiMeiUrl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator on2019/6/10 15:33
 * @desc
 */
public class FiveOneJsoup {


    public static void get(final String url, int count, final ResponsCallBack callBack) {
        Log.e("TestTag", "FiveOneJsoup-get: ");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Document document = Jsoup.connect(url).get();
                    //查找所有ul下面的li元素
                    Elements lis = document.select("ul>li");
                    Elements divs = lis.select("li>div.libox");

                    List<ImageItemBean> itemBeans = new ArrayList<>();
                    for (Element div : divs) {
                        ImageItemBean itemBean = new ImageItemBean();
                        String detail = div.select("a").attr("href");
                        String src = div.select("a>img").attr("data-original");
                        String title = div.select("a>img").attr("alt");
                        itemBean.setDetailUrl(detail);
                        itemBean.setImgUrl(src);
                        itemBean.setTitle(title);
                        itemBeans.add(itemBean);
                    }
                    Log.e("TestTag", "FiveOneJsoup-run: itemBeans size"+itemBeans.size()+" itemBean"+itemBeans.get(0).toString());
                    callBack.success(itemBeans);
                } catch (IOException e) {
                    callBack.fail(e);
                }

            }
        }).start();
    }
}
