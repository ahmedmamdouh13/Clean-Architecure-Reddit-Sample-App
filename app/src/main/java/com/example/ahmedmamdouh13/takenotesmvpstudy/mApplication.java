package com.example.ahmedmamdouh13.takenotesmvpstudy;

import android.app.Application;

import com.orm.SugarContext;

import timber.log.Timber;

/**
 * Created by ahmedmamdouh13 on 14/09/17.
 */

public class mApplication extends Application {

    private Component component;


        @Override
        public void onCreate() {
            super.onCreate();
            SugarContext.init(this);
            initDagger();
            Timber.plant(new Timber.DebugTree());
        }

    private void initDagger() {


        component=DaggerComponent.builder()
                .appModule(new AppModule(this)).build();

        component.inject(this);
        component.inject(this);


    }


    public Component getComponent() {
        return component;
    }

    @Override
        public void onTerminate() {
            super.onTerminate();
            SugarContext.terminate();
        }


}
