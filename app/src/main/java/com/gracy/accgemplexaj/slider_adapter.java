package com.gracy.accgemplexaj;

import android.provider.ContactsContract;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

//import com.google.android.material.slider.Slider;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class slider_adapter extends SliderViewAdapter<slider_adapter.Holder>{
int[] images;
public slider_adapter(int[] images){
    this.images=images;
}


    @Override
    public Holder onCreateViewHolder(ViewGroup parent) {
    View view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.slideritems,parent,false);
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
        public  Holder(View itemView){
            super(itemView);

            imageView = itemView.findViewById(R.id.img_view);
        }

}
}
