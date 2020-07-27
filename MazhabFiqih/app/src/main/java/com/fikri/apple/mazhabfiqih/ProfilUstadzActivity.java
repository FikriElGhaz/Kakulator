package com.fikri.apple.mazhabfiqih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfilUstadzActivity extends AppCompatActivity {

    CircleImageView fotoProfilUstad;
    TextView namaProfilUstadz,biodataProfilUstadz;
    String namaUstadz,fotoUstadz,biodataUstadz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_ustadz);


        fotoProfilUstad = findViewById(R.id.civFotoProfilUstadz);
        namaProfilUstadz = findViewById(R.id.tvNamaProfilUstadz);
        biodataProfilUstadz = findViewById(R.id.tvBiodataUstadz);

        Intent intent = getIntent();
        namaUstadz = intent.getStringExtra("putName");
        fotoUstadz = intent.getStringExtra("putDesc");
        biodataUstadz = intent.getStringExtra("putImage");

        Picasso.get().load(fotoUstadz).into(fotoProfilUstad);
        namaProfilUstadz.setText(namaUstadz);
        biodataProfilUstadz.setText(biodataUstadz);

        getSupportActionBar().setTitle("Bio " + namaUstadz);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    } @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }


        return super.onOptionsItemSelected(item);


    }


}