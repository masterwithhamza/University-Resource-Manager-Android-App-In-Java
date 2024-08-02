package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class posts extends AppCompatActivity {
    String[] permission={"android.permission.READ_EXTERNAL_STORAGE","android.permission.WRITE_EXTERNAL_STORAGE"};
 private  RecyclerView recyclerView;
 private ArrayList<upload> list;
 private PostAdapter postAdapter;
    private DatabaseReference root=FirebaseDatabase.getInstance().getReference("images");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);
        getSupportActionBar().setTitle("All POSTS");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView image99=findViewById(R.id.image99);
        Button button99=findViewById(R.id.button99);
        recyclerView=findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
       image99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(posts.this,UploadPost.class);
                startActivity(intent);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    requestPermissions(permission,80);
                }
            }
        });
        button99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(posts.this,UploadPost.class);
                startActivity(intent);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    requestPermissions(permission,80);
                }
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
list=new ArrayList<>();
postAdapter=new PostAdapter(this,list);
        recyclerView.setAdapter(postAdapter);
root.addValueEventListener(new ValueEventListener() {
    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {
          for (DataSnapshot dataSnapshot:snapshot.getChildren())
          {
              upload pupload=dataSnapshot.getValue(upload.class);
              list.add(pupload);
              Collections.reverse(list);
          }
          postAdapter.notifyDataSetChanged();
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }
});
    }
    //this function is for toolbar menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater() .inflate(R.menu.postmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.upload) {
            Intent intent=new Intent(posts.this,UploadPost.class);
            startActivity(intent);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(permission,80);
            }
        }
        else if(id==R.id.profile)
        {
            new AlertDialog.Builder(posts.this)
                    .setIcon(R.drawable.note)
                    .setTitle("Important Notes")
                    .setMessage("Hi dear in some next updates you will be able to create your profile.")
                    .setNegativeButton("Thanks", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).show();
        }
        else if(id==R.id.profile1)
        {
            new AlertDialog.Builder(posts.this)
                    .setIcon(R.drawable.note)
                    .setTitle("Important Notes")
                    .setMessage("Hi dear in some next updates you will be able to create your profile.")
                    .setNegativeButton("Thanks", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).show();
        }
        else  if (id==R.id.about)
        {
            Intent i=new Intent(posts.this , aboutus_activity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode==80)
        {
            if(grantResults[0]== PackageManager.PERMISSION_GRANTED)
            {
                Toast.makeText(this, "Upload your pictures", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this, "Allow for post pictures", Toast.LENGTH_SHORT).show();
            }
        }
    }
}