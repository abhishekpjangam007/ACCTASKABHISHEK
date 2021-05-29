package com.gracy.accgemplexaj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_grp;
    ArrayList<String> arrayListGroup;
    LinearLayoutManager layoutManagerGroup;
    TextView see1,see2,see3;

    SliderView sliderView;
    int[] images = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sliderView=findViewById(R.id.sldr);

        slider_adapter slider_adapter=new slider_adapter(images);
        sliderView.setSliderAdapter(slider_adapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        see1=findViewById(R.id.see1);
        see1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),seemore_album.class);
                startActivity(intent);
            }
        });
        see2=findViewById(R.id.see2);
        see2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),seemore_singles.class);
                startActivity(intent1);
            }
        });
        see3=findViewById(R.id.see3);
        see3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),seemore_instrumental.class);
                startActivity(intent2);
            }
        });
    }
}