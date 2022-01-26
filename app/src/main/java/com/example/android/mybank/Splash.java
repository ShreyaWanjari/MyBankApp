package com.example.android.mybank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        Thread thread = new Thread(){
            public  void run(){
                try{
                    sleep(3000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                finally{
                    Intent newIntent = new Intent(Splash.this,MainActivity.class);
                    startActivity(newIntent);
                    finish();
                }
            }
        };thread.start();
    }
}