package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c1 implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c1 f7594b = new c1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c1 f7595c = new c1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7596a;

    public /* synthetic */ c1(int i10) {
        this.f7596a = i10;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f7596a) {
            case 0:
                return ((a1) obj).f6445a - ((a1) obj2).f6445a;
            default:
                return Integer.compare(((rc) obj).f15264a.f15829b, ((rc) obj2).f15264a.f15829b);
        }
    }
}
