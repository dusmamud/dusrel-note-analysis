package yd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37280b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f37281c = AtomicIntegerFieldUpdater.newUpdater(k.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f37282d = AtomicIntegerFieldUpdater.newUpdater(k.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f37283e = AtomicIntegerFieldUpdater.newUpdater(k.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray<g> f37284a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final g a(g gVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f37281c;
        if (atomicIntegerFieldUpdater.get(this) - f37282d.get(this) == 127) {
            return gVar;
        }
        if (gVar.f37271b) {
            f37283e.incrementAndGet(this);
        }
        int i10 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray<g> atomicReferenceArray = this.f37284a;
            if (atomicReferenceArray.get(i10) == null) {
                atomicReferenceArray.lazySet(i10, gVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final g b() {
        g andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f37282d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f37281c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.f37284a.getAndSet(i11, null)) != null) {
                if (andSet.f37271b) {
                    f37283e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final g c(int i10, boolean z10) {
        int i11 = i10 & 127;
        AtomicReferenceArray<g> atomicReferenceArray = this.f37284a;
        g gVar = atomicReferenceArray.get(i11);
        if (gVar != null && gVar.f37271b == z10) {
            while (!atomicReferenceArray.compareAndSet(i11, gVar, null)) {
                if (atomicReferenceArray.get(i11) != gVar) {
                }
            }
            if (z10) {
                f37283e.decrementAndGet(this);
            }
            return gVar;
        }
        return null;
    }
}
