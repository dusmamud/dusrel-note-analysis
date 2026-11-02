package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class rw implements nh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rw f15571a = new rw();

    @Override // com.google.android.gms.internal.ads.nh3
    public final boolean zza(int i10) {
        qw qwVar;
        if (i10 == 0) {
            qwVar = qw.PLATFORM_UNSPECIFIED;
        } else if (i10 != 1) {
            qwVar = i10 != 2 ? null : qw.ANDROID;
        } else {
            qwVar = qw.IOS;
        }
        return qwVar != null;
    }
}
