package com.example.peach.net;

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
public class LinMeiMeiJsoup {


    public static void get(final String url, int count, final ResponsCallBack callBack) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Document document = Jsoup.connect(url).get();
                    //查找所有ul下面的li元素
                    Elements lis = document.select("ul>li");
                    List<ImageItemBean> itemBeans = new ArrayList<>();
                    for (Element element : lis) {
                        Element aElement = element.select("a").first();
                        String detail = LinMeiMeiUrl.BASE_URL +aElement.attr("href");
                        String src =  element.select("img").attr("data-original");
                        String title = aElement.attr("title");
                        if (!detail.equals("") && !title.equals("")) {
                            ImageItemBean itemBean = new ImageItemBean();
                            itemBean.setDetailUrl(detail);
                            itemBean.setImgUrl(src);
                            itemBean.setTitle(title);
                            itemBeans.add(itemBean);
                        }
                    }
                    callBack.success(itemBeans);
                } catch (IOException e) {
                    callBack.fail(e);
                }

            }
        }).start();
    }
}
