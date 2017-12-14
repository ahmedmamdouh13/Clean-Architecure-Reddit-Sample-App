package com.example.ahmedmamdouh13.takenotesmvpstudy;

import android.content.Context;

/**
 * Created by ahmedmamdouh13 on 13/12/17.
 */

public class BasePresenter<T> {

    private T view;
    private Context context;

    public BasePresenter(){

    }

    public void bind(T view){
        this.view=view;
    }
    public void bind(T view, Context context) {
        this.view=view;
        this.context=context;
    }


    public T getView() {
        return view;
    }




    public Context getContext() {
        return context;
    }
}
