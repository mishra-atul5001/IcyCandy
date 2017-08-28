package com.example.mishr.icycandy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.transition.Slide;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by mishr on 24/08/2017.
 */

public class SelectionActivity extends AppCompatActivity{
    Button bt2;
    ImageView iv1;
    ImageView iv2;
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
            bt2 = (Button) findViewById(R.id.but2);
            iv1 = (ImageView) findViewById(R.id.imageView2);
            iv2 = (ImageView)findViewById(R.id.imageView3);
            setupWindowAnimations();

        
    }
    private void setupWindowAnimations() {
        Fade fade = new Fade();
        fade.setDuration(1000);
        getWindow().setEnterTransition(fade);

        Slide slide = new Slide();
        slide.setDuration(1000);
        getWindow().setExitTransition(slide);



    }

    public void back(View view) {
        Intent in = new Intent(SelectionActivity.this,MenuActivity.class);
        startActivity(in);
        Toast.makeText(SelectionActivity.this,"Hurrah..!!",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
