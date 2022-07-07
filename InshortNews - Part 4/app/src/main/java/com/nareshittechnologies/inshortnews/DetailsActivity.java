package com.nareshittechnologies.inshortnews;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nareshittechnologies.inshortnews.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    private TextView title_news, content_news;
    private ImageView news_cover_image;
    private Datum datum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle("Inshort news");

        title_news = findViewById(R.id.title_news_details);
        content_news = findViewById(R.id.content);
        news_cover_image = findViewById(R.id.news_banner_image);

        Intent intent = getIntent();
        datum = (Datum) intent.getSerializableExtra("DATA");
        title_news.setText(datum.getTitle());
        content_news.setText(datum.getContent());
        Glide.with(this).load(datum.getImageUrl()).into(news_cover_image);
    }

    public void readMore(View view) {
        String url = datum.getReadMoreUrl().toString();
        if(url!=""){
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            CustomTabColorSchemeParams defaultColors = new CustomTabColorSchemeParams.Builder()
                    .setToolbarColor(Color.parseColor("#0000FF"))
                    .build();
            builder.setDefaultColorSchemeParams(defaultColors);
            CustomTabsIntent customTabsIntent = builder.build();
            customTabsIntent.launchUrl(this, Uri.parse(url));
        }

    }

    public void readOriginal(View view) {
        String url = datum.getUrl();
        if(url!=null){
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            CustomTabsIntent customTabsIntent = builder.build();
            customTabsIntent.launchUrl(this, Uri.parse(url));
        }
    }
}