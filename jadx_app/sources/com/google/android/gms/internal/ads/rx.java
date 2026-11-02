package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class rx implements i00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f15583a;

    public rx(sx sxVar, SharedPreferences sharedPreferences) {
        this.f15583a = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.i00
    public final String a(String str, String str2) {
        return this.f15583a.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.i00
    public final Long b(long j10, String str) {
        SharedPreferences sharedPreferences = this.f15583a;
        try {
            return Long.valueOf(sharedPreferences.getLong(str, j10));
        } catch (ClassCastException unused) {
            return Long.valueOf(sharedPreferences.getInt(str, (int) j10));
        }
    }

    @Override // com.google.android.gms.internal.ads.i00
    public final Double c(String str, double d10) {
        SharedPreferences sharedPreferences = this.f15583a;
        try {
            return Double.valueOf(sharedPreferences.getFloat(str, (float) d10));
        } catch (ClassCastException unused) {
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(d10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.i00
    public final Boolean d(String str, boolean z10) {
        SharedPreferences sharedPreferences = this.f15583a;
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, z10));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(z10)));
        }
    }
}
