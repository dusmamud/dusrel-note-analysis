package com.revenuecat.purchases.amazon.purchasing;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivityBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProxyAmazonBillingActivityBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f23256b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<Activity> f23257a;

    public ProxyAmazonBillingActivityBroadcastReceiver(ProxyAmazonBillingActivity proxyAmazonBillingActivity) {
        this.f23257a = new WeakReference<>(proxyAmazonBillingActivity);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        j.e(context, "context");
        j.e(intent, "intent");
        Activity activity = this.f23257a.get();
        if (activity != null) {
            activity.finish();
        }
    }
}
