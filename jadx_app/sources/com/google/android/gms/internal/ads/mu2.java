package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mu2 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13006b = -9223372036854775807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13005a = new ArrayList();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f13006b, ((mu2) obj).f13006b);
    }
}
