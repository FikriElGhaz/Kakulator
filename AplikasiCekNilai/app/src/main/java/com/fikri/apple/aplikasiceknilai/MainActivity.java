package com.fikri.apple.aplikasiceknilai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatEditText etNilai;
    AppCompatButton btnCek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNilai = findViewById(R.id.etNilaiNilai);
        btnCek = findViewById(R.id.btnCekNilai);

        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textNilai = etNilai.getText().toString();
                int nilai = 0;

                if (textNilai.isEmpty() || textNilai.length() == 0 || textNilai.equals("")){
                    etNilai.setError("Tolong Isi");
                }
                else (nilai == 100){
                    Toast.makeText(MainActivity.this, "Nilai Anda Semupurna!!", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(MainActivity.this, "Anda Harus Remedi.", Toast.LENGTH_SHORT).show();
                }
                if (nilai < 75){
                    Toast.makeText(MainActivity.this, "Nilai Anda Pas !", Toast.LENGTH_SHORT).show();
                }
                else if (nilai == 100){
                    Toast.makeText(MainActivity.this, "Nilai Anda A..", Toast.LENGTH_SHORT).show();

                }
                else if(nilai > 75){
                    Toast.makeText(MainActivity.this, "Nilai Anda B.", Toast.LENGTH_SHORT).show();

                }




            }
        });
    }
}
