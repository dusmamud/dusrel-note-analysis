package androidx.credentials.provider;

import android.credentials.CreateCredentialException;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 {
    public static /* synthetic */ CreateCredentialException b(String str, String str2) {
        return new CreateCredentialException(str, str2);
    }

    public static /* synthetic */ android.service.credentials.BeginCreateCredentialRequest c(String str, Bundle bundle, android.service.credentials.CallingAppInfo callingAppInfo) {
        return new android.service.credentials.BeginCreateCredentialRequest(str, bundle, callingAppInfo);
    }
}
