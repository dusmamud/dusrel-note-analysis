package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class ds implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        wr wrVar = (wr) obj;
        wr wrVar2 = (wr) obj2;
        float f10 = wrVar.f18699b;
        float f11 = wrVar2.f18699b;
        if (f10 < f11) {
            return -1;
        }
        if (f10 > f11) {
            return 1;
        }
        float f12 = wrVar.f18698a;
        float f13 = wrVar2.f18698a;
        if (f12 < f13) {
            return -1;
        }
        if (f12 > f13) {
            return 1;
        }
        float f14 = (wrVar.f18701d - f10) * (wrVar.f18700c - f12);
        float f15 = (wrVar2.f18701d - f11) * (wrVar2.f18700c - f13);
        if (f14 > f15) {
            return -1;
        }
        return f14 < f15 ? 1 : 0;
    }
}
