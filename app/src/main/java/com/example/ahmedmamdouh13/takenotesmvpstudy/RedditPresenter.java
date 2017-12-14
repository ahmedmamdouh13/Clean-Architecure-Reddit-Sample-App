package com.example.ahmedmamdouh13.takenotesmvpstudy;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.ArrayList;

import javax.inject.Inject;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import timber.log.Timber;

/**
 * Created by ahmedmamdouh13 on 11/09/17.
 */

public class RedditPresenter extends BasePresenter<RedditView> {


    Example pojo;

    @Inject
    RetrofitService retrofitServive;


    public void  save(String note, String title, int position){

        Intent intent=new Intent(getContext(),MainActivity.class);

        intent.putExtra("note", note);
        intent.putExtra("title", title);
        if (position!=-1)
        {
            intent.putExtra("position",position);
        }




        getContext().startActivity(intent);

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
                       Timber.e(e);
                    }

                    @Override
                    public void onComplete() {

//                        for (int i = 0; i < pojo.getData().getChildren().size(); i++)
//                       Log.d("onError","erroooooorrrr " + pojo.getData().getChildren().get(i).getData().getTitle());

//                        pojo.getData().setModhash("msclkgdzns5d830d2f3df0762cdce574705d9d9cf23d55b765");
                       getView().displayPosts(pojo);
                    }
                });

    }


}
