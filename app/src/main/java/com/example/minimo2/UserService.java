package com.example.minimo2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {
    @GET("/badges")
    Call<Insignias> getInfo(@Path("user") String name);

    @GET("/users/{user}")
    Call<Insignias> getFollower(@Path("user") String name);

}