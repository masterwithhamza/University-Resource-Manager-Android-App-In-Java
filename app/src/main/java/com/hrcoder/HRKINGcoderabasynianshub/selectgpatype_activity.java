package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class selectgpatype_activity extends AppCompatActivity {
 CardView c3,c4;
    CardView pro1,pro2,pro3,pro4,pro5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectgpatype);
        getSupportActionBar().setTitle("GPA Calculator");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        pro1=findViewById(R.id.pro1);
        pro2=findViewById(R.id.pro2);
        pro3=findViewById(R.id.pro3);
        pro4=findViewById(R.id.pro4);
        pro5=findViewById(R.id.pro5);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(selectgpatype_activity.this,cgpa_activity.class);
                startActivity(i);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(selectgpatype_activity.this,sgpa_activity.class);
                startActivity(i);
            }
        });
        pro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.mediafire.com/file/uqsihoygaxbl7ei/app-debug.apk/file");
            }
        });
        pro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.mediafire.com/file/9chx5tgip0oae1i/Flahlight_Controller.apk/file");
            }
        });
        pro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(selectgpatype_activity.this, "Not Available", Toast.LENGTH_SHORT).show();
            }
        });
        pro4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(selectgpatype_activity.this, "Not Available", Toast.LENGTH_SHORT).show();
            }
        });
        pro5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.mediafire.com/file/lr9e882b4wudu1v/app-debug.apk/file");
            }
        });

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}