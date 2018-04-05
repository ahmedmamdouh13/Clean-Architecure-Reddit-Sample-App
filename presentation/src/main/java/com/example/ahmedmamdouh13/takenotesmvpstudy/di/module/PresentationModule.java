package com.example.ahmedmamdouh13.takenotesmvpstudy.di.module;

import com.example.ahmedmamdouh13.takenotesmvpstudy.di.scope.PerActivity;
import com.example.ahmedmamdouh13.takenotesmvpstudy.mapper.PostModelViewMapper;
import com.example.ahmedmamdouh13.takenotesmvpstudy.mapper.PostModelViewMapperImpl;
import com.example.ahmedmamdouh13.takenotesmvpstudy.ui.mvp.presenter.MainPresenter;
import com.example.ahmedmamdouh13.takenotesmvpstudy.ui.mvp.presenter.RedditPresenter;

import javax.inject.Singleton;

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

    @Provides
    @PerActivity
    MainPresenter providesMainPresenter() {
        return new MainPresenter();
    }

//    @Provides
//    @PerActivity
//    PostModelViewMapperImpl providesModelViewMapper(PostModelViewMapperImpl modelViewMapper) {
//        return new PostModelViewMapperImpl();
//    }

}
