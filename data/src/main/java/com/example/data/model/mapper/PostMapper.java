package com.example.data.model.mapper;

import com.example.data.model.RedditPostsModel;
import com.example.data.model.pojo.Data_;
import com.example.data.model.pojo.Example;
import com.example.domain.model.Posts;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by ahmedmamdouh13 on 04/04/18.
 */

public class PostMapper {

    @Inject
    public PostMapper(){}

    public List<Posts> mapToPosts(Example redditPostsModel) {
        List<Posts> postsList=new ArrayList<>();


        for (int i = 0; i < redditPostsModel.getData().getChildren().size(); i++) {
            Data_ data = redditPostsModel.getData().getChildren().get(i).getData();
            Posts post=new Posts();
            post.setName(data.getTitle());
            if (data.getPreview()!=null)
            post.setImgurl(data.getPreview().getImages().get(0).getSource().getUrl());
            post.setArticle(data.getSelftext());
            postsList.add(post);
            Timber.d(data.getAuthor());
        }

        return postsList;
    }
}
