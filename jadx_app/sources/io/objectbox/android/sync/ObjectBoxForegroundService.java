package io.objectbox.android.sync;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class ObjectBoxForegroundService extends Service {
    public static final String ACTION_START = "obx_foreground_start";
    public static final String ACTION_STOP = "obx_foreground_stop";
    private static final String TAG = "OBX_FOREGROUND";
    private static Notification notification;
    private static int notificationId;

    public static void start(Context context, int i10, Notification notification2) {
        if (Build.VERSION.SDK_INT >= 28 && context.getApplicationInfo().targetSdkVersion >= 28) {
            context.enforcePermission("android.permission.FOREGROUND_SERVICE", Process.myPid(), Process.myUid(), null);
        }
        notificationId = i10;
        notification = notification2;
        Intent intent = new Intent(context, (Class<?>) ObjectBoxForegroundService.class);
        intent.setAction(ACTION_START);
        startServiceIntent(context, intent);
    }

    private static void startServiceIntent(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public static void stop(Context context) {
        Intent intent = new Intent(context, (Class<?>) ObjectBoxForegroundService.class);
        intent.setAction(ACTION_STOP);
        startServiceIntent(context, intent);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (ACTION_STOP.equals(intent.getAction())) {
            Log.d(TAG, "Stopping...");
            stopForeground(true);
            stopSelf();
            return 2;
        }
        if (!ACTION_START.equals(intent.getAction())) {
            Log.w(TAG, "Ignoring start command: no action specified.");
            return 2;
        }
        Log.d(TAG, "Starting...");
        int i12 = notificationId;
        Notification notification2 = notification;
        if (i12 == 0 || notification2 == null) {
            throw new IllegalArgumentException("No arguments given: notificationId or notification not set.");
        }
        startForeground(i12, notification2);
        return 3;
    }
}
