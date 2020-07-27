package com.fikri.apple.latihannavdrawer;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActivityIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        getSupportActionBar().setTitle("Activity Intent");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button btnPindah2 = findViewById(R.id.btnPindahActivity2);

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
