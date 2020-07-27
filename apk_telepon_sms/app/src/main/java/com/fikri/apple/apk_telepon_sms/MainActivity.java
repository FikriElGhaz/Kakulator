package com.fikri.apple.apk_telepon_sms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button teleponn, smss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teleponn = findViewById(R.id.telpon);
        smss = findViewById(R.id.sms);

        teleponn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telponnn = new Intent(MainActivity.this, telpon.class);
                startActivity(telponnn);
            }
        });

        smss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smss = new Intent(MainActivity.this, sms.class);
                startActivity(smss);

            }
        });


    }
}
