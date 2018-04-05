package com.example.domain.repository;

import com.example.domain.model.Posts;

import io.reactivex.Observable;
import io.reactivex.Observer;


/**
 * Created by ahmedmamdouh13 on 15/12/17.
 */

public interface RedditRepository {

    void listTopics(Observer<Posts> observer);

    void savePost(Posts posts);
}
