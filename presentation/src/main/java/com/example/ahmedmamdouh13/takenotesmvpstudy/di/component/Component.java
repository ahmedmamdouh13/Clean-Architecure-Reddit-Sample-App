package com.example.ahmedmamdouh13.takenotesmvpstudy.di.component;

import com.example.ahmedmamdouh13.takenotesmvpstudy.module.MainActivity;
import com.example.ahmedmamdouh13.takenotesmvpstudy.module.RedditActivity;
import com.example.ahmedmamdouh13.takenotesmvpstudy.application.mApplication;
import com.example.ahmedmamdouh13.takenotesmvpstudy.di.module.AppModule;
import com.example.ahmedmamdouh13.takenotesmvpstudy.mvp.presenter.MainPresenter;
import com.example.domain.repository.RedditRepository;
import com.example.domain.usecase.GetRedditInteractor;
import com.example.domain.usecase.SavePostInteractor;

import javax.inject.Singleton;


/**
 * Created by ahmedmamdouh13 on 14/09/17.
 */

@Singleton
@dagger.Component(modules = {AppModule.class})
public interface Component {

    void inject(MainActivity activity);
    void inject(mApplication application);
    void inject(RedditActivity redditActivity);

    GetRedditInteractor providesGetRedditUseCase();



    SavePostInteractor providesSavePostUseCase();

  //  RedditPresenter redditPresenter();

    RedditRepository redditRepos();

    MainPresenter mainpresenter();



}

