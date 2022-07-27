package in.nareshit.powerreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;

public class PowerReceiver extends BroadcastReceiver {

    ImageView imv;

    public PowerReceiver(ImageView imv) {
        this.imv = imv;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        if (intent.getAction().equalsIgnoreCase(Intent.ACTION_POWER_CONNECTED)) {
            imv.setImageResource(R.drawable.ic_baseline_battery_charging_full_24);
        }

        if (intent.getAction().equalsIgnoreCase(Intent.ACTION_POWER_DISCONNECTED)) {
            imv.setImageResource(R.drawable.ic_baseline_battery_alert_24_2);
        }
    }
}
