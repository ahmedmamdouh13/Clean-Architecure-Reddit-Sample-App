package com.example.ahmedmamdouh13.takenotesmvpstudy;

import android.content.Context;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.sql.Array;
import java.util.ArrayList;

/**
 * Created by ahmedmamdouh13 on 12/09/17.
 */

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {


    @Mock
    MainView mainView;

    @Mock
    MainActivity mainActivity;
    @Mock
    MainModel mainModel;

    @Test
    public void shouldPass(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void shoudLoadNotes(){


        mainModel.getNotes();

        MainPresenter presenter=new MainPresenter(mainActivity.getApplicationContext(),mainView,mainModel);
        presenter.loadNotes();

        ArrayList<String> list=new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");

      Mockito.verify(mainView).displayNotes(list);
        //Assert.assertEquals();

    }

}
