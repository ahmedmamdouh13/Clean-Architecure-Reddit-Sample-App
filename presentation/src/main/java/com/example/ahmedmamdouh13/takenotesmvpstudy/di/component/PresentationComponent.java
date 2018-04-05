package com.example.ahmedmamdouh13.takenotesmvpstudy.di.component;

import com.example.ahmedmamdouh13.takenotesmvpstudy.di.module.PresentationModule;
import com.example.ahmedmamdouh13.takenotesmvpstudy.di.scope.PerActivity;
import com.example.ahmedmamdouh13.takenotesmvpstudy.mvp.presenter.RedditPresenter;

/**
 * Created by ahmedmamdouh13 on 05/04/18.
 */
@PerActivity
@dagger.Component(modules = {PresentationModule.class})
public interface PresentationComponent {

    RedditPresenter redditPresenter();
}
