package com.example.ahmedmamdouh13.takenotesmvpstudy.mvp.view;

import com.example.ahmedmamdouh13.takenotesmvpstudy.base.BaseView;
import com.example.domain.model.Posts;

/**
 * Created by ahmedmamdouh13 on 15/09/17.
 */

public interface RedditView extends BaseView {

    void displayPosts(Posts pojo);

}
