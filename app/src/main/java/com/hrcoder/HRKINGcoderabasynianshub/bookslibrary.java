package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.graphics.ColorSpace;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class bookslibrary extends AppCompatActivity {
ListView mlistview;
SearchView searchView;
    ArrayAdapter <String> adapter;
int images[]={R.drawable.librarybookslogo,R.drawable.librarybookslogo,R.drawable.librarybookslogo,R.drawable.librarybookslogo,R.drawable.librarybookslogo,};
String names[]={"CS106- Starting out with C++","CS100- Introduction to computers","CS200- Object Oriented Programming in C++","NS109- University Physics with Modern Physics","CS304- Introduction to algorithms","Calculus Early Transcendentals (All)"
,"CS106- C++ How to Program","CS106- Optimized C++","CS208- Active java language","CS208- java language","CS251- Assembly Language","English Language Book (All)"
,"MG100- Financial accounting"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookslibrary);
        getSupportActionBar().setTitle("Abasyn Books Library");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mlistview=findViewById(R.id.listview);
        searchView=findViewById(R.id.searchview);
        ArrayAdapter adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,names);
       // CustomAdapter customAdapter=new CustomAdapter();
        mlistview.setAdapter(adapter);
        mlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    gotoUrl("https://docs.google.com/document/d/1pthdJnzRBjMG3TgdgiYO5XDMulniQNtCTsyWs7RRBGE/edit?usp=sharing");
                }
            }
        });
      searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
          @Override
          public boolean onQueryTextSubmit(String query) {
              adapter.getFilter().filter(query);
              return false;
          }

          @Override
          public boolean onQueryTextChange(String newText) {
              adapter.getFilter().filter(newText);
              return false;
          }
      });



    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    class CustomAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=getLayoutInflater().inflate(R.layout.customlistview,null);
            ImageView mimageview= view.findViewById(R.id.imageView);
            TextView mtextview=view.findViewById(R.id.textView);
            mimageview.setImageResource(images[position]);
            mtextview.setText(names[position]);
            return view;
        }
    }
    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}