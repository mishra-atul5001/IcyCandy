package com.example.mishr.icycandy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by mishr on 26/08/2017.
 */

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(SplashScreenActivity.this,getString(R.string.icing),Toast.LENGTH_LONG).show();
       for(int i = 0 ; i<2000;i++){
           //Delaying the Splash Screen
       }
        Thread timer=new Thread()
        {
            public void run() {
                try {
                    sleep(2000);

                } catch (InterruptedException e) {
                   //Just for making splash screen stay longer
                    e.printStackTrace();
                }
                finally
                {
                    Intent i=new Intent(SplashScreenActivity.this,MainActivity.class);
                    finish();
                    startActivity(i);
                }

            }
        };
        timer.start();
       // Intent intent = new Intent(SplashScreenActivity.this,MainActivity.class);
      //  startActivity(intent);
    }
}
