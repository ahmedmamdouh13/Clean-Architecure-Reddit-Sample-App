package com.example.ahmedmamdouh13.takenotesmvpstudy.ui.mvp.view;

import com.example.ahmedmamdouh13.takenotesmvpstudy.ui.base.BaseView;
import com.example.ahmedmamdouh13.takenotesmvpstudy.ui.mvp.models.POJO.PostModel;

import java.util.List;

/**
 * Created by ahmedmamdouh13 on 15/09/17.
 */

public interface RedditView extends BaseView {

    void displayPosts(List<PostModel> pojo);

}
