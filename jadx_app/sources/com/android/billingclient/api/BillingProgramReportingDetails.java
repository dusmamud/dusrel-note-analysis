package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
@zzh
public final class BillingProgramReportingDetails {
    private final int billingProgram;
    private final String externalTransactionToken;

    public BillingProgramReportingDetails(String str, int i10) {
        this.externalTransactionToken = str;
        this.billingProgram = i10;
    }

    public int getBillingProgram() {
        return this.billingProgram;
    }

    public String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }
}
