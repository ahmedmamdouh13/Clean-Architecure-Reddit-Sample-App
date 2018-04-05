package com.example.ahmedmamdouh13.takenotesmvpstudy.di.component;

import com.example.ahmedmamdouh13.takenotesmvpstudy.di.module.PresentationModule;
import com.example.ahmedmamdouh13.takenotesmvpstudy.di.scope.PerActivity;
import com.example.ahmedmamdouh13.takenotesmvpstudy.mapper.PostModelViewMapper;
import com.example.ahmedmamdouh13.takenotesmvpstudy.mapper.PostModelViewMapperImpl;
import com.example.ahmedmamdouh13.takenotesmvpstudy.ui.MainActivity;
import com.example.ahmedmamdouh13.takenotesmvpstudy.ui.RedditActivity;
import com.example.ahmedmamdouh13.takenotesmvpstudy.ui.mvp.presenter.MainPresenter;
import com.example.ahmedmamdouh13.takenotesmvpstudy.ui.mvp.presenter.RedditPresenter;

/**
 * Created by ahmedmamdouh13 on 05/04/18.
 */
@PerActivity
@dagger.Component(modules = {PresentationModule.class})
public interface PresentationComponent {



    RedditPresenter redditPresenter();



    MainPresenter mainpresenter();
}
