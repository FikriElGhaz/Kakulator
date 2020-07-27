package com.fikri.apple.mazhabfiqih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import com.squareup.picasso.Picasso;

public class DetailKajianActivity extends AppCompatActivity {



    WebView wvKajian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kajian);

        wvKajian = findViewById(R.id.wvKajian);

        Intent detail = getIntent();
        String link = detail.getStringExtra("putLink");


        wvKajian.getSettings().setJavaScriptEnabled(true);

        wvKajian.loadUrl(link);





    }
}
