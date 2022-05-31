package com.nareshittechnologies.teamscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int team1_score = 0;
    private int team2_score = 0;

    private TextView score1;
    private TextView score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // onCreate() is the first method that gets called when an Activity(Screen) is loaded
        score1 = findViewById(R.id.team1_score);
        score2 = findViewById(R.id.team2_score);
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
}