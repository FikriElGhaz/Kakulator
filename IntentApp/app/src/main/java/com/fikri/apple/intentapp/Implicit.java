package com.fikri.apple.intentapp;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Implicit extends AppCompatActivity implements View.OnClickListener {

    Button btnTelpon, btnSms, btnEmail, btnBrowser, btnCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);

        btnTelpon = findViewById(R.id.telpon);
        btnSms = findViewById(R.id.sms);
        btnEmail = findViewById(R.id.email);
        btnBrowser = findViewById(R.id.browser);
        btnCamera = findViewById(R.id.kamera);

        btnTelpon.setOnClickListener(this);
        btnSms.setOnClickListener(this);
        btnEmail.setOnClickListener(this);
        btnBrowser.setOnClickListener(this);
        btnCamera.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.telpon:
                String nomer = "081317739371";
                Intent callNumber = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + nomer));
                startActivity(callNumber);
                break;

            case R.id.sms:
                String smsto = "081317739371";
                Intent sendSms = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto: " + smsto));
                sendSms.putExtra("sms_body", "Assalammualaikum");
                startActivity(sendSms);
                break;

            case R.id.email:
                String email = "fikrigg31@gmail.com";
                Intent sendEmail = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email));
                startActivity(sendEmail);
                break;

            case R.id.browser:
                String link = "https://www.youtube.com";
                Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(web);
                break;

            case R.id.kamera:
                Intent camera = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(camera);
                break;


        }
    }
}
