package com.example.ahmedmamdouh13.takenotesmvpstudy.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.ahmedmamdouh13.takenotesmvpstudy.application.mApplication;
import com.example.ahmedmamdouh13.takenotesmvpstudy.di.component.Component;

import timber.log.Timber;

/**
 * Created by ahmedmamdouh13 on 13/12/17.
 */

public abstract class BaseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        onViewCreated(savedInstanceState);
        Timber.d("here base");

    }



    protected abstract void initDagger();

    protected Component getDaggerComponent() {
       return  ((mApplication)getApplication()).getComponent();
    }

    protected abstract int getContentView();

    @CallSuper
  protected void onViewCreated(@Nullable Bundle savedInstanceState){
    }
}
