package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class t5 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f22803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v5 f22804d;

    public /* synthetic */ t5(v5 v5Var) {
        Objects.requireNonNull(v5Var);
        this.f22804d = v5Var;
        this.f22801a = -1;
    }

    public final Iterator a() {
        if (this.f22803c == null) {
            this.f22803c = this.f22804d.f22826c.entrySet().iterator();
        }
        return this.f22803c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f22801a + 1;
        v5 v5Var = this.f22804d;
        if (i10 >= v5Var.f22825b) {
            return !v5Var.f22826c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f22802b = true;
        int i10 = this.f22801a + 1;
        this.f22801a = i10;
        v5 v5Var = this.f22804d;
        return i10 < v5Var.f22825b ? (s5) v5Var.f22824a[i10] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f22802b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f22802b = false;
        int i10 = v5.f22823g;
        v5 v5Var = this.f22804d;
        v5Var.i();
        int i11 = this.f22801a;
        if (i11 >= v5Var.f22825b) {
            a().remove();
        } else {
            this.f22801a = i11 - 1;
            v5Var.g(i11);
        }
    }
}
