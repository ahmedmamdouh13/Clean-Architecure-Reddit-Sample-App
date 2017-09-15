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


public class MainActivity extends AppCompatActivity implements MainView {

    ListView listView;
   FloatingActionButton FAB;
    ArrayAdapter arrayAdapter;
    MainPresenter presenter;
    ArrayList savedList;
    @Inject
    MainModelDataBase mainModelDataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((mApplication)getApplication()).getComponent().inject(this);




        presenter=new MainPresenter(this,this,mainModelDataBase);

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
        }else
        presenter.loadNotes();






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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                presenter.editNote(i);
//              finish();
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

                presenter.deleteNote(i);

                savedList.remove(i);
                arrayAdapter.notifyDataSetChanged();
                return true;
            }
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
