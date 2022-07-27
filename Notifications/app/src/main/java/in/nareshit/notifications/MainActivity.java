package in.nareshit.notifications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private NotificationManager manager;
    private String CHANNEL_ID = "MYNOTI";
    NotificationChannel channel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Notification is by default a System Service
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    public void sendNotification(View view) {
        // NotificationChannels are introduced from android 8.0 and above
        // so check the version before you create a Notificationchannel
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            // If the condition matches, you can create a notificationChannel
            channel = new NotificationChannel(CHANNEL_ID,"My Notification Channel", NotificationManager.IMPORTANCE_HIGH);
            manager.createNotificationChannel(channel);
        }

        Intent intent = new Intent(this,MainActivity.class);
        PendingIntent pi = PendingIntent.getActivity(this, 23,intent,PendingIntent.FLAG_IMMUTABLE);

        // if you want to display an image, that has to be converted to BitMap
        Bitmap b = BitmapFactory.decodeResource(getResources(),R.drawable.android);

        NotificationCompat.Builder notification = new NotificationCompat.Builder(this,CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_baseline_umbrella_24)
                .setContentTitle("Your title here")
                .setAutoCancel(true)
                .setContentText("Your Message to the user")
                .setPriority(Notification.PRIORITY_MAX)
                .addAction(R.drawable.ic_baseline_two_wheeler_24,"BIKE RIDE",pi)
                .setStyle(new NotificationCompat.BigPictureStyle().bigPicture(b))
                .setContentIntent(pi);

        Notification n = notification.build();

        // You can send a notification with the help of Manager object and calling notify(...) on top of the same.
        manager.notify(45,n);
    }
}

/**
 * Every Notification should have the following
 * 1. Small Icon
 * 2. Title
 * 3. Detailed Message
 *
 * Components
 * 1. NotificationChannel
 * 2. NotificationManager
 * 2. Notification
 * */