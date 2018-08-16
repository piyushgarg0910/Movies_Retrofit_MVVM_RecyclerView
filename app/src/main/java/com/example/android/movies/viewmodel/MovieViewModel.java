package com.example.android.movies.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.movies.model.MoviePages;
import com.example.android.movies.repository.MovieRepo;

public class MovieViewModel extends ViewModel {

    private LiveData<MoviePages> moviePagesLiveDataObservable;// = new MutableLiveData<>();
    private final MovieRepo movieRepo = new MovieRepo();

    public MovieViewModel(){
        //if (moviePagesLiveDataObservable == null)
            moviePagesLiveDataObservable = movieRepo.getMovieList("a07e22bc18f5cb106bfe4cc1f83ad8ed");
    }

    public LiveData<MoviePages> getMoviePagesLiveDataObservable() {
        return moviePagesLiveDataObservable;
    }
}
