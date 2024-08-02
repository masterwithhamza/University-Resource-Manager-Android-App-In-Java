package com.hrcoder.HRKINGcoderabasynianshub;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent i=new Intent(splash.this,MainActivity.class);
                    startActivity(i);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}