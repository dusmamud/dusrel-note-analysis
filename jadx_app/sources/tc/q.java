package tc;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements nd.g<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterable f34539a;

    public q(Iterable iterable) {
        this.f34539a = iterable;
    }

    @Override // nd.g
    public final Iterator<Object> iterator() {
        return this.f34539a.iterator();
    }
}
