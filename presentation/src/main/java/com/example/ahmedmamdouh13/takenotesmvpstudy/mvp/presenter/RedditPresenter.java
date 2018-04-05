package com.example.ahmedmamdouh13.takenotesmvpstudy.mvp.presenter;

import android.content.Intent;

import com.example.ahmedmamdouh13.takenotesmvpstudy.module.MainActivity;
import com.example.ahmedmamdouh13.takenotesmvpstudy.base.BasePresenter;
import com.example.ahmedmamdouh13.takenotesmvpstudy.mvp.view.RedditView;
import com.example.ahmedmamdouh13.takenotesmvpstudy.application.mApplication;
import com.example.domain.model.Posts;
import com.example.domain.repository.RedditRepository;
import com.example.domain.usecase.GetRedditUseCase;
import com.example.domain.usecase.SavePostInteractor;
import com.example.domain.usecase.SavePostUseCase;
import com.example.domain.usecase.UseCase;


import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by ahmedmamdouh13 on 11/09/17.
 */

public class RedditPresenter extends BasePresenter<RedditView> {


    Posts pojo;
    @Inject
    SavePostInteractor savePostUseCase;


    @Inject
    public RedditPresenter(){

    }


    public void  save(String note, String title, int position){


        savePostUseCase.save(new Posts("log this man please !"));
    }

    public void loadPosts(){

    // useCase.execute(new RedditObserver());

    savePostUseCase.save(new Posts("ahmed"));
        savePostUseCase.save(new Posts("log this man please !"));
        savePostUseCase.save(new Posts("log this man please !"));
        savePostUseCase.save(new Posts("log this man please !"));

   //  repository.savePost(new Posts("ahmed"));
//        retrofitServive.listTopics()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<Example>() {
//                    @Override
//                    public void onSubscribe(@NonNull Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(@NonNull Example entry) {
//
//                        pojo=entry;
//
//
//                    }
//
//                    @Override
//                    public void onError(@NonNull Throwable e) {
//                       Timber.e(e);
//                    }
//
//                    @Override
//                    public void onComplete() {
//
////                        for (int i = 0; i < pojo.getData().getChildren().size(); i++)
////                       Log.d("onError","erroooooorrrr " + pojo.getData().getChildren().get(i).getData().getTitle());
//
////                        pojo.getData().setModhash("msclkgdzns5d830d2f3df0762cdce574705d9d9cf23d55b765");
//                       getView().displayPosts(pojo);
//                    }
//                });

    }


    private  final class RedditObserver implements Observer<Posts>{
        @Override
        public void onSubscribe(Disposable d) {

        }

        @Override
        public void onNext(Posts example) {

            pojo=example;

        }


        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onComplete() {

//            for (int i = 0; i < pojo.getData().getChildren().size(); i++)
//                Log.d("onError","erroooooorrrr " + pojo.getData().getChildren().get(i).getData().getTitle());
//
//            pojo.getData().setModhash("msclkgdzns5d830d2f3df0762cdce574705d9d9cf23d55b765");
//            getView().displayPosts(pojo);
//        }
    }
}
}

