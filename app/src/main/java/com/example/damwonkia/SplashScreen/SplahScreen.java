package com.example.damwonkia.SplashScreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.damwonkia.Intro.IntroActivity;
import com.example.damwonkia.R;

public class SplahScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splah_screen);

        Thread thread = new Thread(){
            public void run(){
                try {
                  sleep(4000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplahScreen.this, IntroActivity.class));
                }
            }
        };
        thread.start();
    }
}
