package com.example.ahmedmamdouh13.takenotesmvpstudy.application;

import android.app.Application;

import com.example.ahmedmamdouh13.takenotesmvpstudy.di.component.DaggerComponent;
import com.example.ahmedmamdouh13.takenotesmvpstudy.di.module.AppModule;
import com.example.ahmedmamdouh13.takenotesmvpstudy.di.component.Component;

import timber.log.Timber;

/**
 * Created by ahmedmamdouh13 on 14/09/17.
 */

public class mApplication extends Application {

    private Component component;


        @Override
        public void onCreate() {
            super.onCreate();
            initDagger();
            Timber.plant(new Timber.DebugTree());
        }

    private void initDagger() {


        component= DaggerComponent.builder()
                .appModule(new AppModule(this))
                .build();

        component.inject(this);
    }


    public Component getComponent() {
        return component;
    }

    @Override
        public void onTerminate() {
            super.onTerminate();
        }


}
