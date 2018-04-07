package com.example.data.repository.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.domain.model.Posts;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by ahmedmamdouh13 on 03/04/18.
 */

public class RedditDB  {


    @Inject
 public RedditDB(){}

    public void savePost(Posts posts) {
      //  Timber.d(posts.getName()+" saved !");

    }
}
