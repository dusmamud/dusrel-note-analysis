package z8;

import com.google.errorprone.annotations.DoNotCall;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z0<E> implements Iterator<E> {
    @Override // java.util.Iterator
    @DoNotCall
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
