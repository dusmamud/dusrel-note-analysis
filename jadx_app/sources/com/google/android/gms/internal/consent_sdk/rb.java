package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class rb implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f20995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tb f20996d;

    public /* synthetic */ rb(tb tbVar) {
        Objects.requireNonNull(tbVar);
        this.f20996d = tbVar;
        this.f20993a = -1;
    }

    public final Iterator a() {
        if (this.f20995c == null) {
            this.f20995c = this.f20996d.f21016c.entrySet().iterator();
        }
        return this.f20995c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f20993a + 1;
        tb tbVar = this.f20996d;
        if (i10 >= tbVar.f21015b) {
            return !tbVar.f21016c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f20994b = true;
        int i10 = this.f20993a + 1;
        this.f20993a = i10;
        tb tbVar = this.f20996d;
        return i10 < tbVar.f21015b ? (qb) tbVar.f21014a[i10] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f20994b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f20994b = false;
        int i10 = tb.f21013g;
        tb tbVar = this.f20996d;
        tbVar.i();
        int i11 = this.f20993a;
        if (i11 >= tbVar.f21015b) {
            a().remove();
        } else {
            this.f20993a = i11 - 1;
            tbVar.g(i11);
        }
    }
}
