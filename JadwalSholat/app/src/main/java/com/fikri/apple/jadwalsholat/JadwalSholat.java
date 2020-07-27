package com.fikri.apple.jadwalsholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.fikri.apple.jadwalsholat.model.ItemsItem;
import com.fikri.apple.jadwalsholat.model.ResponseSchedule;
import com.fikri.apple.jadwalsholat.networking.APIService;
import com.fikri.apple.jadwalsholat.networking.ConfigRetrofit;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class JadwalSholat extends AppCompatActivity {

    TextView shubuh, dzuhur, ashar, magrib, isya, location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_sholat);

        shubuh = findViewById(R.id.shubuh);
        dzuhur = findViewById(R.id.dzuhur);
        ashar = findViewById(R.id.ashar);
        magrib = findViewById(R.id.magrib);
        isya = findViewById(R.id.isya);
        location = findViewById(R.id.location);
        loadData();

    }

    void loadData(){

        Intent ambilData = getIntent();
        String city = ambilData.getStringExtra("city");

        APIService service = ConfigRetrofit.getAPI().create(APIService.class);
        service.getJadwal(city).enqueue(new Callback<ResponseSchedule>() {
            @Override
            public void onResponse(Call<ResponseSchedule> call, Response<ResponseSchedule> response) {
                List<ItemsItem> jadwal = response.body().getItems();

                location.setText(String.format(response.body().getQuery() + "%s"
                        , ", " + response.body().getState() + ", "+ response.body().getCountry()));

                for (ItemsItem data: jadwal){
                    shubuh.setText(data.getFajr());
                    dzuhur.setText(data.getDhuhr());
                    ashar.setText(data.getAsr());
                    magrib.setText(data.getMaghrib());
                    isya.setText(data.getIsha());
                }

                if (response.isSuccessful()){
                    Log.d("RESPONSE","SUCCES");
                }else {
                    Log.d("RESPONSE","FAILED TO FETCH DATA");

                }

            }

            @Override
            public void onFailure(Call<ResponseSchedule> call, Throwable t) {
                Log.d("RESPONSE","SUCCES");
                t.printStackTrace();

            }
        });

    }
}
