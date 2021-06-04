package com.example.damwonkia.Intro;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.damwonkia.MainActivity;
import com.example.damwonkia.R;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;
    TabLayout tabindicator;
    Button btnNext;
    int position = 0 ;
    Button btnGetStarted;
    Animation btnAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //views
        btnNext = findViewById(R.id.btn_intro);
        btnGetStarted = findViewById(R.id.btn_intro_started);
        btnAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.btn_animation);
        tabindicator = findViewById(R.id.tab_indicator);

        //List screen
        final List<ScreenItem> mList = new ArrayList<>();

        mList.add(new ScreenItem("My Profile","What is my name, and what am i",R.drawable.me));
        mList.add(new ScreenItem("My Daily Activity","Just some of my casual day",R.drawable.res));
        mList.add(new ScreenItem("My Gallery","Just a bunch of picture that i found on the internet",R.drawable.gallery));
        mList.add(new ScreenItem("My Music and Video","My Favorite music and video",R.drawable.reel));

        screenPager = findViewById(R.id.viewpager_intro);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,mList);
        screenPager.setAdapter(introViewPagerAdapter);


        //setup tablayout

        tabindicator.setupWithViewPager(screenPager);
        //Button

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                position = screenPager.getCurrentItem();
                if (position < mList.size()){

                    position++;
                    screenPager.setCurrentItem(position);
                }
                if (position == mList.size()-1) {

                    //TODO: show the GETSTARTED Button and hide the indicator and the next button

                    loadLastScreen();
                }

            }
        });

        //tablayout animation
        tabindicator.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if(tab.getPosition() == mList.size()-1){
                    loadLastScreen();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void loadLastScreen() {

        btnNext.setVisibility(View.INVISIBLE);
        btnGetStarted.setVisibility(View.VISIBLE);
        tabindicator.setVisibility(View.INVISIBLE);

        //Button animation
        btnGetStarted.setAnimation(btnAnimation);

    }
}
