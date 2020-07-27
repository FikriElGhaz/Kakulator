package com.fikri.apple.muslimapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    TextView detailDecs;
    ImageView detailFoto,share;
    String idList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailFoto = findViewById(R.id.detailFoto);
        detailDecs = findViewById(R.id.detailDesc);
        share = findViewById(R.id.share);



        final Intent detail = getIntent();
        idList = detail.getStringExtra("putId");

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (idList){
                    case "1":
                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT,"Share " + detail.getStringExtra("putNamaNabi")+ "\n" + detail.getStringExtra("putCeritaNabi"));
                        sendIntent.setType("text/plain");
                        startActivity(sendIntent);
                        break;

                    case "2":
                        Intent sendIntent2 = new Intent();
                        sendIntent2.setAction(Intent.ACTION_SEND);
                        sendIntent2.putExtra(Intent.EXTRA_TEXT,"Share " + detail.getStringExtra("putNamaSahabat")+ "\n" + detail.getStringExtra("putCeritaSahabat"));
                        sendIntent2.setType("text/plain");
                        startActivity(sendIntent2);
                        break;

                    case "3":
                        Intent sendIntent3 = new Intent();
                        sendIntent3.setAction(Intent.ACTION_SEND);
                        sendIntent3.putExtra(Intent.EXTRA_TEXT,"Share " + detail.getStringExtra("putNamaWali") + "\n" + detail.getStringExtra("putCeritaWali"));
                        sendIntent3.setType("text/plain");
                        startActivity(sendIntent3);
                        break;

                    case "4":
                        Intent sendIntent4 = new Intent();
                        sendIntent4.setAction(Intent.ACTION_SEND);
                        sendIntent4.putExtra(Intent.EXTRA_TEXT,"Share " + detail.getStringExtra("putNamaIlmuan")+ "\n" + detail.getStringExtra("putCeritaIlmuan"));
                        sendIntent4.setType("text/plain");
                        startActivity(sendIntent4);
                        break;


                }

            }
        });

        switch (idList) {
            case "1":
                String fotoNabi = detail.getStringExtra("putFotoNabi");
                String namaNabi = detail.getStringExtra("putNamaNabi");
                String ceritaNabi = detail.getStringExtra("putCeritaNabi");
                Picasso.get().load(fotoNabi).into(detailFoto);
                detailDecs.setText(ceritaNabi);
                break;

            case "2":
                String fotoSahabat = detail.getStringExtra("putFotoSahabat");
                String namaSahabat = detail.getStringExtra("putNamaSahabat");
                String ceritaSahabat = detail.getStringExtra("putCeritaSahabat");
                Picasso.get().load(fotoSahabat).into(detailFoto);
                detailDecs.setText(ceritaSahabat);
                break;

            case "3":
                String fotoWali = detail.getStringExtra("putFotoWali");
                String namaWali = detail.getStringExtra("putNamaWali");
                String ceritaWali = detail.getStringExtra("putCeritaWali");
                Picasso.get().load(fotoWali).into(detailFoto);
                detailDecs.setText(ceritaWali);
                break;

            case "4":
                String fotoIlmuan = detail.getStringExtra("putFotoIlmuan");
                String namaIlmuan = detail.getStringExtra("putNamaIlmuan");
                String ceritaIlmuan = detail.getStringExtra("putCeritaIlmuan");
                Picasso.get().load(fotoIlmuan).into(detailFoto);
                detailDecs.setText(ceritaIlmuan);
                break;

        }



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }


        return super.onOptionsItemSelected(item);


    }
}


