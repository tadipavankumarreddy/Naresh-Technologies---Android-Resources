package com.nareshittechnologies.inshortnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.INVISIBLE);
        recyclerView = findViewById(R.id.recyclerview);
    }

    public void fetchNews(View view) {
        progressBar.setVisibility(View.VISIBLE);
        FetchInshortNews fin = new FetchInshortNews(this,progressBar,recyclerView);
        // execute method will trigger the doInBackground(...)
        fin.execute("https://inshortsapi.vercel.app/news?category=entertainment");
    }
}


// TODO 1: AS we need Internet to fetch the data - add internet permission in the
//  Manifest file

// TODO 2: Do the networking and get the data first. Inorder to get the data we can use the following
//  AsyncTask - Right now we are going to use it
//  Volley
//  Retrofit
//  Executors in java

// TODO 3: Parse the JSON Response in onPostExecute(...) Method.
