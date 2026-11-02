package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class mc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f12773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Rect f12776i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12769b = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12770c = -9223372036854775807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f12768a = new int[4];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12777j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12778k = -1;

    public static int a(int i10, int i11) {
        return (i10 & 16777215) | ((i11 * 17) << 24);
    }

    public final void b(kr1 kr1Var, boolean z10, Rect rect, int[] iArr) {
        int i10;
        int i11;
        int i12 = !z10 ? 1 : 0;
        int iWidth = rect.width();
        int i13 = i12 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i14 = 0;
            do {
                int i15 = 1;
                int iH = 0;
                while (true) {
                    if (iH >= i15 || i15 > 64) {
                        i10 = iH & 3;
                        if (iH >= 4) {
                            i11 = iH >> 2;
                            break;
                        } else {
                            i11 = iWidth;
                            break;
                        }
                    }
                    if (kr1Var.b() < 4) {
                        i10 = -1;
                        i11 = 0;
                        break;
                    } else {
                        iH = (iH << 4) | kr1Var.h(4);
                        i15 <<= 2;
                    }
                }
                int iMin = Math.min(i11, iWidth - i14);
                if (iMin > 0) {
                    int i16 = i13 + iMin;
                    Arrays.fill(iArr, i13, i16, this.f12768a[i10]);
                    i14 += iMin;
                    i13 = i16;
                }
            } while (i14 < iWidth);
            i12 += 2;
            if (i12 >= iHeight) {
                return;
            }
            i13 = i12 * iWidth;
            kr1Var.k();
        }
    }
}
