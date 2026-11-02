package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class nu2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13527a;

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        return Byte.valueOf(zza());
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f13527a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public abstract byte zza();
}
