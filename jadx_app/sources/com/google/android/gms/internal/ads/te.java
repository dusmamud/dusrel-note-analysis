package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f16374c;

    public te(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
        this.f16372a = i11;
        this.f16373b = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.f16374c = bArr;
    }

    public final int a() {
        int i10 = this.f16372a;
        if (i10 != 2) {
            return i10 != 3 ? 0 : 512;
        }
        return 2048;
    }
}
