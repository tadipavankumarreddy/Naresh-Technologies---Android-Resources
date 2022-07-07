package com.nareshittechnologies.inshortnews;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class NewsArticlesAdapter extends RecyclerView.Adapter<NewsArticlesAdapter.NewsArticlesViewHolder> {

    Context context;
    DataSource dataSource;

    public NewsArticlesAdapter(Context context, DataSource dataSource) {
        this.context = context;
        this.dataSource = dataSource;
    }

    @NonNull
    @Override
    public NewsArticlesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.one_row_design,parent,false);
        return new NewsArticlesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsArticlesViewHolder holder, int position) {
        holder.news_title.setText(dataSource.getData().get(position).getTitle());
        Glide.with(context).load(dataSource.getData().get(position).getImageUrl()).into(holder.news_banner);
    }

    @Override
    public int getItemCount() {
        return dataSource.getData().size();
    }

    public class NewsArticlesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView news_banner;
        TextView news_title;
        public NewsArticlesViewHolder(@NonNull View itemView) {
            super(itemView);
            news_banner = itemView.findViewById(R.id.imageView);
            news_title = itemView.findViewById(R.id.news_title);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int pos = getAdapterPosition();
            Datum datum = dataSource.getData().get(pos);
            Intent intent = new Intent(context,DetailsActivity.class);
            intent.putExtra("DATA",datum);
            context.startActivity(intent);
        }
    }
}
