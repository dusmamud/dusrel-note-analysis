package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class zzbbz extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20470a = true;

    public zzbbz(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f20470a = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f20470a = false;
        }
    }
}
