package com.hrcoder.HRKINGcoderabasynianshub;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;


public class gpa_Fragment extends Fragment {
    SliderView sliderView;
    int[] images={R.drawable.n4,R.drawable.n1,R.drawable.n2,R.drawable.n3,R.drawable.n5};
CardView c1,c2,c3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_gpa_, container, false);
        //here we find card view id
        c1=v.findViewById(R.id.c1);
        c2=v.findViewById(R.id.c2);
        c3=v.findViewById(R.id.c3);
        sliderView=v.findViewById(R.id.image_slider);
        sliderAdapter sliderAdapter=new sliderAdapter(images);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.SWAP);
        sliderView.setSliderTransformAnimation(SliderAnimations.GATETRANSFORMATION);
        sliderView.startAutoCycle();
        //here we set onclick listener on cardview
      c1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent=new Intent(getActivity(),selectgpatype_activity.class); //here we go fragment to activity
              startActivity(intent);
          }
      });
        //here we set onclick listener on cardview
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),calculator_activity.class); //here we go fragment to activity
                startActivity(intent);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(gpa_Fragment.super.getContext())
                        .setIcon(R.drawable.ic_baseline_speaker_notes_24)
                        .setTitle("Important Message")
                        .setMessage("Hi Dear! This feature is very useful for all students. In some few new updates we will add this feature.")
                        .setPositiveButton("contact", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent=new Intent(gpa_Fragment.super.getContext(),followus.class);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }).show();
            }
        });
        return v;
    }
}