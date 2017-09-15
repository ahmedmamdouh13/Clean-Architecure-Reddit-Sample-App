package com.example.ahmedmamdouh13.takenotesmvpstudy;

import android.app.Application;
import android.content.Context;



import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by ahmedmamdouh13 on 14/09/17.
 */

@Module
public class AppModule {

    Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Context providesApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    MainModelDataBase Database(){
        return new MainModelDataBase();
    }

    @Provides
    @Singleton
    RetrofitService retrofitInstance(){
        return RetrofitInstance.getRetrofitinstance().create(RetrofitService.class);
    }

}