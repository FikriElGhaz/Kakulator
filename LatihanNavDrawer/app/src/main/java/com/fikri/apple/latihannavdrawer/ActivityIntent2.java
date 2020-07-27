package com.fikri.apple.latihannavdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class ActivityIntent2 extends AppCompatActivity {

    CarouselView carouselView;
    int[] listImage = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);
        getSupportActionBar().setTitle("Activity Intent 2");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        carouselView = findViewById(R.id.carouserView);
        carouselView.setPageCount(listImage.length);
        carouselView.setImageListener(imageListener);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(listImage[position]);

        }
    };



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home
        ) {
            finish();
        }


        return super.onOptionsItemSelected(item);




    }




}


