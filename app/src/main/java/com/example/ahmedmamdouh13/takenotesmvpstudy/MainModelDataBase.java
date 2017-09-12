package com.example.ahmedmamdouh13.takenotesmvpstudy;

import com.orm.SugarRecord;

import java.util.List;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by ahmedmamdouh13 on 11/09/17.
 */

public class MainModelDataBase extends SugarRecord implements MainModel{


    private String title;
    private String note;

    public MainModelDataBase(){
    }

    public MainModelDataBase(String title, String note){

        this.title = title;
        this.note = note;
    }



    @Override
    public Single<List<MainModelDataBase>> getNotes() {


        Single<List<MainModelDataBase>> single=Single.just(MainModelDataBase.listAll(MainModelDataBase.class))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
//        Observable<List<MainModelDataBase>> observable=Observable.just(MainModelDataBase.listAll(MainModelDataBase.class))
//                .subscribeOn(Schedulers.io())
//              .observeOn(AndroidSchedulers.mainThread());
//
//                .create(new ObservableOnSubscribe<List<MainModelDataBase>>() {
//            @Override
//            public void subscribe(@NonNull ObservableEmitter<List<MainModelDataBase>> e) throws Exception {
//                e.onNext(MainModelDataBase.listAll(MainModelDataBase.class));
//                Log.d("tag","subscribeDB "+Thread.currentThread().getName());
//                e.onComplete();
//
//
//            }
//        }).subscribeOn(Schedulers.io())
//              .observeOn(AndroidSchedulers.mainThread());

        return single;
    }

    public String getTitle() {
        return title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
