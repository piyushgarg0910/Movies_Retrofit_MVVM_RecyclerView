package com.example.android.movies.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    @SerializedName("vote_count")
    private String mVCount;

    @SerializedName("id")
    private Integer mID;

    @SerializedName("video")
    private Boolean mVideo;

    @SerializedName("vote_average")
    private String mRating;

    @SerializedName("title")
    private String mTitle;

    @SerializedName("popularity")
    private Double mPop;

    @SerializedName("poster_path")
    private String mPoster;

    @SerializedName("original_language")
    private String mLanguage;

    @SerializedName("original_title")
    private String oTitle;

    @SerializedName("genre_ids")
    private List<Integer> mGenre = new ArrayList<>();

    @SerializedName("backdrop_path")
    private String mBackdrop;

    @SerializedName("adult")
    private Boolean mAdult;

    @SerializedName("overview")
    private String mDescription;

    @SerializedName("release_date")
    private String mDate;

    public Movie(String mVCount, Integer mID, Boolean mVideo, String mRating, String mTitle,
                 Double mPop, String mPoster, String mLanguage, String oTitle, List<Integer> mGenre,
                 String mBackdrop, Boolean mAdult, String mDescription, String mDate) {
        this.mVCount = mVCount;
        this.mID = mID;
        this.mVideo = mVideo;
        this.mRating = mRating;
        this.mTitle = mTitle;
        this.mPop = mPop;
        this.mPoster = mPoster;
        this.mLanguage = mLanguage;
        this.oTitle = oTitle;
        this.mGenre = mGenre;
        this.mBackdrop = mBackdrop;
        this.mAdult = mAdult;
        this.mDescription = mDescription;
        this.mDate = mDate;
    }

    public String getmPoster() {
        return mPoster;
    }

    public void setmPoster(String mPoster) {
        this.mPoster = mPoster;
    }

    public String getmTitle() {
        return mTitle;
    }


    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmRating() {
        return mRating;
    }

    public void setmRating(String mRating) {
        this.mRating = mRating;
    }

    public String getmVCount() {
        return mVCount;
    }

    public void setmVCount(String mVCount) {
        this.mVCount = mVCount;
    }

    public Integer getmID() {
        return mID;
    }

    public void setmID(Integer mID) {
        this.mID = mID;
    }

    public Boolean getmVideo() {
        return mVideo;
    }

    public void setmVideo(Boolean mVideo) {
        this.mVideo = mVideo;
    }

    public Double getmPop() {
        return mPop;
    }

    public void setmPop(Double mPop) {
        this.mPop = mPop;
    }

    public String getmLanguage() {
        return mLanguage;
    }

    public void setmLanguage(String mLanguage) {
        this.mLanguage = mLanguage;
    }

    public String getoTitle() {
        return oTitle;
    }

    public void setoTitle(String oTitle) {
        this.oTitle = oTitle;
    }

    public List<Integer> getmGenre() {
        return mGenre;
    }

    public void setmGenre(List<Integer> mGenre) {
        this.mGenre = mGenre;
    }

    public String getmBackdrop() {
        return mBackdrop;
    }

    public void setmBackdrop(String mBackdrop) {
        this.mBackdrop = mBackdrop;
    }

    public Boolean getmAdult() {
        return mAdult;
    }

    public void setmAdult(Boolean mAdult) {
        this.mAdult = mAdult;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }
}