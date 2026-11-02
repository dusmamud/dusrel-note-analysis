package sc;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class d<T> implements h<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f34195a;

    public d(T t6) {
        this.f34195a = t6;
    }

    @Override // sc.h
    public final T getValue() {
        return this.f34195a;
    }

    public final String toString() {
        return String.valueOf(this.f34195a);
    }
}
