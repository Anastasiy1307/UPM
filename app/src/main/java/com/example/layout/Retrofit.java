package com.example.layout;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Retrofit {
    @POST("user/login")
    Call<User> createU(@Body ModelProf modelProf);
}