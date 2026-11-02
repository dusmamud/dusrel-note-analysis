package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class at3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f6889a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof at3) {
            return this.f6889a.equals(((at3) obj).f6889a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6889a.hashCode();
    }
}
