package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cgpa2_activity extends AppCompatActivity {
    EditText s1,s2;
    Button gpa;
    TextView cgpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa2);
        getSupportActionBar().setTitle("CGPA Calculator");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        s1=findViewById(R.id.s1);
        s2=findViewById(R.id.s2);
        gpa=findViewById(R.id.gpa);
        cgpa=findViewById(R.id.cgpa);
        s1.addTextChangedListener(textWatcher);
        s2.addTextChangedListener(textWatcher);
        gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cgpa2_activity.this, "GPA Calculated Successfully", Toast.LENGTH_SHORT).show();
                Float sub1,sub2,result,add;
                sub1=Float.parseFloat(s1.getText().toString());
                sub2=Float.parseFloat(s2.getText().toString());
                add = sub1+sub2;
                result=add/2;
                cgpa.setText(""+result);

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
            gpa.setEnabled(!sub1.isEmpty() && !sub2.isEmpty());
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

}