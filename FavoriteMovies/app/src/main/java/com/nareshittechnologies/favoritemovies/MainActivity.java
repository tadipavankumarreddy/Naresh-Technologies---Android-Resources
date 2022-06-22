package com.nareshittechnologies.favoritemovies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclervieww);
    }
}





// TODO 1 : design the protoype of the application
//  Prototyped design (https://www.canva.com/design/DAFEVvRJZD4/h_kZkksLCOSj9-AMH6g4hA/view?utm_content=DAFEVvRJZD4&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)

// TODO 2: Get all the images into the drawable folder and check if they are broken or not

// TODO 3: Add Recyclerview to the activity_main.xml, connect recyclerview to the obj

// TODO 4: Define how you want to style each item on the recyclerview.
