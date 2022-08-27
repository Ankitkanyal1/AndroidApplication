package com.example.tabletelling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class GetStarted extends AppCompatActivity {
    private static int SPLASH_SCREEN_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        getSupportActionBar().hide();

     /*   if (auth.getCurrentUser() != null) {
            Intent intent = new Intent(GetStarted.this, MainActivity.class);
            startActivity(intent);
            finish();
        }*/


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(GetStarted.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);

    }
}
