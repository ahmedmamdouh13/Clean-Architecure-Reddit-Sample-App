package com.example.ahmedmamdouh13.takenotesmvpstudy.mvp.view;

import com.example.ahmedmamdouh13.takenotesmvpstudy.base.BaseView;

import java.util.ArrayList;


/**
 * Created by ahmedmamdouh13 on 11/09/17.
 */

public interface MainView extends BaseView {
    void displayNotes(ArrayList<String> list);

    void notifyChanges();
}
