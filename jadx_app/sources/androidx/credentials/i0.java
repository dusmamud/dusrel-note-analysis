package androidx.credentials;

import android.credentials.ClearCredentialStateException;
import android.service.credentials.BeginGetCredentialResponse;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 {
    public static /* bridge */ /* synthetic */ ClearCredentialStateException a(Throwable th) {
        return (ClearCredentialStateException) th;
    }

    public static /* synthetic */ BeginGetCredentialResponse.Builder b() {
        return new BeginGetCredentialResponse.Builder();
    }
}
