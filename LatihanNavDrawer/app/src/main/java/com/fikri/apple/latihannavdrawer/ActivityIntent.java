package com.fikri.apple.latihannavdrawer;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ActivityIntent extends AppCompatActivity {

    ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        getSupportActionBar().setTitle("Activity Intent");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button btnPindah2 = findViewById(R.id.btnPindahActivity2);

        ivImage = findViewById(R.id.ivGamber);
        Picasso.get().load("https://cdn2.tstatic.net/manado/foto/bank/images/kucing-belang-tiga-gfdgfdfds.jpg").into(ivImage);



        btnPindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(ActivityIntent.this, ActivityIntent2.class);
                startActivity(moveIntent);
            }
        });



    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }


            return super.onOptionsItemSelected(item);




        }




    }
