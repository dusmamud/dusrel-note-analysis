package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class hu2 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return tw0.g(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
