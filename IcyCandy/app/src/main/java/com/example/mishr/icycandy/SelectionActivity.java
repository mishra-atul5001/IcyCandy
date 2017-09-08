package com.example.mishr.icycandy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mishr on 24/08/2017.
 */

public class SelectionActivity extends AppCompatActivity{
    Button bt2;
  //  TextView tx_anima;
    ImageView iv1;
    ImageView iv2;
    boolean visible;
   // final ViewGroup transitionsContainer = (ViewGroup) findViewById(R.id.linearlayout);
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
            bt2 = (Button) findViewById(R.id.but2);
            iv1 = (ImageView) findViewById(R.id.imageView2);
            iv2 = (ImageView)findViewById(R.id.imageView3);
    //    tx_anima = (TextView)findViewById(R.id.textanimation);


           // setupWindowAnimations();

        
    }
  /*  private void setupWindowAnimations() {
        Fade fade = new Fade();
        fade.setDuration(1000);
        getWindow().setEnterTransition(fade);

        Slide slide = new Slide();
        slide.setDuration(1000);
        getWindow().setExitTransition(slide);



    }   */

    public void back(View view) {

        Intent in = new Intent(SelectionActivity.this,MenuActivity.class);
        startActivity(in);
     /*   Toast.makeText(SelectionActivity.this,"Hurrah..!!",Toast.LENGTH_SHORT).show();
        TransitionManager.beginDelayedTransition(transitionsContainer);
        visible = !visible;
        tx_anima.setVisibility(visible ? View.VISIBLE : View.GONE);

       */

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
