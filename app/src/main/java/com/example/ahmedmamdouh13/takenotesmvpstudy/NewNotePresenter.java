package com.example.ahmedmamdouh13.takenotesmvpstudy;

import android.content.Context;
import android.content.Intent;

/**
 * Created by ahmedmamdouh13 on 11/09/17.
 */

public class NewNotePresenter {

    NewNoteView noteView;
    Context mContext;


    public NewNotePresenter(Context mContext){

        this.mContext=mContext;
        noteView=new NewNoteActivity();

    }

    public void  save(String note, String title, int position){

        Intent intent=new Intent(mContext,MainActivity.class);

        intent.putExtra("note", note);
        intent.putExtra("title", title);
        if (position!=-1)
        {
            intent.putExtra("position",position);
        }




        mContext.startActivity(intent);

    }


}
