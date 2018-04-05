package com.example.ahmedmamdouh13.takenotesmvpstudy.di.module;

import android.app.Application;
import android.content.Context;


import com.example.ahmedmamdouh13.takenotesmvpstudy.mvp.presenter.MainPresenter;
import com.example.ahmedmamdouh13.takenotesmvpstudy.mvp.presenter.RedditPresenter;
import com.example.data.repository.network.RedditRepositoryImpl;
import com.example.domain.repository.RedditRepository;
import com.example.domain.usecase.GetRedditInteractor;
import com.example.domain.usecase.GetRedditUseCase;
import com.example.domain.usecase.SavePostInteractor;
import com.example.domain.usecase.SavePostUseCase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;

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
    RedditPresenter providesRedditPresenter(){
        return new RedditPresenter();
    }

    @Provides
    @Singleton
    MainPresenter providesMainPresenter() {
        return new MainPresenter();
    }

    @Provides
    @Singleton
    Scheduler androidSchedulers(){
        return AndroidSchedulers.mainThread();
    }

//    @Provides
//    @Singleton
//    SavePostUseCase providesSavePostUseCase(){
//        return new SavePostUseCase();
//    }
@Provides
@Singleton
GetRedditInteractor providesGetRedditUseCase(){
    return new GetRedditUseCase();
}

    @Provides
    @Singleton
    SavePostInteractor providesSavePostUseCase(SavePostUseCase savePostUseCase){
      return   savePostUseCase;
    }

    @Provides
    @Singleton
    RedditRepository exampleRepository(RedditRepositoryImpl redditRepository){
        return redditRepository;
    }

}