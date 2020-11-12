package com.example.powerreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {
public static  final  String ACTION_CUSTOM_BROADCAST = BuildConfig.APPLICATION_ID +".ACTION_CUSTOM_BROADCAST";


    @Override
    public void onReceive(Context context, Intent intent) {
       String intentAction = intent.getAction();
        if (intentAction!= null){

            String toastMessage = "unknown power source";
            switch (intentAction){

                case Intent.ACTION_POWER_CONNECTED:
                    toastMessage = "Charging";
                    break;

                case Intent.ACTION_POWER_DISCONNECTED:
                    toastMessage = "Not Charging";
                    break;
                case ACTION_CUSTOM_BROADCAST:
                    toastMessage = "Custom Broadcast";
            }
            Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
        }

    }
}