package com.example.ahmedmamdouh13.takenotesmvpstudy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmedmamdouh13 on 11/09/17.
 */

public interface MainView {
    void displayNotes(ArrayList<String> list);

    void notifyChanges();
}
