package com.example.data.repository.network;

import com.example.data.model.RedditPostsModel;
import com.example.data.model.mapper.PostMapper;
import com.example.data.repository.db.RedditDB;
import com.example.domain.model.Posts;
import com.example.domain.repository.RedditRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import timber.log.Timber;

/**
 * Created by ahmedmamdouh13 on 15/12/17.
 */

public class RedditRepositoryImpl implements RedditRepository {

    @Inject
    PostMapper postMapper;
    @Inject
    RedditDB redditDB;
    @Inject
   public RedditRepositoryImpl(){}

    @Override
    public void listTopics(Observer<List<Posts>> observer) {
         RetrofitInstance.getRetrofitinstance().create(RetrofitService.class).listTopics()
                .map(redditPostsModel -> postMapper.mapToPosts(redditPostsModel))
                 .subscribeOn(Schedulers.io())

                 .subscribeWith(observer);
        Timber.d("networking in data layer");
    }

    @Override
    public void savePost(Posts posts) {
        redditDB.savePost(posts);
    }

    public void dummy(){

    }
}
