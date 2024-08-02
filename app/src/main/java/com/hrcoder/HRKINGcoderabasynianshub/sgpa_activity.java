package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sgpa_activity extends AppCompatActivity {
   CardView c11,c12,c13,c14,c15,c16,c17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgpa);
        getSupportActionBar().setTitle("CGPA Calculator");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        c11=findViewById(R.id.c11);
        c12=findViewById(R.id.c12);
        c13=findViewById(R.id.c13);
        c14=findViewById(R.id.c14);
        c15=findViewById(R.id.c15);
        c16=findViewById(R.id.c16);
        c17=findViewById(R.id.c17);
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(sgpa_activity.this,cgpa2_activity.class);
                startActivity(i);
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(sgpa_activity.this,cgpa3_activity.class);
                startActivity(i);
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(sgpa_activity.this,cgpa4_activity.class);
                startActivity(i);
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(sgpa_activity.this,cgpa5_activity.class);
                startActivity(i);
            }
        });
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(sgpa_activity.this,cgpa6_activity.class);
                startActivity(i);
            }
        });
        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(sgpa_activity.this,cgpa7_activity.class);
                startActivity(i);
            }
        });
        c17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(sgpa_activity.this,cgpa8_activity.class);
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