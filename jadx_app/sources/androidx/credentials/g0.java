package androidx.credentials;

import android.adservices.topics.GetTopicsRequest;
import android.app.slice.Slice;
import android.os.Bundle;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.CredentialEntry;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 {
    public static /* synthetic */ GetTopicsRequest.Builder a() {
        return new GetTopicsRequest.Builder();
    }

    public static /* synthetic */ android.credentials.CreateCredentialResponse c(Bundle bundle) {
        return new android.credentials.CreateCredentialResponse(bundle);
    }

    public static /* synthetic */ CredentialEntry d(BeginGetCredentialOption beginGetCredentialOption, Slice slice) {
        return new CredentialEntry(beginGetCredentialOption, slice);
    }
}
