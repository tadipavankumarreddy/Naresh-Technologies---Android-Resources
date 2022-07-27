package in.nareshit.hydrationremainder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // to send an alarm and manage it, we require AlarmManager
    AlarmManager manager;
    PendingIntent pi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // AlarmManager is a system service - which is available on all Android Devices
        manager = (AlarmManager) getSystemService(ALARM_SERVICE);
        // As we want to trigger the ReminderReciver(Broadcast Receiver) in the same app, we need to trigger
        // a custom broadcast. PendingIntent.getBraodcast(...) would help us do so.
        pi = PendingIntent.getBroadcast(this,23, new Intent(this,ReminderReceiver.class),PendingIntent.FLAG_IMMUTABLE);
    }

    public void sendAlarm(View view) {
        // This method is responsible to enable the alarm
        // Step 1: is to decide on the First Trigger time of the Alarm.
        long firstTriggerTime = SystemClock.elapsedRealtime()+(60*1000);
        long intervalTime = 2*60*1000;
        // Elapsed Real Time is the clock that is recommended by Google. As this uses too less resources compared to RTC (Real Time clock)
        manager.setInexactRepeating(AlarmManager.ELAPSED_REALTIME,firstTriggerTime,intervalTime,pi);
    }

    public void cancelAlarm(View view) {
        // This method is responsible for cancelling the triggered Alarm
        manager.cancel(pi);
    }
}