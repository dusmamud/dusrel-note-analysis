package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class uh implements mh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f16972a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f16973b;

    public uh(Context context) {
        this.f16973b = context;
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final File zza() {
        if (this.f16972a == null) {
            this.f16972a = new File(this.f16973b.getCacheDir(), "volley");
        }
        return this.f16972a;
    }
}
