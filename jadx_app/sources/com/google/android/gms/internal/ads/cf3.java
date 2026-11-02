package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class cf3 extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7852a;

    public cf3(String str) {
        this.f7852a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f7852a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cf3) {
            return this.f7852a.equals(((cf3) obj).f7852a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f7852a);
    }

    public final int hashCode() {
        return this.f7852a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f7852a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return mf3.a(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f7852a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return mf3.a(str).longValue();
        }
    }

    public final String toString() {
        return this.f7852a;
    }
}
