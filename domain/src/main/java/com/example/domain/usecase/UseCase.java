package com.example.domain.usecase;

import com.example.domain.interactor.Interactor;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by ahmedmamdouh13 on 14/12/17.
 */

public abstract class  UseCase<T> implements Interactor<T> {


    @Inject
    Scheduler mainUischeduler;

    public abstract Observable<T> createObservable();

    @Override
    public Observable<T> execute() {
        return createObservable();
    }

    @Override
    public void execute(Observer<T> observer) {

        createObservable().subscribeOn(Schedulers.newThread())
                .observeOn(mainUischeduler)
                .subscribeWith(observer);

    }
}
