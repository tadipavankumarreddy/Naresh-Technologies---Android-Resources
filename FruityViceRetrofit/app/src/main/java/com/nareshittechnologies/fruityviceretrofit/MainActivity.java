package com.nareshittechnologies.fruityviceretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.internal.EverythingIsNonNull;

public class MainActivity extends AppCompatActivity {

    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialization of Retrofit
        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.fruityvice.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public void fetchFruits(View view) {
        // Create a service
        FruitsDataService service = retrofit.create(FruitsDataService.class);
        // Make use of the service
        Call<Fruit[]> fruitsData = service.getData();

        fruitsData.enqueue(new Callback<Fruit[]>() {
            @Override
            public void onResponse(Call<Fruit[]> call, Response<Fruit[]> response) {
                Toast.makeText(MainActivity.this, "DATA ARRIVED", Toast.LENGTH_SHORT).show();
                Fruit[] fruits = response.body();
                for(Fruit f : fruits){
                    Toast.makeText(MainActivity.this, f.getName(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Fruit[]> call, Throwable t) {
                Toast.makeText(MainActivity.this, "FAILED", Toast.LENGTH_SHORT).show();
                Log.v("MAIN",t.getMessage());
            }
        });
    }
}