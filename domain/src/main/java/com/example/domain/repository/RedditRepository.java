package com.example.domain.repository;

import com.example.domain.model.Posts;

import io.reactivex.Observable;


/**
 * Created by ahmedmamdouh13 on 15/12/17.
 */

public interface RedditRepository {

    Observable<Posts> listTopics();

    void savePost(Posts posts);
}
