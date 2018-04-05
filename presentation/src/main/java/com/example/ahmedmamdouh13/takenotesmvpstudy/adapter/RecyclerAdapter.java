package com.example.ahmedmamdouh13.takenotesmvpstudy.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ahmedmamdouh13.takenotesmvpstudy.R;
import com.example.domain.model.Posts;
import com.squareup.picasso.Picasso;

import java.util.List;

import timber.log.Timber;

/**
 * Created by ahmedmamdouh13 on 15/09/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.mViewHolder> {


    private  Context context;
    private List<Posts> pojo;

    public RecyclerAdapter(Context context, List<Posts> pojo){

        this.context = context;
        this.pojo = pojo;
    }

    @Override
    public mViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);

        Timber.d("CreateViewHolder");

        return new mViewHolder(view);
    }

    @Override
    public void onBindViewHolder(mViewHolder holder, int position) {

       // holder.textView.setText(pojo.getData().getChildren().get(position).getData().getTitle());
//        if (pojo.getData().getChildren().get(position).getData().getPreview()!=null) {
//            holder.setViews(pojo.getData().getChildren().get(position).getData().getTitle(),
//                    pojo.getData().getChildren().get(position).getData().getPreview().getImages().get(0).getSource().getUrl(),
//                    position,pojo.getData().getChildren().get(position).getData().getSelftext());
//            Timber.d("bindviewholder");
//        }
//        else
//            holder.setViews(pojo.getData().getChildren().get(position).getData().getTitle(), null, position,pojo.getData().getChildren().get(position).getData().getSelftext());

    }

    @Override
    public int getItemCount() {
        return pojo.size();
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
            Timber.d("yes yes two baby " + title);
            textView.setText(title);
            textView2.setText(desc);
           // if (url!=null)
            Picasso.with(context).load(url).error(R.drawable.ic_add_black_24dp).into(imageView);
            this.position=position;
        }

        @Override
        public void onClick(View view) {
//            context.startActivity(new Intent(context,WebActivity.class)
//                    .putExtra("siteURL",pojo.getData().getChildren().get(position).getData().getUrl()));
        }
    }
}
