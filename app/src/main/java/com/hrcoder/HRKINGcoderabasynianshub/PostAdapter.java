package com.hrcoder.HRKINGcoderabasynianshub;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.viewholder> {
    private ArrayList<upload> mlist;
    private Context context;
    public PostAdapter(Context context,ArrayList<upload> mlist)
    {
        this.context=context;
        this.mlist=mlist;
    }
    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.image_item,parent,false);
        return new viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        Glide.with(context).load(mlist.get(position).getimageurl()).into(holder.imageview);
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public static class viewholder extends RecyclerView.ViewHolder{
 ImageView imageview;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            imageview=itemView.findViewById(R.id.image_view_upload);
        }

    }

}
