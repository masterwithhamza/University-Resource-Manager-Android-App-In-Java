package com.hrcoder.HRKINGcoderabasynianshub;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class sliderAdapter extends SliderViewAdapter<sliderAdapter.Holder> {
    int [] images;
    public sliderAdapter(int [] images)
    {
        this.images=images;
    }
    @Override
    public Holder onCreateViewHolder(ViewGroup parent) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item,parent,false);


        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder viewHolder, int position) {
        viewHolder.imageView.setImageResource(images[position]);

    }

    @Override
    public int getCount() {
        return images.length;
    }
    public class Holder extends SliderViewAdapter.ViewHolder{
  ImageView imageView;
  public Holder(View view)
  {
      super(view);
      imageView=view.findViewById(R.id.imageView2);



  }
    }

}
