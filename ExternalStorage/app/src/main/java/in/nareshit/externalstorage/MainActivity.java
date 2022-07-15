package in.nareshit.externalstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    boolean isAvailable = false, isWritable = false, isReadable = false;
    EditText fileName, fileData;
    TextView result;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fileName = findViewById(R.id.file_name);
        fileData = findViewById(R.id.file_data);
        result = findViewById(R.id.textView);
        
        
        // To check if the External Storage is available or not for read, write modes
        String state = Environment.getExternalStorageState();
        if(Environment.MEDIA_MOUNTED.equals(state)){
            isAvailable = true; isWritable = true; isReadable = true;
        }else if(Environment.MEDIA_MOUNTED_READ_ONLY.equalsIgnoreCase(state)){
            isAvailable = true; isWritable = false; isReadable = true;
        }
        
        // TODO 2: Request the user to grant READ_EXTERNAL_STORAGE & WRITE_EXTERNAL_STORAGE permissions
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            // This has to be true to request dynamic permissions - As dynamic permissions are introduced from android 23 (Marshmallow)
            if(checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this, "Permission is granted", Toast.LENGTH_SHORT).show();
            }else{
                requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},123);
            }

            if(checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this, "PERMISSION GRANTED", Toast.LENGTH_SHORT).show();
            }else{
                requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},123);
            }
        }


    }

    // Create a file and store data in it
    public void saveData(View view) {
        String fName = fileName.getText().toString();
        String fData = fileData.getText().toString();
        
        // TODO 3: before using external storage, decide where do you exactly want to create your file
        //  choose an appropriate destination
        File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        File file = new File(folder,fName+".txt");
        FileOutputStream fos;

        try {
            fos = new FileOutputStream(file);
            fos.write(fData.getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Toast.makeText(this, "CONTENTS WRITTEN SUCCESSFULLY", Toast.LENGTH_SHORT).show();
    }

    // Open a file and read data from it
    public void loadData(View view) {
        String fName = fileName.getText().toString();
        File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        File file = new File(folder,fName+".txt");

        FileInputStream fis;
        try{
            fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            StringBuilder sb = new StringBuilder();
            String line;
            while((line=br.readLine())!=null){
                sb.append(line);
            }
            result.setText(sb.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}