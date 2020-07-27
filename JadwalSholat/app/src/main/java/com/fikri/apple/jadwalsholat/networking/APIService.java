package com.fikri.apple.jadwalsholat.networking;

import com.fikri.apple.jadwalsholat.model.ResponseSchedule;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIService {

    @GET("{city}/daily.json")
    Call<ResponseSchedule> getJadwal (@Path("city") String city);
}
