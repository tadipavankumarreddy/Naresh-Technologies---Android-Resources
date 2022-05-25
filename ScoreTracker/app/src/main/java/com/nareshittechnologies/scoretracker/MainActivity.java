package com.nareshittechnologies.scoretracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.textview_result);
    }

    public void showToast(View view) {
        // Here you can write logic or action for the first button
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_LONG).show();
    }


    public void showCount(View view) {
        // Second Button's logic will be written inside this
        count++;
        result.setText(String.valueOf(count));
    }
}