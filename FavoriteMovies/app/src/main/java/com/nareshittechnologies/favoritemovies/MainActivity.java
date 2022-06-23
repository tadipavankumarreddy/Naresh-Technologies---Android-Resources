package com.nareshittechnologies.favoritemovies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] movie_posters;
    private String[] movie_names, actor_names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclervieww);
        createData();

        FavoriteMoviesAdapter fma = new FavoriteMoviesAdapter(this,movie_posters,movie_names,actor_names);
        recyclerView.setAdapter(fma);
        // recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        // recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
    }


    // This method is responsible for preparing the data
    private void createData() {
        movie_posters = new int[]{R.drawable.avengers,R.drawable.bangbang,R.drawable.chhichore,
        R.drawable.dangal,R.drawable.englishvinglish,R.drawable.fastoffury,R.drawable.gangster,
        R.drawable.humsafar,R.drawable.indianajones,R.drawable.joker};

        movie_names = new String[]{"Avengers","Bang Bang","Chhichore","Dangal","English Vinglish","Fast of Fury",
        "Gangster","Humsafar","Indiana Jones","Joker"};

        actor_names = new String[]{"Robert downey Jr","Hritik Roshan","Sushaant sing","Aamir Khan","Sridevi",
        "Bruce lee","Emraan Hashmi","Jeethendra","Harrison Ford","Joaquin Phoeinx"};
    }
}





// TODO 1 : design the protoype of the application
//  Prototyped design (https://www.canva.com/design/DAFEVvRJZD4/h_kZkksLCOSj9-AMH6g4hA/view?utm_content=DAFEVvRJZD4&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)

// TODO 2: Get all the images into the drawable folder and check if they are broken or not

// TODO 3: Add Recyclerview to the activity_main.xml, connect recyclerview to the obj

// TODO 4: Define how you want to style each item on the recyclerview.

// TODO 5: Set up data

// TODO 6: Create an Adapter (pass ViewHolder info)
//  the work of the adapter is what ?
//  1. Take the data
//  2. Populate the data on top of the one_row_design.xml file (imageview, textviews)
//  3. Attach this layout (on which the data is there) to the Recyclerview

// TODO 7: Create an object for the Adapter class and set the adapter on the Recyclerview

// TODO 8: Set the layout Manager of your interest on Recyclerview