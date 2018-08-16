package com.example.android.movies.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.movies.R;
import com.example.android.movies.model.MoviePages;



public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    MoviePages movieArrayList;

    /*public MyAdapter(Context context,MoviePages movieArrayList){
        this.context = context;
        this.movieArrayList = movieArrayList;
    }*/

    public void setMovieArrayList(MoviePages movieArrayList) {
        this.movieArrayList = movieArrayList;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        if (movieArrayList == null)
            return 0;
        else
            return movieArrayList.getmResults().size();
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        String title = context.getString(R.string.Title) + ": " + movieArrayList.getmResults().get(position).getmTitle();
        String description = context.getString(R.string.Description)+ ": " + movieArrayList.getmResults().get(position).getmDescription();
        String ratings = context.getString(R.string.Ratings) + ": " + movieArrayList.getmResults().get(position).getmRating();
        Drawable drawable = context.getDrawable(R.drawable.ic_android);
        ((MainViewHolder)holder).titleText.setText(title);
        ((MainViewHolder)holder).descText.setText(description);
        ((MainViewHolder)holder).itemNum.setText(ratings);
        ((MainViewHolder)holder).imageView.setImageDrawable(drawable);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout,
                parent, false);
        context = parent.getContext();
        return new MainViewHolder(view);
    }
}
