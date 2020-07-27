package com.fikri.apple.sholatschedule.networks;

import com.fikri.apple.sholatschedule.models.ResponseSchedule;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIService {

    @GET("{city}/daily.json")
    Call<ResponseSchedule> getJadwal(@Path("city")String city);
}
