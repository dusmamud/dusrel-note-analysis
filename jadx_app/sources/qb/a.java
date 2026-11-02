package qb;

import com.android.billingclient.api.BillingClient;

/* JADX INFO: loaded from: classes2.dex */
public enum a {
    SUBSCRIPTIONS(BillingClient.FeatureType.SUBSCRIPTIONS),
    SUBSCRIPTIONS_UPDATE(BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE),
    PRICE_CHANGE_CONFIRMATION(BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION);

    private final String playBillingClientName;

    a(String str) {
        this.playBillingClientName = str;
    }

    public final String a() {
        return this.playBillingClientName;
    }
}
