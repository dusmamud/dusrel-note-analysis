package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class up2 {
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(int i10, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(hq2.a(str, Integer.valueOf(i10)));
        }
    }

    public static void d(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(hq2.a(str, Long.valueOf(j10)));
        }
    }

    public static void e(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(hq2.a(str, obj));
        }
    }

    public static void f(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void g(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void i(int i10, int i11) {
        String strA;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strA = hq2.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(com.google.android.gms.internal.mlkit_genai_speech.a.b(i11, "negative size: ", new StringBuilder(String.valueOf(i11).length() + 15)));
                }
                strA = hq2.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void j(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(l(i10, i11, "index"));
        }
    }

    public static void k(int i10, int i11, int i12) {
        String strL;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strL = l(i10, i12, "start index");
            } else {
                strL = (i11 < 0 || i11 > i12) ? l(i11, i12, "end index") : hq2.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strL);
        }
    }

    public static String l(int i10, int i11, String str) {
        if (i10 < 0) {
            return hq2.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return hq2.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(com.google.android.gms.internal.mlkit_genai_speech.a.b(i11, "negative size: ", new StringBuilder(String.valueOf(i11).length() + 15)));
    }
}
