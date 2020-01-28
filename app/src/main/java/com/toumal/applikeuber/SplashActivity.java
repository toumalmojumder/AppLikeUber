package com.toumal.applikeuber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(){
          @Override
          public void run(){
              try{
                  sleep(5000);
              }
              catch (Exception e){

              }
              finally {
                  Intent welcomeIntent = new Intent(SplashActivity.this,WelcomeActivity.class);
                  startActivity(welcomeIntent);
              }
          }
        };
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
