package com.example.mishr.icycandy;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mishr on 25/08/2017.
 */

public class ImageEditActivity extends AppCompatActivity {
    ImageView flag;
    TextView tx_bundle;
    public static final int CAMERA_REQUEST = 123;
    static Uri capturedImageUri = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourht_layout);
        flag = (ImageView) findViewById(R.id.imageView5);
        tx_bundle = (TextView) findViewById(R.id.textviewbundle);
        // menulayoutactiviy menulayoutactiviy = (com.example.mishr.icycandy.menulayoutactiviy) getApplicationContext();
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            tx_bundle.setText(bundle.getString("Ice Cream"));
            if (tx_bundle.getText().toString().equalsIgnoreCase("Chocolate")) {
                flag.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic4));
            } else if (tx_bundle.getText().toString().equalsIgnoreCase("Vanilla")) {
                flag.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic6));
            } else if (tx_bundle.getText().toString().equalsIgnoreCase("Butterscotch")) {
                flag.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.icy3));
            } else if (tx_bundle.getText().toString().equalsIgnoreCase("Mango")) {
                flag.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic5));
            } else if (tx_bundle.getText().toString().equalsIgnoreCase("Black")) {
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

    public void changeflavour(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
        notification_service();
    }

    public void camerainvoked(View view) {
          Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
          startActivityForResult(intent,CAMERA_REQUEST);
     /*   Calendar cal = Calendar.getInstance();
        File file = new File(Environment.getExternalStorageDirectory(), (cal.getTimeInMillis() + ".jpg"));
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            file.delete();
            try {
                file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        capturedImageUri = Uri.fromFile(file);
        Intent i = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        i.putExtra(MediaStore.EXTRA_OUTPUT, capturedImageUri);
        startActivityForResult(i, CAMERA_REQUEST); */

    }

    private void notification_service() {
        Bitmap icon1 = BitmapFactory.decodeResource(getResources(), R.drawable.iconic);
        NotificationCompat.BigTextStyle bigTextStyle = new android.support.v4.app.NotificationCompat.BigTextStyle();
        // bigTextStyle.setBigContentTitle("Wow you just did it fantastic..!!");
        //  bigTextStyle.setSummaryText("Show us what you got...!! Share it on your Feed");
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
         if(requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK){
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