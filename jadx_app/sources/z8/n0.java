package z8;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n0<T> implements Comparator<T> {
    public <S extends T> n0<S> a() {
        return new s0(this);
    }
}
