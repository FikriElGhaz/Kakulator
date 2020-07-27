package com.fikri.apple.sholatschedule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    AppCompatEditText editSearch;
    AppCompatButton buttonSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editSearch = findViewById(R.id.etCity);
        buttonSearch = findViewById(R.id.btnSearch);

        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String city = editSearch.getText().toString().trim();

                Intent intent = new Intent(MainActivity.this, JadwalSholatActivity.class);
                intent.putExtra("city",city);
                startActivity(intent);

            }
        });
    }
}
