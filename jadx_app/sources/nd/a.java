package nd;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class a<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<g<T>> f31975a;

    public a(g<? extends T> gVar) {
        this.f31975a = new AtomicReference<>(gVar);
    }

    @Override // nd.g
    public final Iterator<T> iterator() {
        g<T> andSet = this.f31975a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
