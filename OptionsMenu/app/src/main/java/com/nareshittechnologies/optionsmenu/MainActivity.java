package com.nareshittechnologies.optionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This method attaches a menu file to the existing activity (MainActivity)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return true;
    }

    // Inorder to get the menu items work as you tap them, override the following method

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.first:
                // action
                Toast.makeText(this, "First Option is clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.second:
                //action
                Toast.makeText(this, "Second Option is clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.third:
                //action
                Toast.makeText(this, "Third Option is clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fourth:
                //action
                Toast.makeText(this, "Fourth Option is clicked!", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}



// TODO 1: Create Options_menu.xml in the menu directory of the res directory
//  Right click on res > Android Res Directory > menu in the values tab
//  Right clik on menu > Menu resource file

// TODO 2: attach this menu file to the activity - onCreateOptionsMenu(...)

// TODO 3: use onOptionsItemSelected(...) method to get the menu items to functionality