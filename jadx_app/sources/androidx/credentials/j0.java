package androidx.credentials;

import android.adservices.topics.Topic;
import android.credentials.CreateCredentialException;
import android.service.credentials.BeginGetCredentialRequest;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 {
    public static /* bridge */ /* synthetic */ Topic a(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ CreateCredentialException b(Throwable th) {
        return (CreateCredentialException) th;
    }

    public static /* synthetic */ BeginGetCredentialRequest.Builder c() {
        return new BeginGetCredentialRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ android.service.credentials.GetCredentialRequest d(Object obj) {
        return (android.service.credentials.GetCredentialRequest) obj;
    }
}
