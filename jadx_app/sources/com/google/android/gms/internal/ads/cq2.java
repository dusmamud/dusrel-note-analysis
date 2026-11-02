package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class cq2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7990a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f7992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final np2 f7993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7994e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7991b = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7995f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7996g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    public cq2(eq2 eq2Var, CharSequence charSequence) {
        this.f7993d = eq2Var.f8910a;
        this.f7994e = eq2Var.f8911b;
        this.f7992c = charSequence;
    }

    public abstract int a(int i10);

    public abstract int b(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iB;
        np2 np2Var;
        up2.f(this.f7991b != 4);
        int i10 = this.f7991b;
        int i11 = i10 - 1;
        String string = null;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f7991b = 4;
            int i12 = this.f7995f;
            while (true) {
                int i13 = this.f7995f;
                if (i13 == -1) {
                    this.f7991b = 3;
                    break;
                }
                int iA = a(i13);
                CharSequence charSequence = this.f7992c;
                if (iA == -1) {
                    iA = charSequence.length();
                    this.f7995f = -1;
                    iB = -1;
                } else {
                    iB = b(iA);
                    this.f7995f = iB;
                }
                if (iB == i12) {
                    int i14 = iB + 1;
                    this.f7995f = i14;
                    if (i14 > charSequence.length()) {
                        this.f7995f = -1;
                    }
                } else {
                    while (true) {
                        np2Var = this.f7993d;
                        if (i12 >= iA || !np2Var.a(charSequence.charAt(i12))) {
                            break;
                        }
                        i12++;
                    }
                    while (iA > i12) {
                        int i15 = iA - 1;
                        if (!np2Var.a(charSequence.charAt(i15))) {
                            break;
                        }
                        iA = i15;
                    }
                    if (!this.f7994e || i12 != iA) {
                        int i16 = this.f7996g;
                        if (i16 == 1) {
                            iA = charSequence.length();
                            this.f7995f = -1;
                            while (iA > i12) {
                                int i17 = iA - 1;
                                if (!np2Var.a(charSequence.charAt(i17))) {
                                    break;
                                }
                                iA = i17;
                            }
                        } else {
                            this.f7996g = i16 - 1;
                        }
                        string = charSequence.subSequence(i12, iA).toString();
                        break;
                    }
                    i12 = this.f7995f;
                }
            }
            this.f7990a = string;
            if (this.f7991b != 3) {
                this.f7991b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7991b = 2;
        String str = this.f7990a;
        this.f7990a = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
