package com.fikri.apple.liastsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailSunnahActivity extends AppCompatActivity {

    String title, desc, urlImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sunnah);


        Intent intent = getIntent();
        title = intent.getStringExtra("putTitle");
        desc = intent.getStringExtra("putDesc");
        urlImage = intent.getStringExtra("putImage");


        ImageView ivDetailImage = findViewById(R.id.ivDetailSunnah);
        TextView tvDetailTitle = findViewById(R.id.tvDetailTitle);
        TextView tvDetailDecs = findViewById(R.id.tvDetailDecs);
        Toolbar toolbarDetail = findViewById(R.id.tbDetailSunnah);

        Picasso.get().load(urlImage).into(ivDetailImage);
        tvDetailDecs.setText(desc);
        tvDetailTitle.setText(title);
        setSupportActionBar(toolbarDetail);
        getSupportActionBar().setTitle(title);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);






    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }


        return super.onOptionsItemSelected(item);


    }
}
