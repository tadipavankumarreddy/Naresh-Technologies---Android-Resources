package com.nareshittechnologies.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextTextPersonName);
        textView = findViewById(R.id.textView);

        // Creating shared preferences file
        preferences = getSharedPreferences("PREFERENCES_APP",MODE_PRIVATE);

        preferences.registerOnSharedPreferenceChangeListener(new SharedPreferences.OnSharedPreferenceChangeListener() {
            @Override
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String s) {
                Toast.makeText(MainActivity.this, "DATA", Toast.LENGTH_SHORT).show();
                load();
            }
        });
    }

    // Saving data to the SharedPreferences file
    public void saveData(View view) {
        String data = editText.getText().toString();

        // Editing the SharedPrefs file
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("DATA",data);
        // if you do not call apply() method on Editor - the changes made will not be saved
        editor.apply();

    }

    // Get the shared preferences data
    public void loadData(View view) {
       load();
    }

    private void load() {
        if(preferences!=null && preferences.contains("DATA")){
            String data = preferences.getString("DATA","");
            textView.setText(data);
        }
    }
}