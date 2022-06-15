package com.nareshittechnologies.implicitintents;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private EditText url_edit_text, address_maps_edit_text, phone_edit_text;
    private ImageView imageView;
    ActivityResultLauncher<Intent> launcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url_edit_text = findViewById(R.id.url_et);
        address_maps_edit_text = findViewById(R.id.address_map);
        phone_edit_text = findViewById(R.id.phone_et);
        imageView = findViewById(R.id.captured_photo);

        launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == RESULT_OK) {
                    Intent d = result.getData();
                    Bitmap b = d.getParcelableExtra("data");
                    imageView.setImageBitmap(b);
                }
            }
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new String[]{Manifest.permission.CAMERA,
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE},123);
        }
    }

    public void openBrowser(View view) {
        String u = url_edit_text.getText().toString();
        // Todo 1:create an intent object by passing two parameters for the constructor
        //  First parameter is the Kind of action you would like to do
        //  Second parameter is the data necessary to perform that action
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://"+u));
        // Todo 2: if there is an app that can process our request, we can call startActivity(...)
        startActivity(i);
    }

    public void openMaps(View view) {
        String a = address_maps_edit_text.getText().toString();
        Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q="+a));
        startActivity(i);
    }

    public void openDailer(View view) {
        String phone = phone_edit_text.getText().toString();
        Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+phone));
        startActivity(i);
    }

    public void openCamera(View view) {
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        launcher.launch(i);
    }
}