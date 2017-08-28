package com.example.mishr.icycandy;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.support.v7.widget.Toolbar;
import android.transition.Slide;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

          Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.but1);

    }






    public void submit(View view) {
        Intent i =new Intent(MainActivity.this,Selection_activity.class);
        startActivity(i);
    }




    }








