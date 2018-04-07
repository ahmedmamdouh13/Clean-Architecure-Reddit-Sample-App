package com.example.domain.interactor.usecase;



import com.example.domain.interactor.GetRedditInteractor;
import com.example.domain.interactor.usecase.base.UseCase;
import com.example.domain.model.Posts;
import com.example.domain.repository.RedditRepository;

import java.util.List;

import javax.inject.Inject;


import io.reactivex.Observable;
import io.reactivex.Observer;

/**
 * Created by ahmedmamdouh13 on 14/12/17.
 */

public class GetRedditUseCase extends UseCase<Posts> implements GetRedditInteractor {


    private RedditRepository exampleRepository;

    @Inject
    public GetRedditUseCase( RedditRepository exampleRepository){
        this.exampleRepository = exampleRepository;
    }



    @Override
    public Observable<Posts> createObservable() {
        return null;
    }

    @Override
    public Observable<List<Posts>>  createPostObservable() {

        return exampleRepository.listTopics();
    }
}
