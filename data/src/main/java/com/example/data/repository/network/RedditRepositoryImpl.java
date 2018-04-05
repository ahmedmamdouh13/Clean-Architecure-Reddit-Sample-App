package com.example.data.repository.network;

import com.example.data.model.RedditPostsModel;
import com.example.data.model.mapper.PostMapper;
import com.example.data.repository.db.RedditDB;
import com.example.domain.model.Posts;
import com.example.domain.repository.RedditRepository;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

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
    public Observable<Posts> listTopics() {
        return RetrofitInstance.getRetrofitinstance().create(RetrofitService.class).listTopics()
                .map(redditPostsModel -> postMapper.mapToPosts(redditPostsModel));
    }

    @Override
    public void savePost(Posts posts) {
        redditDB.savePost(posts);
    }

    public void dummy(){

    }
}
