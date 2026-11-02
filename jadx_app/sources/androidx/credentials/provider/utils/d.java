package androidx.credentials.provider.utils;

import android.content.pm.SigningInfo;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.CredentialEntry;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d {
    public static /* synthetic */ CallingAppInfo a(String str, SigningInfo signingInfo, String str2) {
        return new CallingAppInfo(str, signingInfo, str2);
    }

    public static /* bridge */ /* synthetic */ CredentialEntry b(Object obj) {
        return (CredentialEntry) obj;
    }
}
