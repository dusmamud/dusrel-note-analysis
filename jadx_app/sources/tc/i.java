package tc;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements nd.g<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object[] f34538a;

    public i(Object[] objArr) {
        this.f34538a = objArr;
    }

    @Override // nd.g
    public final Iterator<Object> iterator() {
        return new kotlin.jvm.internal.a(this.f34538a);
    }
}
