package com.example.ahmedmamdouh13.takenotesmvpstudy;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by ahmedmamdouh13 on 14/09/17.
 */

@Singleton
@dagger.Component(modules = AppModule.class)
public interface Component {

    void inject(MainActivity activity);
    void inject(mApplication application);
    void inject(RedditActivity redditActivity);
    void inject(RedditPresenter redditPresenter);
    void inject(MainPresenter mainPresenter);


}
