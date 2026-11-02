package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class rf3 implements Closeable, Flushable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f15325j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f15326k = new String[128];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final of3 f15327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f15328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ue3 f15330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public bf3 f15334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f15335i;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f15326k[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f15326k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public rf3(of3 of3Var) {
        int[] iArr = new int[32];
        this.f15328b = iArr;
        boolean z10 = false;
        this.f15329c = 0;
        if (iArr.length == 0) {
            this.f15328b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f15328b;
        int i10 = this.f15329c;
        this.f15329c = i10 + 1;
        iArr2[i10] = 6;
        this.f15334h = bf3.zzb;
        this.f15327a = of3Var;
        ue3 ue3Var = ue3.f16928d;
        Objects.requireNonNull(ue3Var);
        String str = ue3Var.f16929a;
        this.f15330d = ue3Var;
        this.f15332f = com.amazon.a.a.o.b.f.f5855a;
        if (ue3Var.f16931c) {
            this.f15331e = ": ";
            if (str.isEmpty()) {
                this.f15332f = ", ";
            }
        } else {
            this.f15331e = ":";
        }
        if (str.isEmpty() && ue3Var.f16930b.isEmpty()) {
            z10 = true;
        }
        this.f15333g = z10;
    }

    public final void A() throws IOException {
        int iF = f();
        if (iF == 1) {
            this.f15328b[this.f15329c - 1] = 2;
            s();
            return;
        }
        of3 of3Var = this.f15327a;
        if (iF == 2) {
            of3Var.append((CharSequence) this.f15332f);
            s();
        } else {
            if (iF == 4) {
                of3Var.append((CharSequence) this.f15331e);
                this.f15328b[this.f15329c - 1] = 5;
                return;
            }
            if (iF != 6) {
                if (iF != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f15334h != bf3.zza) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f15328b[this.f15329c - 1] = 7;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15327a.getClass();
        int i10 = this.f15329c;
        if (i10 > 1 || (i10 == 1 && this.f15328b[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f15329c = 0;
    }

    public final void e(int i10, int i11, char c10) throws IOException {
        int iF = f();
        if (iF != i11 && iF != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.f15335i;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.f15329c--;
        if (iF == i11) {
            s();
        }
        this.f15327a.write(c10);
    }

    public final int f() {
        int i10 = this.f15329c;
        if (i10 != 0) {
            return this.f15328b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f15329c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f15327a.getClass();
    }

    public final void k() throws IOException {
        if (this.f15335i != null) {
            int iF = f();
            if (iF == 5) {
                this.f15327a.write(this.f15332f);
            } else if (iF != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            s();
            this.f15328b[this.f15329c - 1] = 4;
            m(this.f15335i);
            this.f15335i = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    public final void m(String str) throws IOException {
        String str2;
        of3 of3Var = this.f15327a;
        of3Var.write(34);
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                str2 = f15326k[cCharAt];
                if (str2 != null) {
                    if (i11 < i10) {
                        of3Var.write(str, i11, i10 - i11);
                    }
                    of3Var.write(str2);
                    i11 = i12;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i10) {
                    of3Var.write(str, i11, i10 - i11);
                }
                of3Var.write(str2);
                i11 = i12;
            }
            i10 = i12;
        }
        if (i11 < length) {
            of3Var.write(str, i11, length - i11);
        }
        of3Var.write(34);
    }

    public final void s() throws IOException {
        if (this.f15333g) {
            return;
        }
        ue3 ue3Var = this.f15330d;
        String str = ue3Var.f16929a;
        of3 of3Var = this.f15327a;
        of3Var.write(str);
        int i10 = this.f15329c;
        for (int i11 = 1; i11 < i10; i11++) {
            of3Var.write(ue3Var.f16930b);
        }
    }
}
