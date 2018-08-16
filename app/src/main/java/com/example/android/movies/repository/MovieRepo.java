package com.example.android.movies.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.widget.Toast;

import com.example.android.movies.adapter.MyAdapter;
import com.example.android.movies.model.MoviePages;
import com.example.android.movies.network.MovieAPI;
import com.example.android.movies.network.MovieResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieRepo {

    private MovieResponse movieResponse;

    public LiveData<MoviePages> getMovieList(String key){
        final MutableLiveData<MoviePages> moviePagesMutableLiveData = new MutableLiveData<>();

        movieResponse = MovieAPI.getRetrofitInstance().create(MovieResponse.class);

        movieResponse.getMovies(key).enqueue(new Callback<MoviePages>() {
            @Override
            public void onResponse(Call<MoviePages> call, Response<MoviePages> response) {
                moviePagesMutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<MoviePages> call, Throwable t) {

            }
        });

        return moviePagesMutableLiveData;
    }

    /*MovieResponse movieResponse = MovieAPI.getRetrofitInstance().create(MovieResponse.class);
    Call<MoviePages> call = movieResponse.getMovies("a07e22bc18f5cb106bfe4cc1f83ad8ed");

    }call.enqueue(new Callback<MoviePages>() {
        @Override
        public void onResponse(Call<MoviePages> call, Response<MoviePages> response) {
            recyclerView.setLayoutManager(layoutManager);
            MyAdapter myAdapter = new MyAdapter(getContext(),response.body());
            recyclerView.setAdapter(myAdapter);
        }

        @Override
        public void onFailure(Call<MoviePages> call, Throwable t) {
            Toast.makeText(getContext(),"Some Error",Toast.LENGTH_SHORT).show();
        }
    });*/


}
