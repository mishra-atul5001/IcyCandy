package com.example.mishr.icycandy;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static com.example.mishr.icycandy.R.id.imageView;
import static com.example.mishr.icycandy.R.id.imageView5;

/**
 * Created by mishr on 28/08/2017.
 */

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<DataModel> dataModelList = new ArrayList<>();
    private Context context;


    MyAdapter(Context context) {
        this.context = context;
    }

    void clear() {
        dataModelList.clear();
    }

    void addAll(List<DataModel> list) {
        dataModelList.addAll(list);
        Log.d("DataModel", dataModelList.toString());
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.list_icy_ticket, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DataModel dataModel = dataModelList.get(position);
        holder.heads.setText(dataModel.getHead());
        holder.descs.setText(dataModel.getDesc());
        holder.images.setImageResource(dataModel.getImage());
      //  holder.itemView.setOnClickListener(new View.OnClickListener() {

       // });

    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView heads, descs;
        ImageView images;

        MyViewHolder(View itemView) {
            super(itemView);
            heads = (TextView) itemView.findViewById(R.id.textView_head);
            descs = (TextView) itemView.findViewById(R.id.textView_desc);
            images = (ImageView) itemView.findViewById(R.id.imageView4);



            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        int  position = getAdapterPosition();
                    Intent intent = new Intent(context,ImageEditActivity.class);

                    Intent intent1;
                    intent1 = intent.putExtra("Ice Cream", dataModelList.get(position).getHead());
                    //intent.putExtra("name",heads.get(position));
                    context.startActivity(intent1);
                }
            });

        }



    }

    }

