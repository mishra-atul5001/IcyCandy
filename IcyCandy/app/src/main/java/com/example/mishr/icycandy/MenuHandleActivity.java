package com.example.mishr.icycandy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//This is the Settings Activity for Menu Options

public class MenuHandleActivity extends AppCompatActivity {

    Button phonebook,fb,back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_handle);

        phonebook = (Button) findViewById(R.id.phonebook);
        fb = (Button) findViewById(R.id.fb);
        back = (Button) findViewById(R.id.back);

        phonebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuHandleActivity.this, "Yet to link", Toast.LENGTH_SHORT).show();

            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuHandleActivity.this, "Yet to Link..!!", Toast.LENGTH_SHORT).show();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuHandleActivity.this,MenuActivity.class);
                startActivity(intent);
                Toast.makeText(MenuHandleActivity.this, "Saving Settings...Going Back..!!", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
