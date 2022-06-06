package com.nareshittechnologies.teamscore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int team1_score = 0;
    private int team2_score = 0;

    private TextView score1;
    private TextView score2;
    private Button increment_score1_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // onCreate() is the first method that gets called when an Activity(Screen) is loaded
        score1 = findViewById(R.id.team1_score);
        score2 = findViewById(R.id.team2_score);
        increment_score1_btn = findViewById(R.id.increment_team1_btn);
        increment_score1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                team1_score++;
                score1.setText(String.valueOf(team1_score));
            }
        });

        if(savedInstanceState!=null && savedInstanceState.containsKey("TEAM1") && savedInstanceState.containsKey("TEAM2")){
            team1_score = savedInstanceState.getInt("TEAM1");
            team2_score = savedInstanceState.getInt("TEAM2");

            score1.setText(String.valueOf(team1_score));
            score2.setText(String.valueOf(team2_score));
        }
    }

    public void incrementTeam1(View view) {
        // Logic for getting the first button of First half of the screen goes here
        team1_score++;
        // setText() is used to display data on the TextView, Buttons, EditText, ...
        // for setText() method you need to pass only the String values
        // if you pass any other data type value - You will get an error!
        score1.setText(String.valueOf(team1_score));
    }

    public void decrementTeam1(View view) {
        // Logic for getting the second button to action can be written here
        team1_score--;
        score1.setText(String.valueOf(team1_score));
    }

    public void incrementTeam2(View view) {
        // Logic to increment the team2 score will go here
        team2_score++;
        score2.setText(String.valueOf(team2_score));
    }

    public void decrementTeam2(View view) {
        // logic to decrement the team2 score will go here
        team2_score--;
        score2.setText(String.valueOf(team2_score));
    }

    /**
     * onSaveInstanceState() method is useful in saving the data across the orientation changes (Configuration changes)
     * of the Activity (potrait <-> landscape */
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        /* We cannot retrieve the values with out a key*/
        outState.putInt("TEAM1",team1_score);
        outState.putInt("TEAM2",team2_score);
    }
}