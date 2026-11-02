package n5;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.google.android.gms.internal.ads.mj;
import com.inotesapp.inotes.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f31583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f31584e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f31587c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f31586b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f31585a = new HashMap();

    public a(Context context) {
        this.f31587c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f31583d == null) {
            synchronized (f31584e) {
                try {
                    if (f31583d == null) {
                        f31583d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f31583d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f31587c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f31586b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new mj(e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        HashMap map = this.f31585a;
        if (o5.a.d()) {
            try {
                Trace.beginSection(o5.a.e(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends b<?>>> listDependencies = bVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = bVar.create(this.f31587c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new mj(th2);
            }
        }
        Trace.endSection();
        return objCreate;
    }
}
