package com.example.recycleviewberita.service;

import com.example.recycleviewberita.model.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsApiInterface {

    @GET("/v2/top-headlines")
    Call<News> getTopHeadLinesNewsByCountry(@Query("country") String country, @Query("apiKey")String apiKey);

    @GET("/v2/top-headlines")
    Call<News> getTopHeadLinesNewsBySource(@Query("sources") String sources, @Query("apiKey")String apiKey);

    @GET("/v2/everything")
    Call<News> getEverythingNewsBySearch(@Query("q") String q, @Query("apiKey")String apiKey);
}
