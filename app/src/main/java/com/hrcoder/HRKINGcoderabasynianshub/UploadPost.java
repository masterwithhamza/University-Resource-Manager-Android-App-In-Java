package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;

public class UploadPost extends AppCompatActivity {
    private static final int PICK_IMAGE_REQUEST=1;
    private Button uploads;
    private ImageView imageView;
    private ProgressBar progressBar;
    private Uri mimageuri;
   // private StorageReference mstorageref;
    private DatabaseReference root=FirebaseDatabase.getInstance().getReference("images");
    private StorageReference reference=FirebaseStorage.getInstance().getReference();
   // private StorageTask muploadtask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_post);
        getSupportActionBar().setTitle("Upload Your Post");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        uploads=findViewById(R.id.upload);
        imageView=findViewById(R.id.imageView);
        progressBar=findViewById(R.id.progressBar);
        progressBar.setVisibility(View.INVISIBLE);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent galaryintent=new Intent();
                galaryintent.setAction(Intent.ACTION_GET_CONTENT);
                galaryintent.setType("image/*");
                startActivityForResult(galaryintent,2);
            }
        });

        uploads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mimageuri!=null)
                {
                    uploadtofirebase(mimageuri);
                    finish();
                    Toast.makeText(UploadPost.this, "Uploading...", Toast.LENGTH_LONG).show();

                }
                else {
                    Toast.makeText(UploadPost.this, "Please Select image before upload", Toast.LENGTH_SHORT).show();
                }
            }


        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==2 && resultCode==RESULT_OK &&data!=null )
        {
            mimageuri=data.getData();
            imageView.setImageURI(mimageuri);
        }
    }
    private void uploadtofirebase(Uri uri)
    {
        StorageReference fileref=reference.child(System.currentTimeMillis()+"." +getfileextension(uri));
        fileref.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
               fileref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                   @Override
                   public void onSuccess(Uri uri) {
                       upload picupload=new upload(uri.toString());
                       String picuploadid=root.push().getKey();
                       root.child(picuploadid).setValue(picupload);
                       Toast.makeText(UploadPost.this, "Uploaded successfully", Toast.LENGTH_SHORT).show();
                       progressBar.setVisibility(View.INVISIBLE);
                   }
               });
            }
        }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {
                progressBar.setVisibility(View.VISIBLE);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                progressBar.setVisibility(View.INVISIBLE);
                Toast.makeText(UploadPost.this, "uploading fail", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private String getfileextension(Uri muri)
    {
        ContentResolver cr=getContentResolver();
        MimeTypeMap mime=MimeTypeMap.getSingleton();
        return mime.getExtensionFromMimeType(cr.getType(muri));
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}