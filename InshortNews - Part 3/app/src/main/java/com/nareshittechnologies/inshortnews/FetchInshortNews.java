package com.nareshittechnologies.inshortnews;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

/**
 * Make sure to extend the class to AsyncTask
 * You are supposed to pass three generic Data Types
 * 1. for doInBackground(...) - To perform the long running operation
 * 2. for publishProgress(...) - To Update the progress
 * 3. for onPostExecute(...) - To publish the results to the user
 * */
public class FetchInshortNews extends AsyncTask<String,Void,String> {

    private Context context;
    private ProgressBar progressBar;
    private RecyclerView recyclerView;

    public FetchInshortNews(Context context, ProgressBar progressBar, RecyclerView recyclerView) {
        this.context = context;
        this.progressBar = progressBar;
        this.recyclerView = recyclerView;
    }

    /*When ever we extend a class to AsyncTask class, doInBackground(...) has to be overrided without fail.*/
    @Override
    protected String doInBackground(String... strings) {
        try {
            URL link = new URL(strings[0]);
            HttpsURLConnection connection = (HttpsURLConnection) link.openConnection();
            // Get the data out of the connection and read it
            InputStream is = connection.getInputStream();
            String line = "";
            StringBuilder stringBuilder = new StringBuilder();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            while((line = br.readLine())!=null){
                stringBuilder.append(line);
            }
            return stringBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        /*The data returned from doInBackground(...) method will be arriving at onPostExecute(...)
        * onPostExecute(...) method's responsibility is to publish the results to the user*/

        progressBar.setVisibility(View.INVISIBLE);
        /*List<NewsArticles> articles = new ArrayList<>();
        try {
            JSONObject root = new JSONObject(s);
            JSONArray news_items = root.getJSONArray("data");
            // to loop through the array - we are using for(...)
            for(int i=0; i<news_items.length(); i++){
                JSONObject news = news_items.getJSONObject(i);
                String title = news.getString("title");
                String desc = news.getString("content");
                String image_url = news.getString("imageUrl");
                String readMoreUrl = news.getString("readMoreUrl");
                String url = news.getString("url");
                NewsArticles newsArticles = new NewsArticles(title,desc,image_url,readMoreUrl,url);
                articles.add(newsArticles);
            }

            NewsArticlesAdapter naa = new NewsArticlesAdapter(context,articles);
            recyclerView.setAdapter(naa);
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        Gson gson = new Gson();
        DataSource dataSource = gson.fromJson(s,DataSource.class);
        NewsArticlesAdapter naa = new NewsArticlesAdapter(context,dataSource);
        recyclerView.setAdapter(naa);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

    }
}
