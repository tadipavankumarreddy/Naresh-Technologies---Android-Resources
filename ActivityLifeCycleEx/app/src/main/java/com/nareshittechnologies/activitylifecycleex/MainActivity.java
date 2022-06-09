package com.nareshittechnologies.activitylifecycleex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MAIN","onCreate() is called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MAIN","onStart() is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MAIN","onResume() is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MAIN","onPause() is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MAIN","onStop() is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MAIN","onDestroy() is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MAIN","onRestart() is called");
    }
}
