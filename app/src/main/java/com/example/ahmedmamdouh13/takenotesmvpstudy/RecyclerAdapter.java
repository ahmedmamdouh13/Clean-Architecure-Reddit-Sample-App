package com.example.ahmedmamdouh13.takenotesmvpstudy;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by ahmedmamdouh13 on 15/09/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.mViewHolder> {


    private  Context context;
    private  Example pojo;

    public RecyclerAdapter(Context context, Example pojo){

        this.context = context;
        this.pojo = pojo;
    }

    @Override
    public mViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);


        return new mViewHolder(view);
    }

    @Override
    public void onBindViewHolder(mViewHolder holder, int position) {

       // holder.textView.setText(pojo.getData().getChildren().get(position).getData().getTitle());
        if (pojo.getData().getChildren().get(position).getData().getPreview()!=null) {
            holder.setViews(pojo.getData().getChildren().get(position).getData().getTitle(),
                    pojo.getData().getChildren().get(position).getData().getPreview().getImages().get(0).getSource().getUrl(),
                    position,pojo.getData().getChildren().get(position).getData().getSelftext());
        }
        else
            holder.setViews(pojo.getData().getChildren().get(position).getData().getTitle(), null, position,pojo.getData().getChildren().get(position).getData().getSelftext());

    }

    @Override
    public int getItemCount() {
        return pojo.getData().getChildren().size();
    }

    public class mViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imageView;
        TextView textView;
        TextView textView2;
        int position;

        public mViewHolder(View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageview_recycler);
            textView=itemView.findViewById(R.id.textview_recycler);
            textView2=itemView.findViewById(R.id.textview_recycler2);
            imageView.setOnClickListener(this);
            textView.setOnClickListener(this);
            textView2.setOnClickListener(this);
        }
        public void setViews(String title,String url,int position,String desc){
            textView.setText(title);
            textView2.setText(desc);
           // if (url!=null)
            Picasso.with(context).load(url).error(R.drawable.ic_add_black_24dp).into(imageView);
            this.position=position;
        }

        @Override
        public void onClick(View view) {
            context.startActivity(new Intent(context,WebActivity.class)
                    .putExtra("siteURL",pojo.getData().getChildren().get(position).getData().getUrl()));
        }
    }
}
