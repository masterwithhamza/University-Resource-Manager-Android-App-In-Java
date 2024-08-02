package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cgpa_activity extends AppCompatActivity {
  CardView c5,c6,c7,c8,c9,c10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa);
        getSupportActionBar().setTitle("SGPA Calculator");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        c5=findViewById(R.id.c5);
        c6=findViewById(R.id.c6);
        c7=findViewById(R.id.c7);
        c8=findViewById(R.id.c8);
        c9=findViewById(R.id.c9);
        c10=findViewById(R.id.c10);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(cgpa_activity.this,sgpa2_activity.class);
                startActivity(i);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(cgpa_activity.this,sgpa3_activity.class);
                startActivity(i);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(cgpa_activity.this,sgpa4_activity.class);
                startActivity(i);
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(cgpa_activity.this,sgpa5_activity.class);
                startActivity(i);
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(cgpa_activity.this,sgpa6_activity.class);
                startActivity(i);
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(cgpa_activity.this,sgpa7_activity.class);
                startActivity(i);
            }
        });

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}