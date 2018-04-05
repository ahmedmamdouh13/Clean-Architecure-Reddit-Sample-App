package com.example.data.component;


import com.example.data.module.RepositoryModule;
import com.example.data.repository.network.RedditRepositoryImpl;
import com.example.domain.module.InteractorModule;
import com.example.domain.repository.RedditRepository;

import javax.inject.Singleton;


/**
 * Created by ahmedmamdouh13 on 14/09/17.
 */

@Singleton
@dagger.Component(modules = { RepositoryModule.class})
public interface AppDataComponent {


}

