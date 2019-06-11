package com.example.peach.base;

/**
 * @author sailor
 * @description
 * @time 2018/11/15
 */
public interface IBaseView {


    int getLayoutResId();

    void init();

    void doBusiness();

    void showLoadingDialog();

    void hideLoadingDialog();


}
