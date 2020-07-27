package com.fikri.apple.jadwalsholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextInputLayout textInputLocation;
    TextInputEditText searchCity;
    Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchCity = findViewById(R.id.search_city);
        btnSearch = findViewById(R.id.btnSearch);
        textInputLocation = findViewById(R.id.name_text_imput_location);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String city = searchCity.getText().toString().trim();

                Intent intent = new Intent(MainActivity.this, JadwalSholat.class);
                intent.putExtra("city", city);
                startActivity(intent);

                if (searchCity.getText().toString() == null || searchCity.getText().toString().length() == 0) {

                    textInputLocation.setError("Please Enter your Location !");


                    searchCity.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {

                            if (searchCity.getText().toString().length() != 0) {
                                textInputLocation.setErrorEnabled(false);
                            }

                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });


                }
            }
        });

    }
}