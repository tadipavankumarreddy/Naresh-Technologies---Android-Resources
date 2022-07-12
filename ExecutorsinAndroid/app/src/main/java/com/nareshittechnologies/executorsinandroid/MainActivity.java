package com.nareshittechnologies.executorsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {

    private String excuser_url =  "https://excuser.herokuapp.com/v1/excuse";
    private TextView textView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.INVISIBLE);
    }


    public void giveExcuse(View view) {
        // Get Execuse from the Excuser API
        progressBar.setVisibility(View.VISIBLE);
        final StringBuffer stringBuffer[] = {new StringBuffer()};
        // TODO 1: Create am Executor Sevice Object
        ExecutorService service = Executors.newSingleThreadExecutor();

        // TODO 2: create the Executor
        service.execute(new Runnable() {

            // run(..) is used to define our task that we have to run in the background (or on Worker thread)
            // run(...) method can be considered as doInBackground(...) of AsyncTask
            @Override
            public void run() {
                // Networking can be done here
                // run(..) works in the background.
                try {
                    URL url = new URL(excuser_url);
                    HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
                    InputStream is = connection.getInputStream();
                    BufferedReader br = new BufferedReader(new InputStreamReader(is));
                    String line = "";
                    stringBuffer[0] = new StringBuffer();
                    while((line = br.readLine())!=null){
                        stringBuffer[0].append(line);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

                // whenever you want to access the android UI toolkit, you can use runOnUiThread(...) and implement a new Runnable inside of it
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        // This works as the onPostExecute(...) method
                        progressBar.setVisibility(View.INVISIBLE);
                        try {
                            JSONArray jsonArray = new JSONArray(stringBuffer[0].toString());
                            JSONObject jsonObject = jsonArray.getJSONObject(0);
                            String excuse = jsonObject.getString("excuse");
                            textView.setText(excuse);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });
             }
        });

    }

    /**
     * Two Rules when working in the background
     * 1. Do Not block the UI Thread for more than 16ms time - If a Task takes more than 16ms time to complete - better to keep it in the background
     * 2. You cannot access the UI Toolkit from outside the main Thread or UI Thread.*/
}