package androidx.constraintlayout.widget;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<Integer, HashSet<WeakReference<a>>> f1834a;

    public interface a {
    }

    public final void a(int i10, a aVar) {
        HashMap<Integer, HashSet<WeakReference<a>>> map = this.f1834a;
        HashSet<WeakReference<a>> hashSet = map.get(Integer.valueOf(i10));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            map.put(Integer.valueOf(i10), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }
}
