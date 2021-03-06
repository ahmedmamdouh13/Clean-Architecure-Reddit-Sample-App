package com.example.domain.repository;

import com.example.domain.model.Posts;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;


/**
 * Created by ahmedmamdouh13 on 15/12/17.
 */

public interface RedditRepository {

    Observable<List<Posts>> listTopics();

    void savePost(Posts posts);
}
