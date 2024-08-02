package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class BSPharmacy_activity extends AppCompatActivity {
    SliderView sliderView;
    int[] images={R.drawable.n4,R.drawable.n1,R.drawable.n2,R.drawable.n3,R.drawable.n5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bspharmacy);
        getSupportActionBar().setTitle("Doctor of Pharmacy");
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater() .inflate(R.menu.subjectsmenu,menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.m1)
        {
            Intent i=new Intent(this ,bookslibrary.class);
            startActivity(i);
        }
        else  if (id==R.id.m2)
        {
            Intent i=new Intent(this , Pharmacy_CourseCodes.class);
            startActivity(i);
        }
        else if (id==R.id.m3)
        {
            Intent i=new Intent(this , moreapps_activity.class);
            startActivity(i);
        }
        else  if (id==R.id.m4)
        {
            Intent i=new Intent(this , aboutus_activity.class);
            startActivity(i);
        }
        else  if (id==R.id.m5)
        {
            Intent i=new Intent(this , followus.class);
            startActivity(i);
        }
        else  if (id==R.id.m6)
        {
            new AlertDialog.Builder(this)
                    .setIcon(R.drawable.note)
                    .setTitle("Give feedback")
                    .setMessage("You can give your feedback on play store so go to play store and give Rating and feedback.\n\nABASYNIANS HUB")
                    .setNegativeButton("Got it", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).show();
        }
        return super.onOptionsItemSelected(item);
    }
}