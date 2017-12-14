package com.example.ahmedmamdouh13.takenotesmvpstudy;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.jakewharton.rxbinding2.view.RxView;


import java.util.ArrayList;


import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import timber.log.Timber;


public class MainActivity extends AppCompatActivity implements MainView {

    ListView listView;
   FloatingActionButton FAB;
    ArrayAdapter arrayAdapter;
    MainPresenter presenter;
    ArrayList savedList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter=new MainPresenter();

        ((mApplication)getApplication()).getComponent().inject(this);







        presenter.bind(this,this);
        ((mApplication)getApplication()).getComponent().inject( presenter);

         listView= (ListView) findViewById(R.id.ListView);




        FAB=(FloatingActionButton) findViewById(R.id.FAB);

        RxView.clicks(FAB).subscribe(aVoid->{
            presenter.addNote();
           // finish();
        });

//        FAB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
      // presenter.saveNotes("ahmed","nooooooootes");
//        RxPermissions rxpermissions=new RxPermissions(this);
//        rxpermissions.request(android.Manifest.permission.ACCESS_FINE_LOCATION).subscribe(granted->{
//            if (granted){
//                Toast.makeText(this, "granted!", Toast.LENGTH_SHORT).show();
//            }
//            else {
//                Toast.makeText(this, "not granted!", Toast.LENGTH_SHORT).show();
//
//            }
//
//        });
      //  presenter.requestTopics();


        if (savedInstanceState!=null){
            displayNotes(savedList);
        }else {
            presenter.loadNotes();
        }





        Observable<Integer> observable1=Observable.just(1);
        Observable<Integer> observable2=Observable.just(1,2);

        Observable<Observable<Integer>> observable3 =
                Observable.just(observable1,observable2)
                       .map(integer -> integer)
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread());


        Observer<Observable<Integer>> observer= new Observer<Observable<Integer>>() {

            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Observable<Integer> integerObservable) {
               // Timber.d(integerObservable.subscribeWith());
            }


            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };


        observable3.subscribeWith(observer);







    }


    @Override
    public void displayNotes(final ArrayList<String> list) {

//        if (savedList==null) {
//            savedList = list;
//        }
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
}
