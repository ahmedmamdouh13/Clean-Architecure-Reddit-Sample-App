package com.example.domain.interactor.base;

import io.reactivex.Observable;
import io.reactivex.Observer;

/**
 * Created by ahmedmamdouh13 on 14/12/17.
 */

public interface Interactor<T> {

    void execute(Observer<T> observer);

    Observable<T> execute();
}
