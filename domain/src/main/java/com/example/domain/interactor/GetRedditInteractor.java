package com.example.domain.interactor;

import com.example.domain.model.Posts;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;

/**
 * Created by ahmedmamdouh13 on 05/04/18.
 */

public interface GetRedditInteractor {

     Observable<List<Posts>> createPostObservable();
}
