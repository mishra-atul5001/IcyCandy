package com.example.mishr.icycandy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

public class SocialWorldActivity extends AppCompatActivity 
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_world);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "I Loved it..!!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.social_world, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.knowaboutus) {
            Toast.makeText(this, "Hurrah..!!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),know_about_us.class);
            startActivity(intent);

            return true;
        }

        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)  {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {
      /*      // Handle the camera action

          This was made by clicking on SocialWorld Activity Class
            HomeFragment Homefragment = new HomeFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.navicy1,Homefragment,Homefragment.getTag()).commit();


         //This was made from folder
           HomeFragment1 homeFragment1 = new HomeFragment1();
            FragmentManager fragmentManager1 = getSupportFragmentManager();
           fragmentManager1.beginTransaction().replace(R.id.navicy1,homeFragment1,homeFragment1.getTag()).commit();


           //  This is tried using Fragment Transaction
           FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.navicy1,homeFragment1,homeFragment1.getTag()).commit();


        //It always says ,found :com.example.mishr.icycandy.HomeFragment   required:android.support.v4.app.FragmentManager; */
            Toast.makeText(this, "Home is always HOME..!!", Toast.LENGTH_SHORT).show();
            HomeFragment homeFragment = new HomeFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
           // fragmentManager.beginTransaction().replace(R.id.layout2,homeFragment,homeFragment.getTag()).commit();


        } else if (id == R.id.trending) {
            Toast.makeText(this, "This is Trending", Toast.LENGTH_SHORT).show();
            TrendingFragment trendingFragment = new TrendingFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
          //  fragmentManager.beginTransaction().replace(R.id.layout2,trendingFragment,trendingFragment.getTag()).commit();


        } else if (id == R.id.myfreinds) {
            Toast.makeText(this, "Friends Colony", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.uploads) {
            Toast.makeText(this, "You haven't uploaded anything..!!", Toast.LENGTH_SHORT).show();


        } else if (id == R.id.nav_share) {
            Toast.makeText(this, "Let the App Complete..Will then Share", Toast.LENGTH_SHORT).show();


        } else if (id == R.id.nav_send) {
            Toast.makeText(this, "Sending..!!", Toast.LENGTH_SHORT).show();


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
