package com.codingblocks.alarms;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

public class AlarmReciver extends BroadcastReceiver {
    NotificationManager notificationManager;
    NotificationChannel notificationChannel;
   String channei_id="CHANNEL";
    @Override
    public void onReceive(Context context, Intent intent) {
        notificationManager=(NotificationManager)context.getSystemService(context.NOTIFICATION_SERVICE);

        NotificationChannel notificationChannel= null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            notificationChannel = new NotificationChannel(channei_id, "defult", NotificationManager.IMPORTANCE_DEFAULT);

            notificationManager.createNotificationChannel(notificationChannel);

            Notification simplenotifiction =new NotificationCompat.Builder(context,channei_id).
                    setSmallIcon(R.mipmap.ic_launcher).setContentTitle("basic notification").setContentText("no")

                    .setPriority(NotificationCompat.PRIORITY_DEFAULT).build();

            notificationManager.notify(123,simplenotifiction);

        }



    }


}
