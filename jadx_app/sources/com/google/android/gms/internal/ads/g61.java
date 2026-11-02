package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class g61 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9546d = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f9543a = new int[8];

    public final void a(int i10) {
        int[] iArr = this.f9543a;
        int i11 = this.f9545c;
        iArr[i11] = i10;
        int i12 = this.f9546d & (i11 + 1);
        this.f9545c = i12;
        int i13 = this.f9544b;
        if (i12 == i13) {
            int length = iArr.length;
            int i14 = length - i13;
            int i15 = length + length;
            int[] iArr2 = new int[i15];
            System.arraycopy(iArr, i13, iArr2, 0, i14);
            System.arraycopy(this.f9543a, 0, iArr2, i14, this.f9544b);
            this.f9543a = iArr2;
            this.f9544b = 0;
            this.f9545c = length;
            this.f9546d = i15 - 1;
        }
    }
}
