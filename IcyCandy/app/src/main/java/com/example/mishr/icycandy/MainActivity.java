package com.example.mishr.icycandy;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
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
        Intent i =new Intent(MainActivity.this,SelectionActivity.class);
        startActivity(i);
    }




    }








