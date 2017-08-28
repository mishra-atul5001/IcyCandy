package com.example.mishr.icycandy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mishr on 25/08/2017.
 */

//Java Class Name should not have underscores
public class MenuActivity extends AppCompatActivity {

    private List<DataModel> dataModelList = new ArrayList<>();

    //Make meaningful names, so that anyone can understand what is this intended for
    private MyAdapter mAdapter;

    private String[] iceCreamList = new String[]{"Chocolate", "Vanilla", "ButterScotch", "Mango", "Black"};
    private String[] iceCreamDescList = {"Having cherries over it will be yum..!!!", "Vanilla with Strawberry syrup..watering hn..!!", "We used to have Boost Milkshake with ButterScotch IceCream..!", "Mango is my Maa's Favourite..!! Summerish Fruit", "Oh my my...Black ice cream..Gotta Invent "};
    private int[] images = {R.drawable.ic4, R.drawable.ic6, R.drawable.icy3, R.drawable.ic5, R.drawable.ic7};

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_layout);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new MyAdapter(this);
        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

        prepareData();
    }

    //Could have made this in onCreate() method too, but this way it's more clear and concise
    private void prepareData() {
        for (int i = 0; i < images.length; i++) {
            dataModelList.add(new DataModel(iceCreamList[i], images[i], iceCreamDescList[i]));
        }
     //   Log.d("Menu Activity", dataModelList.toString());
        mAdapter.clear();
        mAdapter.addAll(dataModelList);
        mAdapter.notifyDataSetChanged();
    }
}






