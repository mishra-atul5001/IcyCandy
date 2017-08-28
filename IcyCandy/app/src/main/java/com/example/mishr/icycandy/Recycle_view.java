package com.example.mishr.icycandy;

import android.support.v7.widget.RecyclerView;
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

public class Recycle_view extends RecyclerView.Adapter<Recycle_view.MyViewHolder> {
   private List<DataModel> dataModelList;

     public void clear(){
         dataModelList.clear();
     }
     public void addAll(List<DataModel> list){
         dataModelList.clear();
         dataModelList.addAll(list);
     }
   public Recycle_view(List<DataModel> dataModelList){
       this.dataModelList = dataModelList;
   }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
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

    public class MyViewHolder extends RecyclerView.ViewHolder {
       public TextView heads,descs;
       public ImageView images;

        public MyViewHolder(View itemView) {
           super(itemView);
           heads = (TextView)itemView.findViewById(R.id.textView_head);
           descs = (TextView)itemView.findViewById(R.id.textView_desc);
           images = (ImageView) itemView.findViewById(R.id.imageView4);
       }

        
    }
}
