package com.fikri.apple.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //deklarasi view
    TextView state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi view
        state = findViewById(R.id.state);

        state.setText("Dalam Posisi On Create");
        Toast.makeText(this, "On Crete", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        state.setText("Dalam Posisi On Start");
        Toast.makeText(this, "On Start", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onResume() {
        state.setText("Dalam Posisi On Resume");
        Toast.makeText(this, "On Resume", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onPause() {
        state.setText("Dalam Posisi On Pause");
        Toast.makeText(this, "On Resume", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        state.setText("Dalam Posisi On Stop");
        Toast.makeText(this, "On Resume", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        state.setText("Dalam Posisi On Destroy");
        Toast.makeText(this, "On Destroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
