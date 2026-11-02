package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ k f11586a = new k();

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj;
        xr2 xr2Var = b0.f6989k;
        if (num2.intValue() == -1) {
            return num.intValue() == -1 ? 0 : -1;
        }
        if (num.intValue() == -1) {
            return 1;
        }
        return num2.intValue() - num.intValue();
    }
}
