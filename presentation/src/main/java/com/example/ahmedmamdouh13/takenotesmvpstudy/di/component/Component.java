package com.example.ahmedmamdouh13.takenotesmvpstudy.di.component;

import com.example.ahmedmamdouh13.takenotesmvpstudy.module.MainActivity;
import com.example.ahmedmamdouh13.takenotesmvpstudy.module.RedditActivity;
import com.example.ahmedmamdouh13.takenotesmvpstudy.application.mApplication;
import com.example.ahmedmamdouh13.takenotesmvpstudy.di.module.AppModule;
import com.example.ahmedmamdouh13.takenotesmvpstudy.mvp.presenter.MainPresenter;
import com.example.ahmedmamdouh13.takenotesmvpstudy.mvp.presenter.RedditPresenter;
import com.example.data.component.AppDataComponent;
import com.example.data.module.RepositoryModule;
import com.example.data.repository.network.RedditRepositoryImpl;
import com.example.domain.component.AppDomainComponent;
import com.example.domain.model.Posts;
import com.example.domain.module.InteractorModule;
import com.example.domain.repository.RedditRepository;
import com.example.domain.usecase.GetRedditInteractor;
import com.example.domain.usecase.GetRedditUseCase;
import com.example.domain.usecase.SavePostInteractor;
import com.example.domain.usecase.SavePostUseCase;
import com.example.domain.usecase.UseCase;

import javax.inject.Singleton;


/**
 * Created by ahmedmamdouh13 on 14/09/17.
 */

@Singleton
@dagger.Component(modules = {AppModule.class, RepositoryModule.class})
public interface Component extends AppDataComponent {

    void inject(MainActivity activity);
    void inject(mApplication application);
    void inject(RedditActivity redditActivity);

    GetRedditInteractor providesGetRedditUseCase();



    SavePostInteractor providesSavePostUseCase();

    RedditPresenter redditPresenter();

    RedditRepository redditRepos();

    MainPresenter mainpresenter();



}

