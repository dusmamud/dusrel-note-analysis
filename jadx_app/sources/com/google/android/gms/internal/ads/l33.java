package com.google.android.gms.internal.ads;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class l33 extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12183a;

    public l33(String str) {
        this.f12183a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f12183a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l33) {
            return this.f12183a.equals(((l33) obj).f12183a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f12183a);
    }

    public final int hashCode() {
        return this.f12183a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f12183a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f12183a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f12183a;
    }
}
