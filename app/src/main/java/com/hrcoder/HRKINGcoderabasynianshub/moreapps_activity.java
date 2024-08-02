package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class moreapps_activity extends AppCompatActivity {
    CardView pp1,pp2,pp3,pp4,pp5,pp6,pp7,pp8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moreapps);
        getSupportActionBar().setTitle("More Apps & Games");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        pp1=findViewById(R.id.pp1);
        pp2=findViewById(R.id.pp2);
        pp3=findViewById(R.id.pp3);
        pp4=findViewById(R.id.pp4);
        pp5=findViewById(R.id.pp5);
        pp6=findViewById(R.id.pp6);
        pp7=findViewById(R.id.pp7);
        pp8=findViewById(R.id.pp8);
        pp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.mediafire.com/file/uqsihoygaxbl7ei/app-debug.apk/file");
            }
        });
        pp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.mediafire.com/file/9chx5tgip0oae1i/Flahlight_Controller.apk/file");
            }
        });
        pp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(moreapps_activity.this, "This App is not available. Please try again in some few days. Thanks", Toast.LENGTH_SHORT).show();

            }
        });
        pp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.mediafire.com/file/lr9e882b4wudu1v/app-debug.apk/file");
            }
        });
        pp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(moreapps_activity.this, "This App is not available. Please try again in some few days. Thanks", Toast.LENGTH_SHORT).show();

            }
        });
        pp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(moreapps_activity.this, "This App is not available. Please try again in some few days. Thanks", Toast.LENGTH_SHORT).show();

            }
        });
        pp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(moreapps_activity.this, "This App is not available. Please try again in some few days. Thanks", Toast.LENGTH_SHORT).show();

            }
        });
        pp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(moreapps_activity.this, "This App is not available. Please try again in some few days. Thanks", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}