package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class English_CourseCodes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_course_codes);
        getSupportActionBar().setTitle("Check course code by name");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}