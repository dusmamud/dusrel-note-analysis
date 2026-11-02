package z8;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {
    public static Object a(AbstractCollection iterable, String defaultValue) {
        Iterator it = iterable.iterator();
        return it.hasNext() ? it.next() : defaultValue;
    }

    public static <T> T b(Iterable<T> iterable) {
        T next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<T> it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> void c(List<T> list, y8.i<? super T> predicate, int to, int from) {
        for (int size = list.size() - 1; size > from; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i10 = from - 1; i10 >= to; i10--) {
            list.remove(i10);
        }
    }
}
