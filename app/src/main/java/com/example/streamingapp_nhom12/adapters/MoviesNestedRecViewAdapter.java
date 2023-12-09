package com.example.streamingapp_nhom12.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import com.example.streamingapp_nhom12.R;
import com.example.streamingapp_nhom12.activities.ViewAllMoviesActivity;
import com.example.streamingapp_nhom12.network.movie.MovieBrief;
import com.example.streamingapp_nhom12.utils.Constants;
import com.example.streamingapp_nhom12.utils.NestedRecViewModel;

public class MoviesNestedRecViewAdapter extends RecyclerView.Adapter<MoviesNestedRecViewAdapter.ViewHolder> {
    private List<NestedRecViewModel> mNestedList;
    private Context mContext;

    public MoviesNestedRecViewAdapter(List<NestedRecViewModel> mNestedList, Context mContext) {
        this.mNestedList = mNestedList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MoviesNestedRecViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MoviesNestedRecViewAdapter.ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.nested_rv_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesNestedRecViewAdapter.ViewHolder holder, int position) {
        switch (mNestedList.get(position).getmGenreId()){
            case 28:
                holder.nested_heading.setText("Action");
                holder.nested_view_all.setOnClickListener(view -> {
                    Intent intent = new Intent(mContext, ViewAllMoviesActivity.class);
                    intent.putExtra(Constants.VIEW_ALL_MOVIES_TYPE, Constants.ACTION_MOVIES_TYPE);
                    mContext.startActivity(intent);
                });
                break;
            case 12:
                holder.nested_heading.setText("Adventure");
                holder.nested_view_all.setOnClickListener(view -> {
                    Intent intent = new Intent(mContext, ViewAllMoviesActivity.class);
                    intent.putExtra(Constants.VIEW_ALL_MOVIES_TYPE, Constants.ADVENTURE_MOVIES_TYPE);
                    mContext.startActivity(intent);
                });
                break;
            case 16:
                holder.nested_heading.setText("Animation");
                holder.nested_view_all.setOnClickListener(view -> {
                    Intent intent = new Intent(mContext, ViewAllMoviesActivity.class);
                    intent.putExtra(Constants.VIEW_ALL_MOVIES_TYPE, Constants.ANIMATION_MOVIES_TYPE);
                    mContext.startActivity(intent);
                });
                break;
            case 35:
                holder.nested_heading.setText("Comedy");
                holder.nested_view_all.setOnClickListener(view -> {
                    Intent intent = new Intent(mContext, ViewAllMoviesActivity.class);
                    intent.putExtra(Constants.VIEW_ALL_MOVIES_TYPE, Constants.COMEDY_MOVIES_TYPE);
                    mContext.startActivity(intent);
                });
                break;
            case 18:
                holder.nested_heading.setText("Drama");
                holder.nested_view_all.setOnClickListener(view -> {
                    Intent intent = new Intent(mContext, ViewAllMoviesActivity.class);
                    intent.putExtra(Constants.VIEW_ALL_MOVIES_TYPE, Constants.DRAMA_MOVIES_TYPE);
                    mContext.startActivity(intent);
                });
                break;
            case 14:
                holder.nested_heading.setText("Fantasy");
                holder.nested_view_all.setOnClickListener(view -> {
                    Intent intent = new Intent(mContext, ViewAllMoviesActivity.class);
                    intent.putExtra(Constants.VIEW_ALL_MOVIES_TYPE, Constants.FANTASY_MOVIES_TYPE);
                    mContext.startActivity(intent);
                });
                break;
            case 36:
                holder.nested_heading.setText("History");
                holder.nested_view_all.setOnClickListener(view -> {
                    Intent intent = new Intent(mContext, ViewAllMoviesActivity.class);
                    intent.putExtra(Constants.VIEW_ALL_MOVIES_TYPE, Constants.HISTORY_MOVIES_TYPE);
                    mContext.startActivity(intent);
                });
                break;
            case 27:
                holder.nested_heading.setText("Horror");
                holder.nested_view_all.setOnClickListener(view -> {
                    Intent intent = new Intent(mContext, ViewAllMoviesActivity.class);
                    intent.putExtra(Constants.VIEW_ALL_MOVIES_TYPE, Constants.HORROR_MOVIES_TYPE);
                    mContext.startActivity(intent);
                });
                break;
            case 878:
                holder.nested_heading.setText("Science Fiction");
                holder.nested_view_all.setOnClickListener(view -> {
                    Intent intent = new Intent(mContext, ViewAllMoviesActivity.class);
                    intent.putExtra(Constants.VIEW_ALL_MOVIES_TYPE, Constants.SCIFI_MOVIES_TYPE);
                    mContext.startActivity(intent);
                });
                break;
            case 10770:
                holder.nested_heading.setText("TV Movie");
                holder.nested_view_all.setOnClickListener(view -> {
                    Intent intent = new Intent(mContext, ViewAllMoviesActivity.class);
                    intent.putExtra(Constants.VIEW_ALL_MOVIES_TYPE, Constants.TV_MOVIES_TYPE);
                    mContext.startActivity(intent);
                });
                break;

        }

        setMovieRecView(holder.nested_recView, mNestedList.get(position).getmMovies());
    }

    @Override
    public int getItemCount() {
        return mNestedList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ConstraintLayout nested_heading_layout;
        public TextView nested_heading;
        public TextView nested_view_all;
        public RecyclerView nested_recView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nested_heading_layout = itemView.findViewById(R.id.nested_constraint_layout);
            nested_heading = itemView.findViewById(R.id.nested_heading);
            nested_view_all = itemView.findViewById(R.id.nested_view_all);
            nested_recView = itemView.findViewById(R.id.nested_recView);
        }
    }

    private void setMovieRecView(RecyclerView recyclerView, List<MovieBrief> mMovies){
        MovieBriefSmallAdapter mMoviesAdapter = new MovieBriefSmallAdapter(mMovies, mContext);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(mMoviesAdapter);
    }
}
