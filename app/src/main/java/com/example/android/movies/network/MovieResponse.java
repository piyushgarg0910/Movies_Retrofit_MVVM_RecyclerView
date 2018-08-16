package com.example.android.movies.network;

import com.example.android.movies.model.Movie;
import com.example.android.movies.model.MoviePages;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MovieResponse {

    @GET("movie/now_playing")
    Call<MoviePages> getMovies(@Query("api_key") String key);
}

