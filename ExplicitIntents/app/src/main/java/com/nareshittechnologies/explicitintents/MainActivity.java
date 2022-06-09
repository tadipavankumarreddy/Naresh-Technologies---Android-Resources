package com.nareshittechnologies.explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = findViewById(R.id.data_et);
    }

    public void nextScreen(View view) {
        // TODO 1: Create an Intent object  by specifying the source and the destination
        Intent aman = new Intent(this,SecondActivity.class);
        // TODO 1.1: To add data, we can use putExtra(...) on top of the intent object - You
        //  have to transfer the data in key and value pairs - Without a key, you cannot
        //  extract the data on the destination activity
        String d = data.getText().toString();
        aman.putExtra("KEY",d);
        // TODO 2: call startActivity(...) method and pass the intent object to it
        startActivity(aman);
    }
}