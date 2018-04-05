package com.example.domain.component;


import com.example.domain.interactor.Interactor;
import com.example.domain.module.InteractorModule;
import com.example.domain.usecase.GetRedditUseCase;
import com.example.domain.usecase.SavePostUseCase;
import com.example.domain.usecase.UseCase;

import javax.inject.Singleton;


/**
 * Created by ahmedmamdouh13 on 14/09/17.
 */

@Singleton
@dagger.Component(modules = {InteractorModule.class})
public interface AppDomainComponent {
//
//   GetRedditUseCase exposeGetRedditUseCase();
//    SavePostUseCase exposeSavePostUseCase();


}

