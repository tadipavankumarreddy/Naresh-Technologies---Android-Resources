package in.nareshit.hydrationremainder;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.core.app.NotificationCompat;

public class ReminderReceiver extends BroadcastReceiver {

    // This class is created so that a Notification will be sent to the user when an alarm triggers

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            // This ensures that we need a NotificationChannel
            NotificationChannel channel = new NotificationChannel("notify","REMINDER CHANNEL",NotificationManager.IMPORTANCE_HIGH);
            manager.createNotificationChannel(channel);
        }

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context,"notify");
        builder.setSmallIcon(R.drawable.ic_launcher_background);
        builder.setContentTitle("DRINK WATER");
        builder.setContentText("Drinking water keeps you hydrated. We care about your hydration!");
        builder.setAutoCancel(true);
        builder.setPriority(NotificationCompat.PRIORITY_HIGH);
        // For now, I'm not getting the notification to action.
        manager.notify(23, builder.build());
    }
}