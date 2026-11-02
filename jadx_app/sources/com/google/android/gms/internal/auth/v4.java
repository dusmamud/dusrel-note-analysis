package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v4 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20650a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f20652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x4 f20653d;

    public final Iterator a() {
        if (this.f20652c == null) {
            this.f20652c = this.f20653d.f20681c.entrySet().iterator();
        }
        return this.f20652c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f20650a + 1;
        x4 x4Var = this.f20653d;
        if (i10 >= x4Var.f20680b.size()) {
            return !x4Var.f20681c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f20651b = true;
        int i10 = this.f20650a + 1;
        this.f20650a = i10;
        x4 x4Var = this.f20653d;
        return i10 < x4Var.f20680b.size() ? (Map.Entry) x4Var.f20680b.get(this.f20650a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f20651b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f20651b = false;
        int i10 = x4.f20678g;
        x4 x4Var = this.f20653d;
        x4Var.g();
        if (this.f20650a >= x4Var.f20680b.size()) {
            a().remove();
            return;
        }
        int i11 = this.f20650a;
        this.f20650a = i11 - 1;
        x4Var.e(i11);
    }
}
