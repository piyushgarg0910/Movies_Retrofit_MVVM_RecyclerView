package com.example.android.movies.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class MoviePages {

    @SerializedName("results")
    private ArrayList<Movie> mResults;// = new ArrayList<>();

    @SerializedName("page")
    private Integer mPage;

    @SerializedName("total_results")
    private Integer tResults;

    @SerializedName("total_pages")
    private Integer tPages;

    public MoviePages(ArrayList<Movie> mResults, Integer mPage, Integer tResults, Integer tPages) {
        this.mResults = mResults;
        this.mPage = mPage;
        this.tResults = tResults;
        this.tPages = tPages;
    }


    public ArrayList<Movie> getmResults() {
        return mResults;
    }

    public void setmResults(ArrayList<Movie> mResults) {
        this.mResults = mResults;
    }

    public Integer getmPage() {
        return mPage;
    }

    public void setmPage(Integer mPage) {
        this.mPage = mPage;
    }

    public Integer gettResults() {
        return tResults;
    }

    public void settResults(Integer tResults) {
        this.tResults = tResults;
    }

    public Integer gettPages() {
        return tPages;
    }

    public void settPages(Integer tPages) {
        this.tPages = tPages;
    }
}
