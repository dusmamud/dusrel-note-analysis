package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f21871a;

    public n4(String str) {
        this.f21871a = Preconditions.checkNotEmpty(str);
    }

    public n4(boolean z10) {
        this.f21871a = new AtomicBoolean(z10);
    }
}
