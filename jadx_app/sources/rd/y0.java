package rd;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f34001a;

    public y0(ScheduledFuture scheduledFuture) {
        this.f34001a = scheduledFuture;
    }

    @Override // rd.z0
    public final void dispose() {
        this.f34001a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f34001a + ']';
    }
}
