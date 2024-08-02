package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

public class sgpa6_activity extends AppCompatActivity {
    EditText chFirst,gpFirst,chSecond,gpSecond,chThird,gpThird,chForth,gpForth,chfive,gpfive,chsix,gpsix;
    Button gpa;
    TextView sGpa,tCraditH,tGradeP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgpa6);
        getSupportActionBar().setTitle("SGPA Calculator");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        chFirst=findViewById(R.id.chFirst);
        gpFirst=findViewById(R.id.gpFirst);
        chSecond=findViewById(R.id.chSecond);
        gpSecond=findViewById(R.id.gpSecond);
        chThird=findViewById(R.id.chThird);
        gpThird=findViewById(R.id.gpThird);
        chForth=findViewById(R.id.chForth);
        gpForth=findViewById(R.id.gpForth);
        chfive=findViewById(R.id.chFive);
        gpfive=findViewById(R.id.gpFive);
        chsix=findViewById(R.id.chsix);
        gpsix=findViewById(R.id.gpsix);
        gpa=findViewById(R.id.gpa);
        sGpa=findViewById(R.id.sGpa);
        tCraditH=findViewById(R.id.tCraditH);
        tGradeP=findViewById(R.id.tGradeP);
        chFirst.addTextChangedListener(textWatcher);
        chSecond.addTextChangedListener(textWatcher);
        gpFirst.addTextChangedListener(textWatcher);
        gpSecond.addTextChangedListener(textWatcher);
        chThird.addTextChangedListener(textWatcher);
        gpThird.addTextChangedListener(textWatcher);
        chForth.addTextChangedListener(textWatcher);
        gpForth.addTextChangedListener(textWatcher);
        chfive.addTextChangedListener(textWatcher);
        gpfive.addTextChangedListener(textWatcher);
        chsix.addTextChangedListener(textWatcher);
        gpsix.addTextChangedListener(textWatcher);
        gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(sgpa6_activity.this, "GPA Calculated Successfully", Toast.LENGTH_SHORT).show();
                float sub1,sub2,sub3,sub4,sub5,sub6;
                float ch1,ch2,ch3,ch4,ch5,ch6;
                float gp1,gp2,gp3,gp4,gp5,gp6;
                float ch,total,GPA;
                ch1=Float.parseFloat(chFirst.getText().toString());
                ch2=Float.parseFloat(chSecond.getText().toString());
                gp1=Float.parseFloat(gpFirst.getText().toString());
                gp2=Float.parseFloat(gpSecond.getText().toString());
                ch3=Float.parseFloat(chThird.getText().toString());
                gp3=Float.parseFloat(gpThird.getText().toString());
                ch4=Float.parseFloat(chForth.getText().toString());
                gp4=Float.parseFloat(gpForth.getText().toString());
                ch5=Float.parseFloat(chfive.getText().toString());
                gp5=Float.parseFloat(gpfive.getText().toString());
                ch6=Float.parseFloat(chsix.getText().toString());
                gp6=Float.parseFloat(gpsix.getText().toString());
                sub1=ch1*gp1;
                sub2=ch2*gp2;
                sub3=ch3*gp3;
                sub4=ch4*gp4;
                sub5=ch5*gp5;
                sub6=ch6*gp6;
                total=sub1+sub2+sub3+sub4+sub5+sub6;
                ch=(int)ch1+ch2+ch3+ch4+ch5+ch6;
                GPA=total/ch;
                tCraditH.setText(""+ch);
                tGradeP.setText(""+total);
                sGpa.setText(""+GPA);
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
            String gp3=gpThird.getText().toString().trim();
            String ch3=chThird.getText().toString().trim();
            String gp4=gpForth.getText().toString().trim();
            String ch4=chForth.getText().toString().trim();
            String gp5=gpfive.getText().toString().trim();
            String ch5=chfive.getText().toString().trim();
            String gp6=gpsix.getText().toString().trim();
            String ch6=chsix.getText().toString().trim();
            gpa.setEnabled(!ch1.isEmpty() && !ch2.isEmpty() && !gp1.isEmpty() && !gp2.isEmpty() && !gp3.isEmpty() && !ch3.isEmpty() && !gp4.isEmpty() && !ch4.isEmpty() && !gp5.isEmpty() && !ch5.isEmpty() && !gp6.isEmpty() && !ch6.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater() .inflate(R.menu.gradingsystemmenu,menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.gs)
        {
            Intent i=new Intent(sgpa6_activity.this , gradingsystem.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}