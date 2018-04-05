package com.example.ahmedmamdouh13.takenotesmvpstudy.ui.mvp.models;


import com.example.domain.model.Posts;

import java.util.List;

import io.reactivex.Single;

/**
 * Created by ahmedmamdouh13 on 11/09/17.
 */

public interface MainModel {

    Single<List<Posts>> getNotes();
    public String getTitle();

    public String getNote();

    public void setNote(String note);

    public void setTitle(String title);

}
