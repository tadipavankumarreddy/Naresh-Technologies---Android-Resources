package in.nareshit.tunify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void startMusic(View view) {
        // This has to start the music
        Intent i = new Intent(this,MediaServicee.class);
        startService(i);

    }

    public void stopMusic(View view) {
        // This has to stop the music
        Intent i = new Intent(this,MediaServicee.class);
        stopService(i);

    }
}

// TODO 1: Create a class and extend it to Service class.