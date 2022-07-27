package in.nareshit.powerreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imv = findViewById(R.id.imageView);

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_POWER_CONNECTED);
        intentFilter.addAction(Intent.ACTION_POWER_DISCONNECTED);

        registerReceiver(new PowerReceiver(imv),intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(new PowerReceiver(imv));
    }
}

// TODO 1: Create a class and Extend it to BroadcastReceiver
//  Short cut is to right click on app -> new -> other -> broadcastReceiver

// TODO 2: Dynamically Register for Broadcast
//  POWER_CONNECTED - This broadcast will be released by the system when Charging cable is connected
//  POWER_DISCONNECTED - This broadcast will be released by the system when Charging cable is disconnected
//  to Register broadcast -use registerReceiver(...)
//  to unregister broadcast - use unregisterReceiver(...)