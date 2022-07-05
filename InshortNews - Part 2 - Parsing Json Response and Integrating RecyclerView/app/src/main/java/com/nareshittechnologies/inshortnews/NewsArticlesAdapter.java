package com.nareshittechnologies.inshortnews;

import android.content.Context;
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
    List<NewsArticles> articles;

    public NewsArticlesAdapter(Context context, List<NewsArticles> articles) {
        this.context = context;
        this.articles = articles;
    }

    @NonNull
    @Override
    public NewsArticlesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.one_row_design,parent,false);
        return new NewsArticlesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsArticlesViewHolder holder, int position) {
        holder.news_title.setText(articles.get(position).getTitle());
        Glide.with(context).load(articles.get(position).getImageURL()).into(holder.news_banner);
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }

    public class NewsArticlesViewHolder extends RecyclerView.ViewHolder {
        ImageView news_banner;
        TextView news_title;
        public NewsArticlesViewHolder(@NonNull View itemView) {
            super(itemView);
            news_banner = itemView.findViewById(R.id.imageView);
            news_title = itemView.findViewById(R.id.news_title);
        }
    }
}
