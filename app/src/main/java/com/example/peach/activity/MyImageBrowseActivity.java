package com.example.peach.activity;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.example.peach.net.Api;
import com.example.peach.pojo.ImageResp;
import com.example.peach.pojo.bean.ImageBean;
import com.sailor.net.retrofit.RetrofitManager;

import java.util.ArrayList;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * -description:
 * -author: created by tang on 2020/5/14 17:45
 */
public class MyImageBrowseActivity extends ImageBrowseActivity {

    private int suitid;

    @Override
    public void init() {
        super.init();
        suitid = Integer.parseInt(getIntent().getStringExtra("suitId"));
        Log.w("Test", "init: MyImageBrowseActivity---->"+suitid);
    }

    @Override
    public void doBusiness() {
        RetrofitManager.getInstance().getServer(Api.class)
                .getImage(suitid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ImageResp>() {
                    @Override
                    public void accept(ImageResp imageResp) throws Exception {
                        for (int i = 0; i <(imageResp.getData().size()) ; i++) {
                            ImageBean imageBean = imageResp.getData().get(i);
                            mUrls.add(imageBean.getImg_url());
                        }
                        Toast.makeText(getBaseContext(),"数量:"+mUrls.size(),1).show();
                        mAdapter.notifyDataSetChanged();
                        hideLoadingDialog();
                    }
                });
    }

    public static void start(Context context,String suitid) {
        Log.w("Test", "start : suitId--->"+suitid);
        Intent starter = new Intent(context, MyImageBrowseActivity.class);
        starter.putExtra("suitId",suitid);
        context.startActivity(starter);
    }


}
