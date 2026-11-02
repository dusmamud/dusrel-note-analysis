package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class i7<E> extends AbstractList<E> implements v8<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21563a;

    public i7(boolean z10) {
        this.f21563a = z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        zza();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract E remove(int i10);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zza();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        zza();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        zza();
        return super.retainAll(collection);
    }

    public final void zza() {
        if (!this.f21563a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.v8
    public final void zzb() {
        if (this.f21563a) {
            this.f21563a = false;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.v8
    public final boolean zzc() {
        return this.f21563a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        zza();
        return super.addAll(i10, collection);
    }
}
