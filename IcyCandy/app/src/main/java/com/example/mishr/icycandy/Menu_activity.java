package com.example.mishr.icycandy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mishr on 25/08/2017.
 */

public class Menu_activity extends AppCompatActivity {

    private List<DataModel> dataModelList = new ArrayList<>();
   // private RecyclerView recyclerView;
    private DataModel mdataModel;
    private Recycle_view mRecycleview;
   // int[] images = {R.drawable.ic4, R.drawable.ic6, R.drawable.icy3, R.drawable.ic5, R.drawable.ic7};
   // String[] icies = new String[]{"Chocolate", "Vanilla", "ButterScotch", "Mango", "Black"};
  //  String[] tryitwhy = {"Having cherries over it will be yum..!!!", "Vanilla with Strawberry syrup..watering hn..!!", "We used to have Boost Milkshake with ButterScotch IceCream..!", "Mango is my Maa's Favourite..!! Summerish Fruit", "Oh my my...Black ice cream..Gotta Invent "};
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
  //  GridLayoutManager gridLayoutManager;
 //   private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onPause() {
        super.onPause();
        //  finish();
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);

    //     mdataModel = new DataModel(String head, int image, String desc);
         recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
         RecyclerView.LayoutManager mlayoutManager = new LinearLayoutManager(this);
         recyclerView.setLayoutManager(mlayoutManager);
         recyclerView.setItemAnimator(new DefaultItemAnimator());
         recyclerView.setAdapter(mRecycleview);
       // recyclerView.setHasFixedSize(true);
      //  mLayoutManager = new LinearLayoutManager(this);
      //  recyclerView.setLayoutManager(mLayoutManager);
      //  adapter = new Myadapter()
     /*   final ListView listView = (ListView) findViewById(R.id.listview);
    
      //  recyclerView.setHasFixedSize(true);
     //   recyclerView.setLayoutManager(new LinearLayoutManager(this));
       // adapter = new Myadapter(new String(String.valueOf(icies)),this);
      //  recyclerView.setAdapter(adapter);
       CustomAdapter customAdapter = new CustomAdapter(getBaseContext(),icies,tryitwhy,images);
       listView.setAdapter(customAdapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                String str = (String) o; //As you are using Default String Adapter
                Toast.makeText(getBaseContext(),str,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Menu_activity.this,imagedit.class);
                Bundle bundle = new Bundle();

                intent.putExtra("Ice Cream",listView.getItemAtPosition(position).toString());
                startActivity(intent);
                //  bundle.putString(KEY,str);
                // intent.putExtras(bundle);


            }
        });  */

        prepareData();
       

    }

    private void  prepareData(){

        DataModel dataModel = new DataModel("Mad Max: Fury Road", R.drawable.ic4, "Action & Adventure");
        dataModelList.add(dataModel);

        dataModel = new DataModel("Inside Out", R.drawable.ic5,"Animation, Kids & Family");
        dataModelList.add(dataModel);

        dataModel = new DataModel("Star Wars: Episode VII - The Force Awakens", R.drawable.ic6, "Action");
        dataModelList.add(dataModel);

        dataModel = new DataModel("Shaun the Sheep", R.drawable.ic7, "Animation");
        dataModelList.add(dataModel);

        dataModel = new DataModel("The Martian", R.drawable.app_icon, "Science Fiction & Fantasy");
        dataModelList.add(dataModel);

        dataModel = new DataModel("Mission: Impossible Rogue Nation", R.drawable.iconic, "Action");
        dataModelList.add(dataModel);
        mRecycleview.clear();
        mRecycleview.addAll(dataModelList);
        adapter.notifyDataSetChanged();


     /*   movie = new Movie("Up", "Animation", "2009");
        movieList.add(movie);

        movie = new Movie("Star Trek", "Science Fiction", "2009");
        movieList.add(movie);

        movie = new Movie("The LEGO Movie", "Animation", "2014");
        movieList.add(movie);

        movie = new Movie("Iron Man", "Action & Adventure", "2008");
        movieList.add(movie);

        movie = new Movie("Aliens", "Science Fiction", "1986");
        movieList.add(movie);

        movie = new Movie("Chicken Run", "Animation", "2000");
        movieList.add(movie);

        movie = new Movie("Back to the Future", "Science Fiction", "1985");
        movieList.add(movie);

        movie = new Movie("Raiders of the Lost Ark", "Action & Adventure", "1981");
        movieList.add(movie);

        movie = new Movie("Goldfinger", "Action & Adventure", "1965");
        movieList.add(movie);

        movie = new Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieList.add(movie);
                                */

    }


     /*   class CustomAdapter extends ArrayAdapter {
            int[] images1;
             String[] icies1;
             String[] tryitwhy1;
            public CustomAdapter(@NonNull Context context, String[] resource, String[] textViewResourceId, @NonNull int[] objects) {
                super(context, R.layout.list_icy_ticket, R.id.textView_head, resource);
                this.images1 = objects;
                this.icies1=resource;
                this.tryitwhy1=textViewResourceId;


            }


            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View row = getLayoutInflater().inflate(R.layout.list_icy_ticket,parent,false);
                ImageView imageView = (ImageView)row.findViewById(R.id.imageView4);
                TextView tx_head = (TextView) row.findViewById(R.id.textView_head);
                TextView tx_desc = (TextView) row.findViewById(R.id.textView_desc);
                imageView.setImageResource(images1[position]);
                tx_head.setText(icies1[position]);
                tx_desc.setText(tryitwhy1[position]);
                return row;
            }}
                   */
}








