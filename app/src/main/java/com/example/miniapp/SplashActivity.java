package com.example.miniapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        CountDownTimer countDownTimer=new CountDownTimer(5000,500) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
                public void onFinish() {
                Intent intent=new Intent(SplashActivity.this,Product_identiyActivity.class);
                startActivity(intent);
                finish();

            }
        }; countDownTimer.start();
    }
}
