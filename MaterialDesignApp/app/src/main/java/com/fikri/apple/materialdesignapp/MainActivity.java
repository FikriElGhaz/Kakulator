package com.fikri.apple.materialdesignapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    String username, password;
    TextInputLayout textInputUsername,textInputPassword;
    TextInputEditText etUsername,etPassword;
    MaterialButton btnLogin;x

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = "admin";
        password = "admin";

        textInputUsername = findViewById(R.id.name_text_imput_username);
        textInputPassword = findViewById(R.id.name_text_imput_password);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        btnLogin = findViewById(R.id.btnLogin);

        etUsername.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (etUsername.getText().toString().length() != 0){
                    textInputUsername.setErrorEnabled(false);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (etPassword.getText().toString().length() != 0){
                    textInputPassword.setErrorEnabled(false);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUsername.getText().toString() == null || etUsername.getText().toString().length() == 0){

                    textInputUsername.setError("Isi Username !");

                }

                else if (etPassword.getText().toString() == null || etPassword.getText().toString().length() == 0){

                    textInputPassword.setError("Isi Password !");

                } else if (!etUsername.getText().toString().equals(username)) {

                    Toasty.error(MainActivity.this, "Username Salah", Toasty.LENGTH_SHORT, true).show();



                } else if (!etPassword.getText().toString().equals(password)) {


                    Toasty.error(MainActivity.this, "Password Salah", Toasty.LENGTH_SHORT, true).show();


                } else {
                    Toasty.success(MainActivity.this, "Login Berasil", Toasty.LENGTH_SHORT, true).show();
                }
            }

        });


    }
}
