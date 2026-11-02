package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hw3 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iw3 f10512a;

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        HashMap map = jw3.f11532a;
        iw3 iw3Var = this.f10512a;
        return iw3Var.zza(obj2) - iw3Var.zza(obj);
    }
}
