package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10754b;

    public ig(String str, String str2) {
        this.f10753a = str;
        this.f10754b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ig.class == obj.getClass()) {
            ig igVar = (ig) obj;
            if (TextUtils.equals(this.f10753a, igVar.f10753a) && TextUtils.equals(this.f10754b, igVar.f10754b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10754b.hashCode() + (this.f10753a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.f10753a;
        int length = String.valueOf(str).length();
        String str2 = this.f10754b;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        b0.e.c(sb2, "Header[name=", str, ",value=", str2);
        sb2.append("]");
        return sb2.toString();
    }
}
