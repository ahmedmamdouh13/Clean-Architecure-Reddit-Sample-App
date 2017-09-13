package com.example.ahmedmamdouh13.takenotesmvpstudy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class NewNoteActivity extends AppCompatActivity implements NewNoteView {


    EditText noteText;
    EditText titleText;
     Button saveButton;
    NewNotePresenter notePresenter;
    String note;
    String title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);

        noteText= (EditText) findViewById(R.id.edittext);
        titleText= (EditText) findViewById(R.id.title);

        saveButton= (Button) findViewById(R.id.save_button);


        notePresenter=new NewNotePresenter(this);
        Intent intent= getIntent();

        String title=intent.getStringExtra("title");
        String note=intent.getStringExtra("note");
      final   int position=intent.getIntExtra("position",-1);
        if (title!=null||note!=null){
            noteText.setText(note);
            titleText.setText(title);

        }



        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String  note=noteText.getText().toString();
              String title=titleText.getText().toString();
                notePresenter.save(note,title,position);
                finish();
            }
        });





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
}
