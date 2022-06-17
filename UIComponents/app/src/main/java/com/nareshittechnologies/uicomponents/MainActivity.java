package com.nareshittechnologies.uicomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener,
        RadioGroup.OnCheckedChangeListener, AdapterView.OnItemSelectedListener {

    private RadioGroup rg;
    private Spinner sp;
    private ToggleButton tButton;
    private Switch mSwitch;
    private CheckBox eng, hin, sans;

    // Variables for fetching the data from different components at once
    String gender = "";
    String lKnown = "";
    String toggleOn = "";
    String switchOff = "";
    String country = "India";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.spinner);
        rg = findViewById(R.id.gender_group);
        tButton = findViewById(R.id.toggleButton);
        mSwitch = findViewById(R.id.switch1);

        eng = findViewById(R.id.english);
        hin = findViewById(R.id.hindi);
        sans = findViewById(R.id.sanskrit);


        // populating data on the spinner
        String[] data = new String[]{"Bharat","USA","UK","Australia"};
        // we use adapters when there is data (plural) to be populated on a single view
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);
        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(this);

        rg.setOnCheckedChangeListener(this);

        tButton.setOnCheckedChangeListener(this);

        mSwitch.setOnCheckedChangeListener(this);
    }

    public void selectLang(View view) {
        switch (view.getId()){
            case R.id.english:
                CheckBox checkBox = findViewById(R.id.english);
                if(checkBox.isChecked()){
                    Toast.makeText(this, "English is on", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "English is off", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.hindi:
                //something
                Toast.makeText(this, "Hindi is selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sanskrit:
                //something
                Toast.makeText(this, "Sankskrit is selected", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(compoundButton.getId() == R.id.toggleButton){
            if(b){
                toggleOn = "Toggle On";
                Toast.makeText(MainActivity.this, "Toggle Button is turned on", Toast.LENGTH_SHORT).show();
            }else{
                toggleOn = "Toggle Off";
                Toast.makeText(MainActivity.this, "Toggle Button is off", Toast.LENGTH_SHORT).show();
            }
        }else{
            if(b){
                switchOff = "Switch On";
                Toast.makeText(MainActivity.this, "Switch Button is turned on", Toast.LENGTH_SHORT).show();
            }else{
                switchOff = "Switch Off";
                Toast.makeText(MainActivity.this, "Switch Button is off", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

        int selectedItemId = radioGroup.getCheckedRadioButtonId();
        if(selectedItemId == R.id.male){
            gender = "Male";
            Toast.makeText(MainActivity.this,
                    "Male", Toast.LENGTH_SHORT).show();
        }else{
            gender = "Female";
            Toast.makeText(MainActivity.this, "Female", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        country = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(MainActivity.this, adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void submitForm(View view) {
        TextView results = findViewById(R.id.results5);
        results.setText(gender+"\n");
        if(eng.isChecked()){
            lKnown = lKnown+ "English\n";
        }
        if(hin.isChecked()){
            lKnown = lKnown+"Hindi\n";
        }
        if(sans.isChecked()){
            lKnown = lKnown+"Sanskrit";
        }
        results.append(lKnown+"\n");
        results.append(country+"\n");
        results.append("Toggle Switch is "+toggleOn);
        results.append(country);
    }
}