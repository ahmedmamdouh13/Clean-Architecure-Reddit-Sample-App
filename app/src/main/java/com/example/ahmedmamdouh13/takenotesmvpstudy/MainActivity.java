package com.example.ahmedmamdouh13.takenotesmvpstudy;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements MainView {

    @BindView(R.id.ListView)ListView listView;
    @BindView(R.id.FAB)FloatingActionButton FAB;
    ArrayAdapter arrayAdapter;
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainModel mainModel=new MainModelDataBase();
        presenter=new MainPresenter(this,this,mainModel);

         listView= (ListView) findViewById(R.id.ListView);

        Intent intent=getIntent();
       presenter.getIntent(intent);

        FAB=(FloatingActionButton) findViewById(R.id.FAB);

        FAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.addNote();
                finish();
            }
        });
      // presenter.saveNotes("ahmed","nooooooootes");

        presenter.loadNotes();


    }


    @Override
    public void displayNotes(final ArrayList<String> list) {

     final ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                presenter.editNote(i);
                finish();
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

                presenter.deleteNote(i);

                list.remove(i);
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
}
