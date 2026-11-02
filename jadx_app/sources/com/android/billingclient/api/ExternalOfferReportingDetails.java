package com.android.billingclient.api;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@zzj
public final class ExternalOfferReportingDetails {
    private final String externalTransactionToken;

    public ExternalOfferReportingDetails(String str) throws JSONException {
        this.externalTransactionToken = new JSONObject(str).optString("externalTransactionToken");
    }

    public String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }
}
