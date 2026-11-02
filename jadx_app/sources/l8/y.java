package l8;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class y extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f30820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30821b;

    public y(Object obj) {
        this.f30821b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f30820a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f30820a) {
            throw new NoSuchElementException();
        }
        this.f30820a = true;
        return this.f30821b;
    }
}
