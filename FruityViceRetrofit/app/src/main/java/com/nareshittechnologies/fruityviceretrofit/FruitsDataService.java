package com.nareshittechnologies.fruityviceretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FruitsDataService {

   @GET("fruit/all/")
   Call<Fruit[]> getData();
}
