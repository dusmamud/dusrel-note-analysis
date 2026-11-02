package com.google.android.gms.internal.ads;

import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pu3 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ pu3 f14501a = new pu3();

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return new Integer(Integer.bitCount(((Integer) obj).intValue()));
    }
}
