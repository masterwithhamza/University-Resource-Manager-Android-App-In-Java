package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class BSBiochemistry_activity extends AppCompatActivity {
    int[] images={R.drawable.n4,R.drawable.n1,R.drawable.n2,R.drawable.n3,R.drawable.n5};
    SliderView sliderView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsbiochemistry);
        getSupportActionBar().setTitle(" BS Biochemistry");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        sliderView=findViewById(R.id.image_slider);
        sliderAdapter sliderAdapter=new sliderAdapter(images);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}