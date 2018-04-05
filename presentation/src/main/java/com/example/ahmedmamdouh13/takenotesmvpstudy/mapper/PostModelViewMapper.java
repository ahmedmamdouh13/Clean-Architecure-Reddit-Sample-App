package com.example.ahmedmamdouh13.takenotesmvpstudy.mapper;

import com.example.ahmedmamdouh13.takenotesmvpstudy.ui.mvp.models.POJO.PostModel;
import com.example.domain.model.Posts;

import java.util.List;

/**
 * Created by ahmedmamdouh13 on 05/04/18.
 */


public interface PostModelViewMapper {


    List<PostModel> mapPostsToPostsModelView(List<Posts> posts);
}
