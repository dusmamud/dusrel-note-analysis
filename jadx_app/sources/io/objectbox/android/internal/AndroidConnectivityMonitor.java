package io.objectbox.android.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import io.objectbox.sync.ConnectivityMonitor;

/* JADX INFO: loaded from: classes2.dex */
class AndroidConnectivityMonitor extends ConnectivityMonitor {
    private final Context context;
    private AndroidNetworkStateReceiver receiver;

    public class AndroidNetworkStateReceiver extends BroadcastReceiver {
        public AndroidNetworkStateReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkInfo activeNetworkInfo;
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
                AndroidConnectivityMonitor.this.notifyConnectionAvailable();
            }
        }
    }

    public AndroidConnectivityMonitor(Context context) {
        this.context = context.getApplicationContext();
    }

    @Override // io.objectbox.sync.ConnectivityMonitor
    public void onObserverRemoved() {
        AndroidNetworkStateReceiver androidNetworkStateReceiver = this.receiver;
        this.receiver = null;
        if (androidNetworkStateReceiver != null) {
            this.context.unregisterReceiver(androidNetworkStateReceiver);
        }
    }

    @Override // io.objectbox.sync.ConnectivityMonitor
    public void onObserverSet() {
        AndroidNetworkStateReceiver androidNetworkStateReceiver = new AndroidNetworkStateReceiver();
        this.context.registerReceiver(androidNetworkStateReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.receiver = androidNetworkStateReceiver;
    }
}
