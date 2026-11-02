package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class ih {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hh f10771d = new hh(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10772a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10773b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10774c = 0;

    public final synchronized byte[] a(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f10773b;
            if (i11 >= arrayList.size()) {
                return new byte[i10];
            }
            byte[] bArr = (byte[]) arrayList.get(i11);
            int length = bArr.length;
            if (length >= i10) {
                this.f10774c -= length;
                arrayList.remove(i11);
                this.f10772a.remove(bArr);
                return bArr;
            }
            i11++;
        }
    }

    public final synchronized void b(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f10772a.add(bArr);
                ArrayList arrayList = this.f10773b;
                int iBinarySearch = Collections.binarySearch(arrayList, bArr, f10771d);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                arrayList.add(iBinarySearch, bArr);
                this.f10774c += length;
                synchronized (this) {
                    while (this.f10774c > 4096) {
                        byte[] bArr2 = (byte[]) this.f10772a.remove(0);
                        this.f10773b.remove(bArr2);
                        this.f10774c -= bArr2.length;
                    }
                }
            }
        }
    }
}
