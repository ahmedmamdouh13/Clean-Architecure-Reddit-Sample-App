package com.example.domain.interactor.usecase;

import com.example.domain.interactor.SavePostInteractor;
import com.example.domain.interactor.usecase.base.UseCase;
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
        this.repository =redditRepository;
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
