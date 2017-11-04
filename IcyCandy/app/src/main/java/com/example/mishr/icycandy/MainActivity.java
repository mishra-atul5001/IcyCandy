package com.example.mishr.icycandy;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.hotshotmenu,menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this,SocialWorldActivity.class);
        Toast.makeText(this, "Try Creating One of Your Own..!!", Toast.LENGTH_SHORT).show();
        startActivity(intent);

        return true;
    }
}








