package com.example.ahmedmamdouh13.takenotesmvpstudy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.inject.Inject;

import retrofit2.Retrofit;


public class RedditActivity extends AppCompatActivity implements RedditView {


    String title;
    @Inject
    RetrofitService retrofitService;

    RedditPresenter redditPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reddit);
        ((mApplication)getApplication()).getComponent().inject(this);

        redditPresenter=new RedditPresenter();
        redditPresenter.bind(this,this);
        ((mApplication)getApplication()).getComponent().inject(redditPresenter);



//        Intent intent= getIntent();
//
//        String title=intent.getStringExtra("title");
//        String note=intent.getStringExtra("note");
//      final   int position=intent.getIntExtra("position",-1);
//        if (title!=null||note!=null){
//            noteText.setText(note);
//            titleText.setText(title);
//        }
//        saveButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//             String  note=noteText.getText().toString();
//              String title=titleText.getText().toString();
//                redditPresenter.save(note,title,position);
//               finish();
//            }
//        });

        redditPresenter.loadPosts();




    }

    @Override
    public void finish() {
        super.finish();
    }


    @Override
    public void onBackPressed() {

        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();

    }

    @Override
    public void displayPosts(Example pojo) {

        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerAdapter recyclerAdapter=new RecyclerAdapter(this,pojo);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
