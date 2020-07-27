package com.fikri.apple.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.fikri.apple.intentapp.explicit.KEY_DATE;
import static com.fikri.apple.intentapp.explicit.KEY_NAME;

public class tampildataActivity extends AppCompatActivity {

    TextView namadata, tanggaldata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampildata);

        namadata = findViewById(R.id.datanama);
        tanggaldata = findViewById(R.id.datatanggal);

        Intent terimaData = getIntent();
        String name = terimaData.getStringExtra(KEY_NAME);
        String date = terimaData.getStringExtra(KEY_DATE);
        namadata.setText(String.valueOf(name));
        tanggaldata.setText(String.valueOf(date));

    }
}
