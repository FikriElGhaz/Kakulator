package com.fikri.apple.sholatschedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.fikri.apple.sholatschedule.models.ItemsItem;
import com.fikri.apple.sholatschedule.models.ResponseSchedule;
import com.fikri.apple.sholatschedule.networks.APIService;
import com.fikri.apple.sholatschedule.networks.ConfigRetrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class JadwalSholatActivity extends AppCompatActivity {

    TextView location,shubuh,dzuhur,ashar,magrib,isya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_sholat);

        location = findViewById(R.id.location);
        shubuh = findViewById(R.id.shubuh);
        dzuhur = findViewById(R.id.dzuhur);
        ashar = findViewById(R.id.ashar);
        magrib = findViewById(R.id.magrib);
        isya = findViewById(R.id.isya);
        
        loadData();
    }

    private void loadData() {
        Intent intent = getIntent();
        String city = intent.getStringExtra("city");

        APIService service = ConfigRetrofit.getAPI().create(APIService.class);

        service.getJadwal(city).enqueue(new Callback<ResponseSchedule>() {
            @Override
            public void onResponse(Call<ResponseSchedule> call, Response<ResponseSchedule> response) {
                List<ItemsItem> jadwal = response.body().getItems();

                location.setText(String.format(response.body().getQuery() + "%"
                ,", " + response.body().getState() + ", " + response.body().getCountry()));

                for (ItemsItem data:jadwal){
                    shubuh.setText(data.getFajr());
                    dzuhur.setText(data.getDhuhr());
                    ashar.setText(data.getAsr());
                    magrib.setText(data.getMaghrib());
                    isya.setText(data.getIsha());
                }if (response.isSuccessful()){
                    Log.d("RESPONSE", "SUCCES");
                }else {
                    Log.d("RESPONSE", "FAILED FETC DATA");
                }
            }

            @Override
            public void onFailure(Call<ResponseSchedule> call, Throwable t) {

                Log.d("RESPONSE", "ERROR");
                t.printStackTrace();

            }
        });
    }
}
