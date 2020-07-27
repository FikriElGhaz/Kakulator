package com.fikri.apple.listpahlawan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailCardActivity extends AppCompatActivity {

    String name, form, photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_card);

        Intent intent = getIntent();
        name = intent.getStringExtra("putName");
        form = intent.getStringExtra("putForm");
        photo = intent.getStringExtra("putImage");
        getSupportActionBar().setTitle("Bio " + name);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView ivDetailImage = findViewById(R.id.ivDetailSunnah);
        TextView tvDetailTitle = findViewById(R.id.tvDetailTitle);
        TextView tvDetailDecs = findViewById(R.id.tvDetailDecs);


        Picasso.get().load(photo).into(ivDetailImage);
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