package com.fikri.apple.kakulator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nilai1, nilai2;
    TextView hasil;
    Button tambah, kali, kurang, bagi, hapus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //todo 0 inisialisasi view yang dubuat
        nilai1 = findViewById(R.id.nilai1);
        nilai2 = findViewById(R.id.nilai2);
        hasil = findViewById(R.id.hasil);
        tambah = findViewById(R.id.tambah);
        kali = findViewById(R.id.kali);
        kurang = findViewById(R.id.mines);
        bagi = findViewById(R.id.bagi);
        hapus = findViewById(R.id.hapus);

        //todo 6 atur butto masing masing operator
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai1.getText().toString().isEmpty() ){
                    Toast.makeText(MainActivity.this, "Field can't be Blank", Toast.LENGTH_SHORT).show();
                }else{
                    tambah();
                }
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai1.getText().toString().isEmpty() ){
                    Toast.makeText(MainActivity.this, "Field can't be Blank", Toast.LENGTH_SHORT).show();
                }else{
                    kurang();
                }
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai1.getText().toString().isEmpty() ){
                    Toast.makeText(MainActivity.this, "Field can't be Blank", Toast.LENGTH_SHORT).show();
                }else{
                    kali();
                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai1.getText().toString().isEmpty() ){
                    Toast.makeText(MainActivity.this, "Field can't be Blank", Toast.LENGTH_SHORT).show();
                }else{
                    bagi();
                }
            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hapus();

            }
        });


    }

    //todo 1. Buat methode nama tambah
    void tambah() {

        //simpan inputan user kedalam variable
        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());

        // jumalahkan
        int total = angka1 + angka2;
        hasil.setText(String.valueOf(total));

    }

    //todo 2. Buat methode nama kurang
    void kurang() {

        //simpan inputan user kedalam variable
        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());

        // jumalahkan
        int total = angka1 - angka2;
        hasil.setText(String.valueOf(total));


    }

    //todo 3. Buat methode nama kali
    void kali() {

        //simpan inputan user kedalam variable
        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());

        // jumalahkan
        int total = angka1 * angka2;
        hasil.setText(String.valueOf(total));

    }

    //todo 4. Buat methode nama bagi
    void bagi() {

        //simpan inputan user kedalam variable
        double angka1 = Integer.parseInt(nilai1.getText().toString());
        double angka2 = Integer.parseInt(nilai2.getText().toString());

        // jumalahkan
        double total = angka1 / angka2;
        hasil.setText(String.valueOf(total));
        hasil.setText(String.valueOf(total));



   }

    //.todo 5. Buat methode nama hapus
    void hapus() {

        nilai1.setText("");
        nilai2.setText("");


    }
}
