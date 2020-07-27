package com.fikri.apple.jajargenjang;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Persegi extends AppCompatActivity {

    EditText sisi1;
    Button hitung,hapus;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        sisi1 = findViewById(R.id.sisi1);
        hasil = findViewById(R.id.hasil);
        hitung = findViewById(R.id.hitung);
        hapus = findViewById(R.id.hapus);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Luas Persegi");

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sisi1.getText().toString().isEmpty()) {
                    sisi1.setError("Isi Sisi!");

                }else {
                    hasil();
                }
            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hapus();

            }
        });
    }

    void hasil() {
        int angka1 = Integer.parseInt(sisi1.getText().toString());

        int total = angka1 * angka1;
        hasil.setText(String.valueOf(total));

    }

    void hapus() {

        sisi1.setText("");
        hasil.setText("Hasil...");


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
