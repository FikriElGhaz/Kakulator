package com.fikri.apple.muslimapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    CardView  crNabi, crSahabat, crWali, crAbout, crIlmuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        crIlmuan = findViewById(R.id.crIlmuanIslam);
        crNabi = findViewById(R.id.crNabi);
        crSahabat = findViewById(R.id.crSahabat);
        crWali = findViewById(R.id.crWaliSongo);
        crAbout = findViewById(R.id.crAbout);



        crNabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListActivity.class);
                intent.putExtra("putId", "1");
                startActivity(intent);
            }
        });

        crSahabat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListActivity.class);
                intent.putExtra("putId", "2");
                startActivity(intent);
            }
        });

        crIlmuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListActivity.class);
                intent.putExtra("putId", "4");
                startActivity(intent);

            }
        });

        crWali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListActivity.class);
                intent.putExtra("putId", "3");
                startActivity(intent);

            }
        });

        crAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(about);

            }
        });



    }
}
