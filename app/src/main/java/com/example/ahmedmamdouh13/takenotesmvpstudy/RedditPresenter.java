package com.example.ahmedmamdouh13.takenotesmvpstudy;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.ArrayList;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by ahmedmamdouh13 on 11/09/17.
 */

public class RedditPresenter {

    Context mContext;
    RedditView redditView;
    Example pojo;
    private RetrofitService retrofitServive;


    public RedditPresenter(Context mContext,RetrofitService retrofitServive,RedditView redditView){

        this.mContext=mContext;
        this.retrofitServive = retrofitServive;
        this.redditView = redditView;

    }

    public void  save(String note, String title, int position){

        Intent intent=new Intent(mContext,MainActivity.class);

        intent.putExtra("note", note);
        intent.putExtra("title", title);
        if (position!=-1)
        {
            intent.putExtra("position",position);
        }




        mContext.startActivity(intent);

    }

    public void loadPosts(){

        retrofitServive.listTopics()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Example>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull Example entry) {

                        pojo=entry;


                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.d("onError","erroooooorrrr " + e.getMessage());
                    }

                    @Override
                    public void onComplete() {

//                        for (int i = 0; i < pojo.getData().getChildren().size(); i++)
//                       Log.d("onError","erroooooorrrr " + pojo.getData().getChildren().get(i).getData().getTitle());

//                        pojo.getData().setModhash("msclkgdzns5d830d2f3df0762cdce574705d9d9cf23d55b765");
                       redditView.displayPosts(pojo);
                    }
                });

    }


}
