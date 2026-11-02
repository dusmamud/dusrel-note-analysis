package rd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f33991b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f33992a;

    public x(boolean z10, Throwable th) {
        this.f33992a = th;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f33992a + ']';
    }
}
