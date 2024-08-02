package com.hrcoder.HRKINGcoderabasynianshub;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class event_fragment extends Fragment {

    SliderView sliderView;
    int[] images={R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4};
    CardView c1;
    CardView pro1,pro2,pro3,pro4,pro5;
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v= inflater.inflate(R.layout.fragment_event_fragment, container, false);
       sliderView=v.findViewById(R.id.image_slider);
       sliderAdapter sliderAdapter=new sliderAdapter(images);
       sliderView.setSliderAdapter(sliderAdapter);
       sliderView.setIndicatorAnimation(IndicatorAnimationType.COLOR);
       sliderView.setSliderTransformAnimation(SliderAnimations.TOSSTRANSFORMATION);
       sliderView.startAutoCycle();
       c1=v.findViewById(R.id.c1);
       pro1=v.findViewById(R.id.pro1);
       pro2=v.findViewById(R.id.pro2);
       pro3=v.findViewById(R.id.pro3);
       pro4=v.findViewById(R.id.pro4);
       pro5=v.findViewById(R.id.pro5);
       c1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(getActivity(),posts.class); //here we go fragment to activity
               startActivity(intent);
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
               Toast.makeText(event_fragment.super.getContext(), "Not Available", Toast.LENGTH_SHORT).show();
           }
       });
       pro4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(event_fragment.super.getContext(), "Not Available", Toast.LENGTH_SHORT).show();
           }
       });
       pro5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               gotoUrl("https://www.mediafire.com/file/lr9e882b4wudu1v/app-debug.apk/file");
           }
       });

       return v;
    }
    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}