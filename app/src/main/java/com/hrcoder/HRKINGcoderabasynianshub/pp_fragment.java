package com.hrcoder.HRKINGcoderabasynianshub;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;


public class pp_fragment extends Fragment {
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
    SliderView sliderView;
    private ProgressDialog progressDialog;
    int[] images={R.drawable.csdept,R.drawable.sedept,R.drawable.eedept,R.drawable.civildept,R.drawable.dptdept,R.drawable.englishdept,R.drawable.mltdept,R.drawable.radiologydept,R.drawable.mathdept,R.drawable.pharmacydept,R.drawable.masscomdept};
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_pp_fragment, container, false);
        sliderView=view.findViewById(R.id.image_slider);
        sliderAdapter sliderAdapter=new sliderAdapter(images);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.DROP);
        sliderView.setSliderTransformAnimation(SliderAnimations.SPINNERTRANSFORMATION);
        sliderView.startAutoCycle();
        progressDialog=new ProgressDialog(pp_fragment.super.getContext());
        c1=view.findViewById(R.id.c1);
        c2=view.findViewById(R.id.c2);
        c3=view.findViewById(R.id.c3);
        c4=view.findViewById(R.id.c4);
        c5=view.findViewById(R.id.c5);
        c6=view.findViewById(R.id.c6);
        c7=view.findViewById(R.id.c7);
        c8=view.findViewById(R.id.c8);
        c9=view.findViewById(R.id.c9);
        c10=view.findViewById(R.id.c10);
        c11=view.findViewById(R.id.c11);
        c12=view.findViewById(R.id.c12);
        c13=view.findViewById(R.id.c13);
        c14=view.findViewById(R.id.c14);
        c15=view.findViewById(R.id.c15);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), BSCS_activity.class); //here we go fragment to activity
                startActivity(intent);
            }

        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),BSSE_activity.class); //here we go fragment to activity
                startActivity(intent);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),BSEE_activity.class); //here we go fragment to activity
                startActivity(intent);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),BSCivil_activity.class); //here we go fragment to activity
                startActivity(intent);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),BSDPT_activity.class); //here we go fragment to activity
                startActivity(intent);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),BSEnglish_activity.class); //here we go fragment to activity
                startActivity(intent);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),BSMLT_activity.class); //here we go fragment to activity
                startActivity(intent);
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),BSRT_activity.class); //here we go fragment to activity
                startActivity(intent);
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),BSHND_activity.class); //here we go fragment to activity
                startActivity(intent);
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(pp_fragment.super.getContext())
                        .setIcon(R.drawable.ic_baseline_speaker_notes_24)
                        .setTitle("Message For Pharmacy Students!")
                        .setMessage("Hi Dear! our developers team working on department of Pharmacy.\nyou can contact with our team for more information by clicking on contact button.\n")
                        .setPositiveButton("contact", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent=new Intent(pp_fragment.super.getContext(),followus.class);
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
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(pp_fragment.super.getContext())
                        .setIcon(R.drawable.ic_baseline_speaker_notes_24)
                        .setTitle("Message For Psychology Students!")
                        .setMessage("Hi Dear! our developers team working on department of Psychology.\nyou can contact with our team for more information by clicking on contact button.\n")
                        .setPositiveButton("contact", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent=new Intent(pp_fragment.super.getContext(),followus.class);
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
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(pp_fragment.super.getContext())
                        .setIcon(R.drawable.ic_baseline_speaker_notes_24)
                        .setTitle("Message For Mass Communication Students!")
                        .setMessage("Hi Dear! our developers team working on department of Mass Communication.\nyou can contact with our team for more information by clicking on contact button.\n")
                        .setPositiveButton("contact", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent=new Intent(pp_fragment.super.getContext(),followus.class);
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
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(pp_fragment.super.getContext())
                        .setIcon(R.drawable.ic_baseline_speaker_notes_24)
                        .setTitle("Message For Mathematics Students!")
                        .setMessage("Hi Dear! our developers team working on department of Mathematics.\nyou can contact with our team for more information by clicking on contact button.\n")
                        .setPositiveButton("contact", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent=new Intent(pp_fragment.super.getContext(),followus.class);
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
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(pp_fragment.super.getContext())
                        .setIcon(R.drawable.ic_baseline_speaker_notes_24)
                        .setTitle("Message For Biochemistry Students!")
                        .setMessage("Hi Dear! our developers team working on department of Biochemistry.\nyou can contact with our team for more information by clicking on contact button.\n")
                        .setPositiveButton("contact", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent=new Intent(pp_fragment.super.getContext(),followus.class);
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
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(pp_fragment.super.getContext())
                        .setIcon(R.drawable.ic_baseline_speaker_notes_24)
                        .setTitle("Message For Microbiology Students!")
                        .setMessage("Hi Dear! our developers team working on department of Microbiology.\nyou can contact with our team for more information by clicking on contact button.\n")
                        .setPositiveButton("contact", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent=new Intent(pp_fragment.super.getContext(),followus.class);
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



        return view;
    }
    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}