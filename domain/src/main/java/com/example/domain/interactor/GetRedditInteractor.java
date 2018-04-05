package com.example.domain.interactor;

import com.example.domain.model.Posts;

import java.util.List;

import io.reactivex.Observer;

/**
 * Created by ahmedmamdouh13 on 05/04/18.
 */

public interface GetRedditInteractor {

     void createPostObservable(Observer<List<Posts>> observer);
}
