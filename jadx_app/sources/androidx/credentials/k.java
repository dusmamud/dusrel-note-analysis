package androidx.credentials;

import android.app.slice.Slice;
import android.service.credentials.BeginGetCredentialResponse;
import android.service.credentials.RemoteEntry;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k {
    public static /* bridge */ /* synthetic */ android.credentials.CredentialManager b(Object obj) {
        return (android.credentials.CredentialManager) obj;
    }

    public static /* synthetic */ RemoteEntry c(Slice slice) {
        return new RemoteEntry(slice);
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return BeginGetCredentialResponse.class;
    }
}
