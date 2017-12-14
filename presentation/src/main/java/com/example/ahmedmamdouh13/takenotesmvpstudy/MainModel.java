package com.example.ahmedmamdouh13.takenotesmvpstudy;

import com.orm.SugarRecord;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;

/**
 * Created by ahmedmamdouh13 on 11/09/17.
 */

public interface MainModel {

    Single<List<MainModelDataBase>> getNotes();
    public String getTitle();

    public String getNote();

    public void setNote(String note);

    public void setTitle(String title);

}
