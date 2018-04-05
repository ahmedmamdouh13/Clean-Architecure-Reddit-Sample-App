package com.example.domain.usecase;

import com.example.domain.model.Posts;
import com.example.domain.repository.RedditRepository;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by ahmedmamdouh13 on 04/04/18.
 */

public class SavePostUseCase extends UseCase<Posts> implements SavePostInteractor {


    RedditRepository repository;

    @Inject
    public SavePostUseCase(RedditRepository redditRepository) {


//    @Inject
//    public SavePostUseCase(RedditRepository repository){
//
        this.repository =redditRepository;
//    }
}
    @Override
    public Observable<Posts> createObservable() {
        return null;
    }

    @Override
    public void save(Posts posts){
        repository.savePost(posts);
    }
}
