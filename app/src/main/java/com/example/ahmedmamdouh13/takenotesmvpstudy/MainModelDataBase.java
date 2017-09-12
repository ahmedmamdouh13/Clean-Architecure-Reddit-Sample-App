package com.example.ahmedmamdouh13.takenotesmvpstudy;

import com.orm.SugarRecord;

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
    public void getNotes() {

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
