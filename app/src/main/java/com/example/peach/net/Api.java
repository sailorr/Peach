package com.example.peach.net;


import com.example.peach.pojo.ImageResp;
import com.example.peach.pojo.SuitResp;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * -description:
 * -author: created by tang on 2020/5/11 17:10
 */
public interface Api {

    @GET("/suit")
    Observable<SuitResp> getSuit(@Query("page")  int page, @Query("type") int type);

    @GET("/image")
    Observable<ImageResp> getImage(@Query("suitId") int id);
}
