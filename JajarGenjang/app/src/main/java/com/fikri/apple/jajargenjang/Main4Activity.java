package com.fikri.apple.jajargenjang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    EditText alas, tinggi;
    Button hitung,hapus;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        alas = findViewById(R.id.alas);
        tinggi = findViewById(R.id.tinggi);
        hasil = findViewById(R.id.hasil);
        hitung = findViewById(R.id.hitung);
        hapus = findViewById(R.id.hapus);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Luas Jajar Genjang");


        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (alas.getText().toString().isEmpty()) {
                    alas.setError("Isi Alas!");

                } else if(tinggi.getText().toString().isEmpty()){
                    tinggi.setError("Isi Tinggi!");
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
        int angka1 = Integer.parseInt(alas.getText().toString());
        int angka2 = Integer.parseInt(tinggi.getText().toString());

        int total = angka1 * angka2;
        hasil.setText(String.valueOf(total));

    }

    void hapus() {

        alas.setText("");
        tinggi.setText("");
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
