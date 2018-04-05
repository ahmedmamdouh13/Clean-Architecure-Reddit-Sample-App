package com.example.ahmedmamdouh13.takenotesmvpstudy.di.component;

import com.example.ahmedmamdouh13.takenotesmvpstudy.di.module.PresentationModule;
import com.example.ahmedmamdouh13.takenotesmvpstudy.mapper.PostModelViewMapper;
import com.example.ahmedmamdouh13.takenotesmvpstudy.ui.MainActivity;
import com.example.ahmedmamdouh13.takenotesmvpstudy.ui.RedditActivity;
import com.example.ahmedmamdouh13.takenotesmvpstudy.application.mApplication;
import com.example.ahmedmamdouh13.takenotesmvpstudy.di.module.AppModule;
import com.example.ahmedmamdouh13.takenotesmvpstudy.ui.mvp.presenter.MainPresenter;
import com.example.domain.repository.RedditRepository;
import com.example.domain.interactor.GetRedditInteractor;
import com.example.domain.interactor.SavePostInteractor;

import javax.inject.Singleton;


/**
 * Created by ahmedmamdouh13 on 14/09/17.
 */

@Singleton
@dagger.Component(modules = {AppModule.class})
public interface Component{

    void inject(RedditActivity redditActivity);
    void inject(MainActivity activity);
    void inject(mApplication application);


    GetRedditInteractor providesGetRedditUseCase();




    SavePostInteractor providesSavePostUseCase();



    RedditRepository redditRepos();





}

