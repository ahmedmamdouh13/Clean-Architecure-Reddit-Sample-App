package com.example.ahmedmamdouh13.takenotesmvpstudy.base;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by ahmedmamdouh13 on 13/12/17.
 */

public class BasePresenter<T> {

    private T view;

    private Context context;

    @Inject
    public BasePresenter(){

    }

    public void bind(T view){
        this.view=view;
    }
    public void bindContext(Context context) {
        this.context=context;
    }


    public T getView() {
        return view;
    }




    public Context getContext() {
        return context;
    }
}
