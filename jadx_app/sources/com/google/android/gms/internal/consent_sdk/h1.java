package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.common.api.Api;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20775a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20777c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20776b = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20778d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20779e = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    public h1(String str) {
        this.f20777c = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        int i11 = this.f20776b;
        if (i11 == 4) {
            throw new IllegalStateException();
        }
        int i12 = i11 - 1;
        String string = null;
        if (i11 == 0) {
            throw null;
        }
        if (i12 == 0) {
            return true;
        }
        if (i12 != 2) {
            this.f20776b = 4;
            int i13 = this.f20778d;
            while (true) {
                int length = this.f20778d;
                if (length == -1) {
                    this.f20776b = 3;
                    break;
                }
                String str = this.f20777c;
                int length2 = str.length();
                g1.b(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (str.charAt(length) == ',') {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = str.length();
                    this.f20778d = -1;
                    i10 = -1;
                } else {
                    i10 = length + 1;
                    this.f20778d = i10;
                }
                if (i10 != i13) {
                    if (i13 < length) {
                        str.charAt(i13);
                    }
                    if (i13 < length) {
                        str.charAt(length - 1);
                    }
                    int i14 = this.f20779e;
                    if (i14 == 1) {
                        length = str.length();
                        this.f20778d = -1;
                        if (length > i13) {
                            str.charAt(length - 1);
                        }
                    } else {
                        this.f20779e = i14 - 1;
                    }
                    string = str.subSequence(i13, length).toString();
                    break;
                }
                int i15 = i10 + 1;
                this.f20778d = i15;
                if (i15 > str.length()) {
                    this.f20778d = -1;
                }
            }
            this.f20775a = string;
            if (this.f20776b != 3) {
                this.f20776b = 1;
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
        this.f20776b = 2;
        String str = this.f20775a;
        this.f20775a = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
