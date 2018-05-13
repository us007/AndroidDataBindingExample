package com.example.utsav.androiddatabindingexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiConfig {
    @GET("json/contacts.json")
    Call<List<User>> getUser();
}
