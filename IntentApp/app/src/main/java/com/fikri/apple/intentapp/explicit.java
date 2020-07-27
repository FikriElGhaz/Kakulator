package com.fikri.apple.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class explicit extends AppCompatActivity {

    final static String KEY_NAME = "nama";
    final static String KEY_DATE = "tanggal";

    EditText nama,tanggal;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explicit);

        nama = findViewById(R.id.nama);
        tanggal = findViewById(R.id.tanggal);
        btnShow = findViewById(R.id.show);


        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nama.getText().toString();
                String date = tanggal.getText().toString();

                Intent moveData = new Intent(explicit.this,tampildataActivity.class);
                moveData.putExtra(KEY_NAME, name);
                moveData.putExtra(KEY_DATE, date);
                startActivity(moveData);

            }
        });
    }
}
