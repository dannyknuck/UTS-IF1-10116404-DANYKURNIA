package com.example.damwonkia;

//Tanggal : 30 May 2021
//Nama    : Dany Kurnia
//Nim     : 10116404
//Kelas   : IF-1

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.damwonkia.Fragment.HomeFragment;
import com.example.damwonkia.FragmentDaily.DailyFragment;
import com.example.damwonkia.FragmentGallery.GalleryFragment;
import com.example.damwonkia.FragmentMusic.MusicFragment;
import com.example.damwonkia.FragmentProfile.ProfileFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Damwon Kia");

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
                break;

            case R.id.nav_daily_activity:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DailyFragment()).commit();
                break;

            case R.id.nav_gallery:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new GalleryFragment()).commit();
                break;

            case R.id.nav_music:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container , new MusicFragment()).commit();
                break;

            case R.id.nav_profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container , new ProfileFragment()).commit();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
