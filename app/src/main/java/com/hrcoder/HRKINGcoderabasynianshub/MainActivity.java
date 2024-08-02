package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout; //for creating tabs
    private ViewPager viewPager; //for creating tabs


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //these line of code is for adding logo on toolbar
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //end
        //These lines of codes is used for creating tabs
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new FragmentAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);//end



    }
    //this function is for toolbar menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater() .inflate(R.menu.menu_home,menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.m1)
        {
            Intent i=new Intent(MainActivity.this , moreapps_activity.class);
            startActivity(i);
        }
        else  if (id==R.id.m2)
        {
            Intent i=new Intent(MainActivity.this , aboutus_activity.class);
            startActivity(i);
        }
        else if (id==R.id.m3)
        {
            Intent i=new Intent(MainActivity.this , privacy_activity.class);
            startActivity(i);
        }
        else  if (id==R.id.m4)
        {
            new AlertDialog.Builder(MainActivity.this)
                    .setIcon(R.drawable.ic_baseline_exit_to_app_24)
                    .setTitle("Exit")
                    .setMessage("Are you sure you want to exit from this app ?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).show();
        }
        else  if (id==R.id.m5)
        {
            Intent i=new Intent(MainActivity.this , followus.class);
            startActivity(i);
        }
        else  if (id==R.id.m6)
        {
            new AlertDialog.Builder(MainActivity.this)
                    .setIcon(R.drawable.note)
                    .setTitle("Give feedback")
                    .setMessage("You can give your feedback on play store so go to play store and give Rating and feedback.\n\nABASYNIANS HUB")
                    .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).show();
        }
        else  if (id==R.id.m7)
        {
            gotoUrl("https://chat.whatsapp.com/LB318mNb66R498tkyhrHO9");
        }
        return super.onOptionsItemSelected(item);
    }
    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}