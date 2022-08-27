package com.example.a2splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN_TIME_OUT=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i =new Intent(MainActivity.this,
                        SecondActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_SCREEN_TIME_OUT);

    }
}