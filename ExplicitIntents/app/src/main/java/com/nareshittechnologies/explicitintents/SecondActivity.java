package com.nareshittechnologies.explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView d_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        d_tv = findViewById(R.id.data_text_view);
        // TODO 3: To Extract the data from the intent object
        //  we need to first get the intent using getIntent(...) method
        //  and then extract the value using getStringExtra(...) method
        //  for the getStringExtra(...) method, you need to pass the right key

        Intent i = getIntent();
        String data = i.getStringExtra("KEY");
        d_tv.setText(data);
    }
}