package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class followus extends AppCompatActivity {
    CardView pp1,pp2,pp3,pp4,pp5,pp6,pp7,pp8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_followus);
        getSupportActionBar().setTitle("Contact us");
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
                new AlertDialog.Builder(followus.this)
                        .setIcon(R.drawable.note)
                        .setTitle("Email")
                        .setMessage("You can Contact with us using this Email.\n\nhr.developers999@gmail.com")
                        .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }).show();
            }
        });
        pp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://bit.ly/3wcHwSH");
            }
        });
        pp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://twitter.com/hr_developers?t=vPelQrB6mTuUfFMHKSk4IQ&s=08");
            }
        });
        pp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/hr.developers/");
            }
        });
        pp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://web.facebook.com/HR-Developers-105819101772231");
            }
        });
        pp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://hrcoding.blogspot.com/");
            }
        });
        pp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/groups/1019593908922995/?ref=share");
            }
        });
        pp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/channel/UCgG3aEMj3HoW1Dqbvg-9t0g");
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