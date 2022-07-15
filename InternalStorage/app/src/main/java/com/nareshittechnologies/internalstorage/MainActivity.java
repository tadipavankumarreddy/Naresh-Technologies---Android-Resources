package com.nareshittechnologies.internalstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    private EditText fileName, fileData;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fileName = findViewById(R.id.file_name);
        fileData = findViewById(R.id.file_data);
        result = findViewById(R.id.textView);

    }

    // TODO 1: create a file in the internal Memory of Android and write data to it
    public void saveData(View view) {
        String fn = fileName.getText().toString();
        String fd = fileData.getText().toString();

        // Inorder to write to a file, we need FileOutputStream object
        FileOutputStream fos;

        try {
            fos = openFileOutput(fn+".txt",MODE_PRIVATE);
            fos.write(fd.getBytes());
            // After finishing any file operation, it is recommended that the fileoutput stream object is closed
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Toast.makeText(this, "Saved Successfully", Toast.LENGTH_SHORT).show();

    }


    // TODO 2: Read data out of the file and display it on the TextView
    public void loadData(View view) {
        String fn = fileName.getText().toString();
        // Inorder to Read Data out of a file (internal Storagefile) you need FileInputStream
        FileInputStream fis;
        try {
            fis = openFileInput(fn+".txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            StringBuilder sb = new StringBuilder();
            while((line = br.readLine())!=null){
                sb.append(line);
            }
            result.setText(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}