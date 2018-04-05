package com.example.ahmedmamdouh13.takenotesmvpstudy.mapper;

import com.example.ahmedmamdouh13.takenotesmvpstudy.ui.mvp.models.POJO.PostModel;
import com.example.domain.model.Posts;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by ahmedmamdouh13 on 05/04/18.
 */

public class PostModelViewMapperImpl implements PostModelViewMapper {

    @Inject
    public  PostModelViewMapperImpl(){}

    @Override
    public List<PostModel> mapPostsToPostsModelView(List<Posts> posts) {
        List<PostModel> postModelList=new ArrayList<>();
        for (int i = 0; i < posts.size(); i++) {
         PostModel postModel=new PostModel();

         postModel.setName(posts.get(i).getName());
         postModel.setDexc(posts.get(i).getArticle());
         postModel.setImgurl(posts.get(i).getImgurl());

         postModelList.add(postModel);
        }

        return postModelList;
    }
}
