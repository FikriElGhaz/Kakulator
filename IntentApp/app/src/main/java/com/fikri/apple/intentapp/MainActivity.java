package com.fikri.apple.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //todo 1 deklarasi view yang dibuat
    //pendeklarasian

    Button btn_intent, btn_intent_data, btn_intent_implicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //todo 2 inisialasi
        btn_intent = findViewById(R.id.btn_intent);
        btn_intent_data = findViewById(R.id.btn_data);
        btn_intent_implicit = findViewById(R.id.btn_implicit);

        btn_intent.setOnClickListener(this);
        btn_intent_implicit.setOnClickListener(this);
        btn_intent_data.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.btn_intent:
                Intent move = new Intent(this,MainActivity.class);
                startActivity(move);
                break;

            case R.id.btn_implicit:
                Intent move2 = new Intent(this,Implicit.class);
                startActivity(move2);
                break;

            case R.id.btn_data:
                Intent move3 = new Intent(this,explicit.class);
                startActivity(move3);
                break;

        }

    }
}
