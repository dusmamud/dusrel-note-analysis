package ka;

import android.content.IntentFilter;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ ProxyAmazonBillingActivityBroadcastReceiver f30183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentFilter f30184b;

    public a() {
        int i10 = ProxyAmazonBillingActivityBroadcastReceiver.f23256b;
        this.f30184b = new IntentFilter("com.revenuecat.purchases.purchase_finished");
    }
}
