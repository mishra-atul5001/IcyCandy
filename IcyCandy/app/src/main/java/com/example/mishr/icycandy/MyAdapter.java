package com.example.mishr.icycandy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

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
        }


    }
}
