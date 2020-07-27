package com.fikri.apple.errorlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    AppCompatEditText etUsername, etPassword;
    AppCompatButton btnMasuk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.username);
        etPassword = findViewById(R.id.password);
        btnMasuk = findViewById(R.id.masuk);

        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String etUser = etUsername.getText().toString();
                String etPass = etPassword.getText().toString();

                if (etUser.isEmpty() || etUser.length() == 0 || etUser.equals("")) {
                    etUsername.setError("Tolong Isi Username");
                } else if (etPass.isEmpty() || etUser.length() == 0 || etUser.equals("")) {
                    etPassword.setError("Tolong Isi Password");

                } else if (!etUser.equals("Fikri")) {
                    etUsername.setError("User Salah");
                } else if (!etPass.equals("fikri123")) {
                    etPassword.setError("Password Salah");
                } else {
                    Toast.makeText(MainActivity.this, "Login Berasil", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}