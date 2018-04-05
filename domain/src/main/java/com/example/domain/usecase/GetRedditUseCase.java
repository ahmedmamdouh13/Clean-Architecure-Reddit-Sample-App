package com.example.domain.usecase;



import com.example.domain.model.Posts;
import com.example.domain.repository.RedditRepository;

import javax.inject.Inject;


import io.reactivex.Observable;

/**
 * Created by ahmedmamdouh13 on 14/12/17.
 */

public class GetRedditUseCase extends UseCase<Posts> implements GetRedditInteractor {



    @Inject
    RedditRepository exampleRepository;

    @Inject
    public GetRedditUseCase(){}

    @Override
    public Observable<Posts> createObservable() {

        return exampleRepository.listTopics();
    }
}
