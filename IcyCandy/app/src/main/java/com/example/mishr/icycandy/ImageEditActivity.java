package com.example.mishr.icycandy;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.jar.Attributes;

import static java.util.jar.Attributes.*;

/**
 * Created by mishr on 25/08/2017.
 */

public class ImageEditActivity extends AppCompatActivity {
    //  private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 1;
    ImageView flag;
    TextView tx_bundle;
    public static final int CAMERA_REQUEST = 123;
    // static Uri capturedImageUri = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourht_layout);
        flag = (ImageView) findViewById(R.id.imageView5);
        LinearLayout l1 = (LinearLayout) findViewById(R.id.layout);
        tx_bundle = (TextView) findViewById(R.id.textviewbundle);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            tx_bundle.setText(bundle.getString("Ice Cream"));
            if (tx_bundle.getText().toString().equals("Chocolate")) {
                flag.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic4));
            } else if (tx_bundle.getText().toString().equals("Vanilla")) {
                flag.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic6));
            } else if (tx_bundle.getText().toString().equals("ButterScotch")) {
                flag.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.icy3));
            } else if (tx_bundle.getText().toString().equals("Mango")) {
                flag.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic5));
            } else if (tx_bundle.getText().toString().equals("Black")) {
                flag.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic7));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.pinit:
                Toast.makeText(this, "Saving..!!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.mysocialworld:
                Toast.makeText(this, "Welcome To Our Icy World..!!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,SocialWorldActivity.class);
                startActivity(intent);

                      break;
            case R.id.loveit:
                Toast.makeText(this, "Thanks for your Love..!!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.socialmedia:
                Toast.makeText(this, "Loading..!!", Toast.LENGTH_SHORT).show();
                Intent in = new Intent(this,MenuHandleActivity.class);
                startActivity(in);
                break;
            case R.id.rateit:
                Toast.makeText(this, "Visit Play Store", Toast.LENGTH_SHORT).show();
                break;




        }

        return super.onOptionsItemSelected(item);
    }

    public void changeflavour(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
        notification_service();
    }

    public void camerainvoked(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, CAMERA_REQUEST);

    }

    private void notification_service() {
        Bitmap icon1 = BitmapFactory.decodeResource(getResources(), R.drawable.iconic);
        NotificationCompat.BigTextStyle bigTextStyle = new android.support.v4.app.NotificationCompat.BigTextStyle();
        NotificationCompat.Builder mbuilder = (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.notifyicon)
                .setContentTitle("Flavour Problem..?")
                .setContentText("Request your flavour...We'll get to it..!!")
                .setLargeIcon(icon1)
                .setStyle(bigTextStyle);
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, mbuilder.build());


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            flag.setImageBitmap(photo);

      /*  if (requestCode == CAMERA_REQUEST) {
            //Bitmap photo = (Bitmap) data.getExtras().get("data");
            //imageView.setImageBitmap(photo);
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getApplicationContext().getContentResolver(), capturedImageUri);
                flag.setImageBitmap(bitmap);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }*/
        }
    }
}