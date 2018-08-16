package com.example.android.movies.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.movies.R;
import com.example.android.movies.view.MainActivity;

public class MainViewHolder extends RecyclerView.ViewHolder {
    TextView titleText, descText, itemNum;
    ImageView imageView;

    public MainViewHolder(View itemView) {
        super(itemView);
        titleText = (TextView)itemView.findViewById(R.id.title_text);
        descText = (TextView)itemView.findViewById(R.id.description);
        itemNum = (TextView)itemView.findViewById(R.id.num);
        imageView = (ImageView)itemView.findViewById(R.id.image_view);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),
                        v.getContext().getString(R.string.Title) + ": " +
                                String.valueOf(getAdapterPosition()+1),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
