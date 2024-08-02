package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cgpa6_activity extends AppCompatActivity {
    EditText s1,s2,s3,s4,s5,s6;
    CardView pro1,pro2,pro3,pro4,pro5;
    Button gpa;
    TextView cgpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa6);
        getSupportActionBar().setTitle("CGPA Calculator");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        s1=findViewById(R.id.s1);
        s2=findViewById(R.id.s2);
        s3=findViewById(R.id.s3);
        s4=findViewById(R.id.s4);
        s5=findViewById(R.id.s5);
        s6=findViewById(R.id.s6);
        gpa=findViewById(R.id.gpa);
        cgpa=findViewById(R.id.cgpa);
        pro1=findViewById(R.id.pro1);
        pro2=findViewById(R.id.pro2);
        pro3=findViewById(R.id.pro3);
        pro4=findViewById(R.id.pro4);
        pro5=findViewById(R.id.pro5);
        s1.addTextChangedListener(textWatcher);
        s2.addTextChangedListener(textWatcher);
        s3.addTextChangedListener(textWatcher);
        s4.addTextChangedListener(textWatcher);
        s5.addTextChangedListener(textWatcher);
        s6.addTextChangedListener(textWatcher);
        gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cgpa6_activity.this, "GPA Calculated Successfully", Toast.LENGTH_SHORT).show();
                Float sub1,sub2,sub3,sub4,sub5,sub6,result,add;
                sub1=Float.parseFloat(s1.getText().toString());
                sub2=Float.parseFloat(s2.getText().toString());
                sub3=Float.parseFloat(s3.getText().toString());
                sub4 =Float.parseFloat(s4.getText().toString());
                sub5 =Float.parseFloat(s5.getText().toString());
                sub6 =Float.parseFloat(s6.getText().toString());
                add = sub1+sub2+sub3+sub4+sub5+sub6;
                result=add/6;
                cgpa.setText(""+result);

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
                Toast.makeText(cgpa6_activity.this, "Not Available", Toast.LENGTH_SHORT).show();
            }
        });
        pro4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cgpa6_activity.this, "Not Available", Toast.LENGTH_SHORT).show();
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
            String sub1=s1.getText().toString().trim();
            String sub2=s2.getText().toString().trim();
            String sub3=s3.getText().toString().trim();
            String sub4=s4.getText().toString().trim();
            String sub5=s5.getText().toString().trim();
            String sub6=s6.getText().toString().trim();
            gpa.setEnabled(!sub1.isEmpty() && !sub2.isEmpty() && !sub3.isEmpty() && !sub4.isEmpty()  && !sub5.isEmpty() && !sub6.isEmpty());
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
    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }

}