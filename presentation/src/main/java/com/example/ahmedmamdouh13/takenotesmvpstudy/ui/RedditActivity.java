package com.example.ahmedmamdouh13.takenotesmvpstudy.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ahmedmamdouh13.takenotesmvpstudy.R;
import com.example.ahmedmamdouh13.takenotesmvpstudy.adapter.RecyclerAdapter;
import com.example.ahmedmamdouh13.takenotesmvpstudy.application.mApplication;
import com.example.ahmedmamdouh13.takenotesmvpstudy.ui.mvp.models.POJO.PostModel;
import com.example.ahmedmamdouh13.takenotesmvpstudy.ui.mvp.presenter.RedditPresenter;
import com.example.ahmedmamdouh13.takenotesmvpstudy.ui.mvp.view.RedditView;

import java.util.List;

import javax.inject.Inject;

import timber.log.Timber;


public class RedditActivity extends AppCompatActivity implements RedditView {


    String title;

    @Inject
    RedditPresenter redditPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reddit);
        ((mApplication)getApplication()).getComponent().inject(this);


        redditPresenter.bindContext(this);
        redditPresenter.bind(this);








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

        Timber.d("here2");
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
    public void displayPosts(List<PostModel> pojo) {

       // Timber.d(pojo.getData().getChildren().get(1).getData().getAuthor()+"  yes yessss");
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerAdapter recyclerAdapter=new RecyclerAdapter(this,pojo,redditPresenter);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(recyclerAdapter);


    }

}
