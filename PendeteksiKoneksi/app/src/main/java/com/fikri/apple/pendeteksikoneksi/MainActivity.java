package com.fikri.apple.pendeteksikoneksi;


import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button cek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cek = findViewById(R.id.btnCheck);

        cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getApplication().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo netInfo = cm.getActiveNetworkInfo();
                if (netInfo != null){
                    Toast.makeText(getApplication(), "Terhubung Ke Internet"+netInfo.getTypeName()+" "+netInfo.getSubtypeName(),Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplication(), "Tidak ada Koneksi", Toast.LENGTH_SHORT).show();
                }
            }
        });


        }
    }

