package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zs2 implements Iterator {
    public static final zs2 zza;
    private static final /* synthetic */ zs2[] zzb;

    static {
        zs2 zs2Var = new zs2("INSTANCE", 0);
        zza = zs2Var;
        zzb = new zs2[]{zs2Var};
    }

    public static zs2[] values() {
        return (zs2[]) zzb.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        up2.g("no calls to next() since the last call to remove()", false);
    }
}
