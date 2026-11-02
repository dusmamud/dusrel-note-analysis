package com.google.android.gms.internal.p000firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public enum d5 {
    REFRESH_TOKEN("refresh_token"),
    AUTHORIZATION_CODE("authorization_code");

    private final String zzd;

    d5(String str) {
        this.zzd = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
