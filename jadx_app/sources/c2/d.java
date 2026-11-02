package c2;

import androidx.biometric.BiometricManager;
import cd.k;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f4391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f4392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f4394l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4395m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f4396n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4397o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4398p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4399q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4400r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4401s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4402t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4403u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4404v;

    public d(int i10, int i11, float f10, float f11, int i12) {
        this.f4383a = i10;
        this.f4384b = i11;
        this.f4385c = f10;
        this.f4386d = f11;
        this.f4387e = i10 / i12;
        this.f4388f = i10 / 400;
        int i13 = i10 / 65;
        this.f4389g = i13;
        int i14 = i13 * 2;
        this.f4390h = i14;
        this.f4391i = new short[i14];
        this.f4392j = new short[i14 * i11];
        this.f4394l = new short[i14 * i11];
        this.f4396n = new short[i14 * i11];
    }

    public static void e(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        short[] sArrC = c(this.f4394l, this.f4395m, i11);
        this.f4394l = sArrC;
        int i12 = this.f4384b;
        System.arraycopy(sArr, i10 * i12, sArrC, this.f4395m * i12, i12 * i11);
        this.f4395m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.f4390h / i11;
        int i13 = this.f4384b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f4391i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f4384b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f4384b;
        int i14 = BiometricManager.Authenticators.BIOMETRIC_WEAK;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f4403u = i15 / i16;
        this.f4404v = i17 / i14;
        return i16;
    }

    public final void f() {
        float f10;
        float f11;
        float f12;
        double d10;
        int iD;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f4395m;
        float f13 = this.f4385c;
        float f14 = this.f4386d;
        float f15 = f13 / f14;
        float f16 = this.f4387e * f14;
        double d11 = f15;
        int i18 = this.f4383a;
        int i19 = 1;
        int i20 = this.f4384b;
        if (d11 > 1.00001d || d11 < 0.99999d) {
            int i21 = this.f4393k;
            int i22 = this.f4390h;
            if (i21 >= i22) {
                int i23 = 0;
                while (true) {
                    int i24 = this.f4400r;
                    if (i24 > 0) {
                        int iMin = Math.min(i22, i24);
                        a(this.f4392j, i23, iMin);
                        this.f4400r -= iMin;
                        i23 += iMin;
                        f11 = f15;
                        f12 = f16;
                        d10 = d11;
                        f10 = 1.0f;
                    } else {
                        short[] sArr = this.f4392j;
                        int i25 = i18 > 4000 ? i18 / 4000 : i19;
                        f10 = 1.0f;
                        int i26 = this.f4389g;
                        int i27 = this.f4388f;
                        if (i20 == i19 && i25 == i19) {
                            iD = d(sArr, i23, i27, i26);
                            f11 = f15;
                            f12 = f16;
                            d10 = d11;
                        } else {
                            b(sArr, i23, i25);
                            f11 = f15;
                            f12 = f16;
                            short[] sArr2 = this.f4391i;
                            d10 = d11;
                            int iD2 = d(sArr2, 0, i27 / i25, i26 / i25);
                            if (i25 != 1) {
                                int i28 = iD2 * i25;
                                int i29 = i25 * 4;
                                int i30 = i28 - i29;
                                int i31 = i28 + i29;
                                if (i30 >= i27) {
                                    i27 = i30;
                                }
                                if (i31 <= i26) {
                                    i26 = i31;
                                }
                                if (i20 == 1) {
                                    iD = d(sArr, i23, i27, i26);
                                } else {
                                    b(sArr, i23, 1);
                                    iD = d(sArr2, 0, i27, i26);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i32 = this.f4403u;
                        int i33 = this.f4404v;
                        if (i32 == 0 || (i10 = this.f4401s) == 0 || i33 > i32 * 3 || i32 * 2 <= this.f4402t * 3) {
                            i10 = iD;
                        }
                        this.f4402t = i32;
                        this.f4401s = iD;
                        if (d10 > 1.0d) {
                            short[] sArr3 = this.f4392j;
                            if (f11 >= 2.0f) {
                                i12 = (int) (i10 / (f11 - 1.0f));
                            } else {
                                this.f4400r = (int) (((2.0f - f11) * i10) / (f11 - 1.0f));
                                i12 = i10;
                            }
                            short[] sArrC = c(this.f4394l, this.f4395m, i12);
                            this.f4394l = sArrC;
                            int i34 = i23 + i10;
                            int i35 = i23;
                            int i36 = i12;
                            e(i36, this.f4384b, sArrC, this.f4395m, sArr3, i35, sArr3, i34);
                            this.f4395m += i36;
                            i23 = i10 + i36 + i35;
                        } else {
                            int i37 = i23;
                            short[] sArr4 = this.f4392j;
                            if (f11 < 0.5f) {
                                i11 = (int) ((i10 * f11) / (1.0f - f11));
                            } else {
                                this.f4400r = (int) ((((2.0f * f11) - 1.0f) * i10) / (1.0f - f11));
                                i11 = i10;
                            }
                            int i38 = i10 + i11;
                            short[] sArrC2 = c(this.f4394l, this.f4395m, i38);
                            this.f4394l = sArrC2;
                            System.arraycopy(sArr4, i37 * i20, sArrC2, this.f4395m * i20, i10 * i20);
                            e(i11, this.f4384b, this.f4394l, this.f4395m + i10, sArr4, i37 + i10, sArr4, i37);
                            this.f4395m += i38;
                            i23 = i37 + i11;
                        }
                    }
                    if (i23 + i22 > i21) {
                        break;
                    }
                    i19 = 1;
                    f15 = f11;
                    f16 = f12;
                    d11 = d10;
                }
                int i39 = this.f4393k - i23;
                short[] sArr5 = this.f4392j;
                System.arraycopy(sArr5, i23 * i20, sArr5, 0, i39 * i20);
                this.f4393k = i39;
            }
            if (f12 != f10 || this.f4395m == i17) {
            }
            int i40 = (int) (i18 / f12);
            while (true) {
                if (i40 <= 16384 && i18 <= 16384) {
                    break;
                }
                i40 /= 2;
                i18 /= 2;
            }
            int i41 = this.f4395m - i17;
            short[] sArrC3 = c(this.f4396n, this.f4397o, i41);
            this.f4396n = sArrC3;
            System.arraycopy(this.f4394l, i17 * i20, sArrC3, this.f4397o * i20, i41 * i20);
            this.f4395m = i17;
            this.f4397o += i41;
            int i42 = 0;
            while (true) {
                i13 = this.f4397o;
                i14 = i13 - 1;
                if (i42 >= i14) {
                    break;
                }
                while (true) {
                    i15 = this.f4398p + 1;
                    int i43 = i15 * i40;
                    i16 = this.f4399q;
                    if (i43 <= i16 * i18) {
                        break;
                    }
                    this.f4394l = c(this.f4394l, this.f4395m, 1);
                    for (int i44 = 0; i44 < i20; i44++) {
                        short[] sArr6 = this.f4394l;
                        int i45 = (this.f4395m * i20) + i44;
                        short[] sArr7 = this.f4396n;
                        int i46 = (i42 * i20) + i44;
                        short s6 = sArr7[i46];
                        short s10 = sArr7[i46 + i20];
                        int i47 = this.f4399q * i18;
                        int i48 = this.f4398p;
                        int i49 = i48 * i40;
                        int i50 = (i48 + 1) * i40;
                        int i51 = i50 - i47;
                        int i52 = i50 - i49;
                        sArr6[i45] = (short) ((((i52 - i51) * s10) + (s6 * i51)) / i52);
                    }
                    this.f4399q++;
                    this.f4395m++;
                }
                this.f4398p = i15;
                if (i15 == i18) {
                    this.f4398p = 0;
                    k.e(i16 == i40);
                    this.f4399q = 0;
                }
                i42++;
            }
            if (i14 == 0) {
                return;
            }
            short[] sArr8 = this.f4396n;
            System.arraycopy(sArr8, i14 * i20, sArr8, 0, (i13 - i14) * i20);
            this.f4397o -= i14;
            return;
        }
        a(this.f4392j, 0, this.f4393k);
        this.f4393k = 0;
        f12 = f16;
        f10 = 1.0f;
        if (f12 != f10) {
        }
    }
}
