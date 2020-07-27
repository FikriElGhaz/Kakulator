package com.fikri.apple.jajargenjang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    Button f1,f2,f3,f4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = findViewById(R.id.terserah1);
        f2 = findViewById(R.id.terserah2);
        f3 = findViewById(R.id.terserah3);
        f4 = findViewById(R.id.terserah4);


        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent persegi = new Intent(MainActivity.this, Persegi.class);
                startActivity(persegi);
            }
        });

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent persegipanjang = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(persegipanjang);
            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jajargenjang = new Intent(MainActivity.this,Main4Activity.class);
                startActivity(jajargenjang);
            }
        });

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent segitiga = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(segitiga);
            }
        });
    }
}
