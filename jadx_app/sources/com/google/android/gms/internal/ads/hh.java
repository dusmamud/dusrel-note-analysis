package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class hh implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ hh f10280b = new hh(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10281a;

    public /* synthetic */ hh(int i10) {
        this.f10281a = i10;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f10281a) {
            case 0:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            default:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
        }
    }
}
