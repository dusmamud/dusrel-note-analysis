package com.google.android.gms.internal.ads;

import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class es3 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ es3 f8931a = new es3();

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return new Integer(Integer.bitCount(((Integer) obj).intValue()));
    }
}
