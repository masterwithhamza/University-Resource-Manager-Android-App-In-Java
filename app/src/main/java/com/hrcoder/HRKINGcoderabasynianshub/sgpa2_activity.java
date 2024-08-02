package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sgpa2_activity extends AppCompatActivity {
    EditText chFirst,gpFirst,chSecond,gpSecond;
    Button gpa;
    CardView pro1,pro2,pro3,pro4,pro5;
    TextView sGpa,tCraditH,tGradeP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgpa2);
        getSupportActionBar().setTitle("SGPA Calculator");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        chFirst=findViewById(R.id.chFirst);
        gpFirst=findViewById(R.id.gpFirst);
        chSecond=findViewById(R.id.chSecond);
        gpSecond=findViewById(R.id.gpSecond);
        pro1=findViewById(R.id.pro1);
        pro2=findViewById(R.id.pro2);
        pro3=findViewById(R.id.pro3);
        pro4=findViewById(R.id.pro4);
        pro5=findViewById(R.id.pro5);
        gpa=findViewById(R.id.gpa);
        sGpa=findViewById(R.id.sGpa);
        tCraditH=findViewById(R.id.tCraditH);
        tGradeP=findViewById(R.id.tGradeP);
        chFirst.addTextChangedListener(textWatcher);
        chSecond.addTextChangedListener(textWatcher);
        gpFirst.addTextChangedListener(textWatcher);
        gpSecond.addTextChangedListener(textWatcher);
        gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(sgpa2_activity.this, "GPA Calculated Successfully", Toast.LENGTH_SHORT).show();
                float sub1,sub2;
                float ch1,ch2;
                float gp1,gp2;
                float ch,total,GPA;
                ch1=Float.parseFloat(chFirst.getText().toString());
                ch2=Float.parseFloat(chSecond.getText().toString());
                gp1=Float.parseFloat(gpFirst.getText().toString());
                gp2=Float.parseFloat(gpSecond.getText().toString());
                sub1=ch1*gp1;
                sub2=ch2*gp2;
                total=sub1+sub2;
                ch=(int)ch1+ch2;
                GPA=total/ch;
                tCraditH.setText(""+ch);
                tGradeP.setText(""+total);
                sGpa.setText(""+GPA);
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
                Toast.makeText(sgpa2_activity.this, "Not Available", Toast.LENGTH_SHORT).show();
            }
        });
        pro4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(sgpa2_activity.this, "Not Available", Toast.LENGTH_SHORT).show();
            }
        });
        pro5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.mediafire.com/file/lr9e882b4wudu1v/app-debug.apk/file");
            }
        });
    }
    private TextWatcher textWatcher=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String ch1=chFirst.getText().toString().trim();
            String ch2=chSecond.getText().toString().trim();
            String gp1=gpFirst.getText().toString().trim();
            String gp2=gpSecond.getText().toString().trim();
            gpa.setEnabled(!ch1.isEmpty() && !ch2.isEmpty() && !gp1.isEmpty() && !gp2.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater() .inflate(R.menu.gradingsystemmenu,menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.gs)
        {
            Intent i=new Intent(sgpa2_activity.this , gradingsystem.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}