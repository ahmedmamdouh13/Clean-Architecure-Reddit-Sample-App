package com.example.ahmedmamdouh13.takenotesmvpstudy.module;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ahmedmamdouh13.takenotesmvpstudy.R;
import com.example.ahmedmamdouh13.takenotesmvpstudy.application.mApplication;
import com.example.ahmedmamdouh13.takenotesmvpstudy.base.BaseActivity;
import com.example.ahmedmamdouh13.takenotesmvpstudy.mvp.presenter.MainPresenter;
import com.example.ahmedmamdouh13.takenotesmvpstudy.mvp.view.MainView;
import com.example.domain.model.Posts;
import com.example.domain.repository.RedditRepository;
import com.example.domain.usecase.SavePostInteractor;
import com.jakewharton.rxbinding2.view.RxView;


import java.util.ArrayList;


import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import timber.log.Timber;


public class MainActivity extends BaseActivity implements MainView {

    ListView listView;
   FloatingActionButton FAB;
    ArrayAdapter arrayAdapter;
    @Inject
    MainPresenter presenter;
    ArrayList savedList;


    @Inject
    RedditRepository repository;

    @Inject
    SavePostInteractor savePostUseCase;


    @Override
    protected void onViewCreated(@Nullable Bundle savedInstanceState) {
        super.onViewCreated(savedInstanceState);
        initDagger();

        presenter.bindContext(this);
        listView= findViewById(R.id.ListView);

savePostUseCase.save(new Posts("am"));
        FAB= findViewById(R.id.FAB);

        RxView.clicks(FAB).subscribe(aVoid-> presenter.addNote());

        Timber.d("here");

        if (savedInstanceState!=null){
            displayNotes(savedList);
        }else {
            presenter.loadNotes();
        }
    }

    @Override
    public void displayNotes(final ArrayList<String> list) {


        if (list!=null){
           savedList=list;
        }
     final ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,savedList);



        if(listView!=null)
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            presenter.editNote(i);
//              finish();
        });
        listView.setOnItemLongClickListener((adapterView, view, i, l) -> {

            presenter.deleteNote(i);

            savedList.remove(i);
            arrayAdapter.notifyDataSetChanged();
            return true;
        });

    }

    @Override
    public void notifyChanges() {

     //   arrayAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.unSubscribe();
    }


    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        savedList=(ArrayList) savedInstanceState.get("list");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putStringArrayList("list",savedList);

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onNewIntent(Intent intent) {
       // if (intent.getStringExtra("title")!=null) {
            presenter.getIntent(intent);
      //  }
        super.onNewIntent(intent);
    }

    @Override
    protected void initDagger() {
        getDaggerComponent().inject(this);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }


}
