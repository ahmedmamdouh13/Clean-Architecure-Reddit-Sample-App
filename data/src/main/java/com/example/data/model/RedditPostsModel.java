package com.example.data.model;



import java.util.List;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by ahmedmamdouh13 on 11/09/17.
 */

public class RedditPostsModel {


    private String title;
    private String note;

    public RedditPostsModel(){
    }

    public RedditPostsModel(String title, String note){

        this.title = title;
        this.note = note;
    }



//    @Override
//    public Single<List<RedditPostsModel>> getNotes() {
//
//        Single<List<RedditPostsModel>> single=Single.just(RedditPostsModel.listAll(RedditPostsModel.class))
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//              //  .delaySubscription(5000, TimeUnit.MILLISECONDS)
//
//                ;
////        Observable<List<RedditPostsModel>> observable=Observable.just(RedditPostsModel.listAll(RedditPostsModel.class))
////                .subscribeOn(Schedulers.io())
////              .observeOn(AndroidSchedulers.mainThread());
////
////                .create(new ObservableOnSubscribe<List<RedditPostsModel>>() {
////            @Override
////            public void subscribe(@NonNull ObservableEmitter<List<RedditPostsModel>> e) throws Exception {
////                e.onNext(RedditPostsModel.listAll(RedditPostsModel.class));
////                Log.d("tag","subscribeDB "+Thread.currentThread().getName());
////                e.onComplete();
////
////
////            }
////        }).subscribeOn(Schedulers.io())
////              .observeOn(AndroidSchedulers.mainThread());
//
//        return single;
//    }

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
