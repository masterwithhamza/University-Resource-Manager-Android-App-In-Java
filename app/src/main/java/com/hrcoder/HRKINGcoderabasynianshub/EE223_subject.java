package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class EE223_subject extends AppCompatActivity {
    CardView pp1,pp2,pp3,pp4,pp5,pp6,pp7,pp8,pp9,pp10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ee223_subject);
        getSupportActionBar().setTitle("EE223");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        pp1=findViewById(R.id.pp1);
        pp2=findViewById(R.id.pp2);
        pp3=findViewById(R.id.pp3);
        pp4=findViewById(R.id.pp4);
        pp5=findViewById(R.id.pp5);
        pp6=findViewById(R.id.pp6);
        pp7=findViewById(R.id.pp7);
        pp8=findViewById(R.id.pp8);
        pp9=findViewById(R.id.pp9);
        pp10=findViewById(R.id.pp10);

        pp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/document/d/1pthdJnzRBjMG3TgdgiYO5XDMulniQNtCTsyWs7RRBGE/edit?usp=sharing");
            }
        });
        pp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/document/d/1pthdJnzRBjMG3TgdgiYO5XDMulniQNtCTsyWs7RRBGE/edit?usp=sharing");
            }
        });
        pp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/document/d/1pthdJnzRBjMG3TgdgiYO5XDMulniQNtCTsyWs7RRBGE/edit?usp=sharing");
            }
        });
        pp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/document/d/1pthdJnzRBjMG3TgdgiYO5XDMulniQNtCTsyWs7RRBGE/edit?usp=sharing");
            }
        });
        pp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/document/d/1pthdJnzRBjMG3TgdgiYO5XDMulniQNtCTsyWs7RRBGE/edit?usp=sharing");
            }
        });
        pp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/document/d/1pthdJnzRBjMG3TgdgiYO5XDMulniQNtCTsyWs7RRBGE/edit?usp=sharing");
            }
        });
        pp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/document/d/1pthdJnzRBjMG3TgdgiYO5XDMulniQNtCTsyWs7RRBGE/edit?usp=sharing");
            }
        });
        pp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/document/d/1pthdJnzRBjMG3TgdgiYO5XDMulniQNtCTsyWs7RRBGE/edit?usp=sharing");
            }
        });
        pp9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/document/d/1pthdJnzRBjMG3TgdgiYO5XDMulniQNtCTsyWs7RRBGE/edit?usp=sharing");
            }
        });
        pp10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/document/d/1pthdJnzRBjMG3TgdgiYO5XDMulniQNtCTsyWs7RRBGE/edit?usp=sharing");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater() .inflate(R.menu.coursemenu,menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.m1) {
            Intent i = new Intent(this, bookslibrary.class);
            startActivity(i);
        } else if (id == R.id.m2) {
            new AlertDialog.Builder(this)
                    .setIcon(R.drawable.note)
                    .setTitle("Important Message")
                    .setMessage("Our Developers team is working on this. In next update you can also get your course slides from here.")
                    .setNegativeButton("Got it", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).show();
        } else if (id == R.id.m3) {
            Intent i = new Intent(this, moreapps_activity.class);
            startActivity(i);
        } else if (id == R.id.m4) {
            Intent i = new Intent(this, aboutus_activity.class);
            startActivity(i);
        } else if (id == R.id.m5) {
            new AlertDialog.Builder(this)
                    .setIcon(R.drawable.playstorerating)
                    .setTitle("Give Rating")
                    .setMessage("You can give Rating to our app on play store.\n\nABASYNIANS HUB")
                    .setNegativeButton("Got it", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).show();
        } else if (id == R.id.m6) {

        }
        return super.onOptionsItemSelected(item);
    }
}