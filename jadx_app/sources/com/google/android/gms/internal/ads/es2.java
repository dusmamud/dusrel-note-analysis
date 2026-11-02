package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public abstract class es2 {
    public static int b(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i11 <= i10) {
            return i10;
        }
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            int iHighestOneBit = Integer.highestOneBit(i11 - 1);
            i12 = iHighestOneBit + iHighestOneBit;
        }
        return i12 < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i12;
    }

    public abstract es2 a(Object obj);
}
