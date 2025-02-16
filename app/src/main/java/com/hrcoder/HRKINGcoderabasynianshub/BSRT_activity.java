package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class BSRT_activity extends AppCompatActivity {
    SliderView sliderView;
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41,c42,c43,c44,c45,c46,c47,c48,c49,c50;

    int[] images={R.drawable.n4,R.drawable.n1,R.drawable.n2,R.drawable.n3,R.drawable.n5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsrt);
        getSupportActionBar().setTitle("Radiology Technology");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        sliderView=findViewById(R.id.image_slider);
        sliderAdapter sliderAdapter=new sliderAdapter(images);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        c5=findViewById(R.id.c5);
        c6=findViewById(R.id.c6);
        c7=findViewById(R.id.c7);
        c8=findViewById(R.id.c8);
        c9=findViewById(R.id.c9);
        c10=findViewById(R.id.c10);
        c11=findViewById(R.id.c11);
        c12=findViewById(R.id.c12);
        c13=findViewById(R.id.c13);
        c14=findViewById(R.id.c14);
        c15=findViewById(R.id.c15);
        c16=findViewById(R.id.c16);
        c17=findViewById(R.id.c17);
        c18=findViewById(R.id.c18);
        c19=findViewById(R.id.c19);
        c20=findViewById(R.id.c20);
        c21=findViewById(R.id.c21);
        c22=findViewById(R.id.c22);
        c23=findViewById(R.id.c23);
        c24=findViewById(R.id.c24);
        c25=findViewById(R.id.c25);
        c26=findViewById(R.id.c26);
        c27=findViewById(R.id.c27);
        c28=findViewById(R.id.c28);
        c29=findViewById(R.id.c29);
        c30=findViewById(R.id.c30);
        c31=findViewById(R.id.c31);
        c32=findViewById(R.id.c32);
        c33=findViewById(R.id.c33);
        c34=findViewById(R.id.c34);
        c35=findViewById(R.id.c35);
        c36=findViewById(R.id.c36);
        c37=findViewById(R.id.c37);
        c38=findViewById(R.id.c38);
        c39=findViewById(R.id.c39);
        c40=findViewById(R.id.c40);
        c41=findViewById(R.id.c41);
        c42=findViewById(R.id.c42);
        c43=findViewById(R.id.c43);
        c44=findViewById(R.id.c44);
        c45=findViewById(R.id.c45);
        c46=findViewById(R.id.c46);
        c47=findViewById(R.id.c47);
        c48=findViewById(R.id.c48);
        c49=findViewById(R.id.c49);
        c50=findViewById(R.id.c50);

        //here we set on click listener on each card view

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT101_subject.class);
                startActivity(i);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT102_subject.class);
                startActivity(i);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT103_subject.class);
                startActivity(i);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,SS104_subject.class);
                startActivity(i);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,SS118_subject.class);
                startActivity(i);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,CS100_subject.class);
                startActivity(i);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT111_subject.class);
                startActivity(i);
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT112_subject.class);
                startActivity(i);
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT113_subject.class);
                startActivity(i);
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,SS124_subject.class);
                startActivity(i);
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,SS108_subject.class);
                startActivity(i);
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT201_subject.class);
                startActivity(i);
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT202_subject.class);
                startActivity(i);
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT203_subject.class);
                startActivity(i);
            }
        });
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT204_subject.class);
                startActivity(i);
            }
        });
        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT205_subject.class);
                startActivity(i);
            }
        });
        c17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,SS211_subject.class);
                startActivity(i);
            }
        });
        c18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT210_subject.class);
                startActivity(i);
            }
        });
        c19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT211_subject.class);
                startActivity(i);
            }
        });
        c20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT212_subject.class);
                startActivity(i);
            }
        });
        c21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT213_subject.class);
                startActivity(i);
            }
        });
        c22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT214_subject.class);
                startActivity(i);
            }
        });
        c23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT215_subject.class);
                startActivity(i);
            }
        });
        c24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT301_subject.class);
                startActivity(i);
            }
        });
        c25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT302_subject.class);
                startActivity(i);
            }
        });
        c26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT303_subject.class);
                startActivity(i);
            }
        });
        c27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT304_subject.class);
                startActivity(i);
            }
        });
        c28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT305_subject.class);
                startActivity(i);
            }
        });
        c29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT310_subject.class);
                startActivity(i);
            }
        });
        c30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT311_subject.class);
                startActivity(i);
            }
        });
        c31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT312_subject.class);
                startActivity(i);
            }
        });
        c32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT313_subject.class);
                startActivity(i);
            }
        });
        c33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(BSRT_activity.this,RT314_subject.class);
                startActivity(i);

            }
        });
        c34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,MT210_subject.class);
                startActivity(i);
            }
        });
        c35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,SS403_subject.class);
                startActivity(i);
            }
        });
        c36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT401_subject.class);
                startActivity(i);
            }
        });
        c37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT402_subject.class);
                startActivity(i);
            }
        });
        c38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT403_subject.class);
                startActivity(i);
            }
        });
        c39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT404_subject.class);
                startActivity(i);
            }
        });
        c40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT405_subject.class);
                startActivity(i);
            }
        });
        c41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT406_subject.class);
                startActivity(i);
            }
        });
        c42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT414_subject.class);
                startActivity(i);
            }
        });
        c43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT415_subject.class);
                startActivity(i);
            }
        });
        c44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT416_subject.class);
                startActivity(i);
            }
        });
        c45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSRT_activity.this,RT417_subject.class);
                startActivity(i);
            }
        });
        c46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(BSRT_activity.this)
                        .setIcon(R.drawable.note)
                        .setTitle("Note")
                        .setMessage("Hi Dear! Our Developers Team Working On More New Subjects.In Some Few New Updates Our Team Will Add New Subjects With More Features. Thanks!")
                        .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }).show();
            }
        });
        c47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(BSRT_activity.this)
                        .setIcon(R.drawable.note)
                        .setTitle("Note")
                        .setMessage("Hi Dear! Our Developers Team Working On More New Subjects.In Some Few New Updates Our Team Will Add New Subjects With More Features. Thanks!")
                        .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }).show();
            }
        });
        c48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(BSRT_activity.this)
                        .setIcon(R.drawable.note)
                        .setTitle("Note")
                        .setMessage("Hi Dear! Our Developers Team Working On More New Subjects.In Some Few New Updates Our Team Will Add New Subjects With More Features. Thanks!")
                        .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }).show();
            }
        });
        c49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(BSRT_activity.this)
                        .setIcon(R.drawable.note)
                        .setTitle("Note")
                        .setMessage("Hi Dear! Our Developers Team Working On More New Subjects.In Some Few New Updates Our Team Will Add New Subjects With More Features. Thanks!")
                        .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }).show();
            }
        });
        c50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(BSRT_activity.this)
                        .setIcon(R.drawable.note)
                        .setTitle("Note")
                        .setMessage("Hi Dear! Our Developers Team Working On More New Subjects.In Some Few New Updates Our Team Will Add New Subjects With More Features. Thanks!")
                        .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }).show();
            }
        });


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
            Intent i=new Intent(this , RT_CourseCodes.class);
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