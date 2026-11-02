package com.google.android.gms.internal.p000firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;

/* JADX INFO: loaded from: classes.dex */
public enum g5 {
    ACCESS_TOKEN("ACCESS_TOKEN"),
    ID_TOKEN(Constants.ID_TOKEN);

    private final String zzd;

    g5(String str) {
        this.zzd = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
