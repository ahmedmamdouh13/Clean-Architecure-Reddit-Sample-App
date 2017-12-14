package com.example.ahmedmamdouh13.takenotesmvpstudy;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by ahmedmamdouh13 on 11/09/17.
 */

public class MainPresenter extends BasePresenter<MainView>{


    @Inject
    MainModelDataBase mainModelDataBase;

    private CompositeDisposable compositeDisposable=new CompositeDisposable();

    public void  loadNotes()
    {

        final ArrayList<String> titles=new ArrayList<>();
        compositeDisposable.add(
        mainModelDataBase.getNotes().subscribeWith(new DisposableSingleObserver<List<MainModelDataBase>>() {
            @Override
            public void onSuccess(@NonNull List<MainModelDataBase> mainModelDataBases) {
                for (int i=mainModelDataBases.size()-1;i>=0;i--) {
                    titles.add(mainModelDataBases.get(i).getTitle());
                }
                    Log.d("tag","OnSuccessThread "+ Thread.currentThread().getName());
                getView().displayNotes(titles);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.d("tag","ErrorThread "+ Thread.currentThread().getName());
               e.printStackTrace();
            }
        }));

//        final SingleObserver<List<MainModelDataBase>> observer= new SingleObserver<List<MainModelDataBase>>() {
//            @Override
//            public void onSubscribe(@NonNull Disposable d) {
//                Log.d("tag", "OnSubscribeThread "+Thread.currentThread().getName());
//                disposable=d;
//            }
//
//            @Override
//            public void onSuccess(@NonNull List<MainModelDataBase> mainModelDataBases) {
//
//                for (int i=mainModelDataBases.size()-1;i>=0;i--) {
//                    titles.add(mainModelDataBases.get(i).getTitle());
//                }
//                    Log.d("tag","OnSuccessThread "+ Thread.currentThread().getName());
//                mainView.displayNotes(titles);
//               disposable.dispose();
//            }
//
//            @Override
//            public void onError(@NonNull Throwable e) {
//                Log.d("tag","ErrorThread "+ Thread.currentThread().getName());
//               e.printStackTrace();
//            }


//            @Override
//            public void onSubscribe(@NonNull Disposable d) {
//
//
//               Log.d("tag", "OnSubscribeThread "+Thread.currentThread().getName());
//
//            }
//
//            @Override
//            public void onNext(@NonNull List<MainModelDataBase> mainModelDataBases) {
//
//                for (int i=mainModelDataBases.size()-1;i>=0;i--){
//
//                titles.add(mainModelDataBases.get(i).getTitle());
//                    Log.d("tag","OnNextThread "+ Thread.currentThread().getName());
//
//            }
//
//            }
//
//            @Override
//            public void onError(@NonNull Throwable e) {
//
//                Log.d("tag","ErrorThread "+ Thread.currentThread().getName());
//                e.printStackTrace();
//            }
//
//            @Override
//            public void onComplete() {
//                Log.d("tag","CompleteThread "+ Thread.currentThread().getName());
//                mainView.displayNotes(titles);
//            }


//        single.subscribe(observer);


//        ArrayList<String> titles=new ArrayList<>();
//        try {
//            List<MainModelDataBase> list = MainModelDataBase.listAll(MainModelDataBase.class);
//            for (int i=list.size()-1;i>=0;i--){
//
//                titles.add(list.get(i).getTitle());
//
//            }
//
//         Log.d("presenteritems",list.get(0).getTitle());
//            mainView.displayNotes(titles);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }

    }

    public void saveNotes(String title,String note){
      MainModelDataBase  mainModel=new MainModelDataBase(title,note);
        mainModel.save();

    }

    public void addNote(){
        getContext().startActivity(new Intent(getContext(),RedditActivity.class));
    }


    public void getIntent(Intent intent) {

            String note = intent.getStringExtra("note");
            String title = intent.getStringExtra("title");
        int pos = intent.getIntExtra("position",-1);
        if (note!=null||title!=null) {
            if (pos!=-1){

                List<MainModelDataBase> mainModel = MainModelDataBase.listAll(MainModelDataBase.class);

                mainModel.get(pos).setNote(note);
                mainModel.get(pos).setTitle(title);
                mainModel.get(pos).save();
                loadNotes();
            }else {
                MainModelDataBase mainModel = new MainModelDataBase(title, note);
                mainModel.save();
                loadNotes();
            }
        }

    }

    public void editNote(int position) {

        Intent intent=new Intent(getContext(),RedditActivity.class);
        String title="";
        String note="";

        try {
            List<MainModelDataBase> list = MainModelDataBase.listAll(MainModelDataBase.class);
            int mpos=0;
            for (int i=list.size()-1;i>=0;i--) {

                if (i == position) {
                 mpos=(list.size()-1)-i;
                    title = list.get(mpos).getTitle();
                    note = list.get(mpos).getNote();
                }
            }
            intent.putExtra("title",title);
            intent.putExtra("note",note);
            intent.putExtra("position",mpos);
            getContext().startActivity(intent);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public void deleteNote(int position) {
        List<MainModelDataBase> list = MainModelDataBase.listAll(MainModelDataBase.class);
        for (int i=list.size()-1;i>=0;i--) {

            if (i == position) {
                list.get((list.size()-1)-i).delete();
            }
        }
    }

    public void unSubscribe() {
        compositeDisposable.clear();
        Log.d("fromDestroy","UnSubscribed !");
    }

    public void requestTopics(){
//
//        redditService=RetrofitInstance.getRetrofitinstance().create(RetrofitService.class);
//
//        redditService.listTopics()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<redditEntryPojo>() {
//            @Override
//            public void onSubscribe(@NonNull Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(@NonNull redditEntryPojo entry) {
//
//                for (int i=0;i<entry.getArticles().size();i++)
//                Log.d("onNext","topics : "+entry.getArticles().get(i).getTitle());
//            }
//
//            @Override
//            public void onError(@NonNull Throwable e) {
//                Log.d("onError","erroooooorrrr " + e.getMessage());
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });
    }
}
