package z8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i0<V> implements y8.o<List<V>>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37601a;

    public i0() {
        i.a(2, "expectedValuesPerKey");
        this.f37601a = 2;
    }

    @Override // y8.o
    public final Object get() {
        return new ArrayList(this.f37601a);
    }
}
