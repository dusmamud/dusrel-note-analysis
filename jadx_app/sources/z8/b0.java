package z8;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends b<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator f37549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y8.i f37550d;

    public b0(final Iterator val$unfiltered, final y8.i val$retainIfTrue) {
        this.f37549c = val$unfiltered;
        this.f37550d = val$retainIfTrue;
    }

    @Override // z8.b
    public final Object a() {
        Object next;
        do {
            Iterator it = this.f37549c;
            if (!it.hasNext()) {
                this.f37546a = b.EnumC0314b.DONE;
                return null;
            }
            next = it.next();
        } while (!this.f37550d.apply(next));
        return next;
    }
}
