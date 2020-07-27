package com.fikri.apple.footballapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class DetailCardActivity extends AppCompatActivity {

    String name, form, imgIcon,imgFlag,imgCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_card);

        Intent intent = getIntent();
        name = intent.getStringExtra("putName");
        form = intent.getStringExtra("putForm");
        imgCountry = intent.getStringExtra("putImageCountry");
        imgFlag = intent.getStringExtra("putImageFlag");
        imgIcon = intent.getStringExtra("putImageIcon");
        getSupportActionBar().setTitle("Detail Negara " + name);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView ivDetailFlag = findViewById(R.id.ivDetailFlag);
        ImageView ivDetailCountry = findViewById(R.id.ivDetailCountry);
        ImageView ivDetailIcon = findViewById(R.id.ivDetailIcon);
        TextView tvDetailTitle = findViewById(R.id.tvDetailTitle);
        TextView tvDetailDecs = findViewById(R.id.tvDetailDecs);

        Picasso.get().load(imgCountry).into(ivDetailCountry);
        Picasso.get().load(imgFlag).into(ivDetailFlag);
        Picasso.get().load(imgIcon).into(ivDetailIcon);
        tvDetailDecs.setText(form);
        tvDetailTitle.setText(name);

    } @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }


        return super.onOptionsItemSelected(item);


    }
}