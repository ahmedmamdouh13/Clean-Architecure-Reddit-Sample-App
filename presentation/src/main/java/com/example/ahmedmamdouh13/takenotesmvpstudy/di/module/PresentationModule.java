package com.example.ahmedmamdouh13.takenotesmvpstudy.di.module;

import com.example.ahmedmamdouh13.takenotesmvpstudy.di.scope.PerActivity;
import com.example.ahmedmamdouh13.takenotesmvpstudy.mvp.presenter.RedditPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ahmedmamdouh13 on 05/04/18.
 */

@Module
public class PresentationModule {

    @Provides
    @PerActivity
    RedditPresenter getRedditPresenter(){
        return new RedditPresenter();
    }
}
