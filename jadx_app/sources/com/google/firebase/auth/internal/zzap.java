package com.google.firebase.auth.internal;

import com.google.firebase.auth.SignInMethodQueryResult;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzap implements SignInMethodQueryResult {
    private final List<String> zza;

    public zzap(List<String> list) {
        this.zza = list;
    }

    @Override // com.google.firebase.auth.SignInMethodQueryResult
    public final List<String> getSignInMethods() {
        return this.zza;
    }
}
