package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f1256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d<T> f1257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public j<Void> f1258c = new j<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1259d;

        public final void a(Object obj) {
            this.f1259d = true;
            d<T> dVar = this.f1257b;
            if (dVar == null || !dVar.f1261b.set(obj)) {
                return;
            }
            this.f1256a = null;
            this.f1257b = null;
            this.f1258c = null;
        }

        public final void b(Throwable th) {
            this.f1259d = true;
            d<T> dVar = this.f1257b;
            if (dVar == null || !dVar.f1261b.setException(th)) {
                return;
            }
            this.f1256a = null;
            this.f1257b = null;
            this.f1258c = null;
        }

        public final void finalize() {
            j<Void> jVar;
            d<T> dVar = this.f1257b;
            if (dVar != null) {
                d.a aVar = dVar.f1261b;
                if (!aVar.isDone()) {
                    aVar.setException(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f1256a));
                }
            }
            if (this.f1259d || (jVar = this.f1258c) == null) {
                return;
            }
            jVar.set(null);
        }
    }

    public static final class b extends Throwable {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public interface c<T> {
        Object a(a<T> aVar) throws Exception;
    }

    public static final class d<T> implements d9.b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<a<T>> f1260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f1261b = new a();

        public class a extends e<T> {
            public a() {
            }

            @Override // androidx.concurrent.futures.e
            public final String pendingToString() {
                a<T> aVar = d.this.f1260a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f1256a + "]";
            }
        }

        public d(a<T> aVar) {
            this.f1260a = new WeakReference<>(aVar);
        }

        @Override // d9.b
        public final void addListener(Runnable runnable, Executor executor) {
            this.f1261b.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            a<T> aVar = this.f1260a.get();
            boolean zCancel = this.f1261b.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.f1256a = null;
                aVar.f1257b = null;
                aVar.f1258c.set(null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public final T get() throws ExecutionException, InterruptedException {
            return this.f1261b.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f1261b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f1261b.isDone();
        }

        public final String toString() {
            return this.f1261b.toString();
        }

        @Override // java.util.concurrent.Future
        public final T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f1261b.get(j10, timeUnit);
        }
    }

    public static d a(c cVar) {
        a aVar = new a();
        d<T> dVar = new d<>(aVar);
        aVar.f1257b = dVar;
        aVar.f1256a = cVar.getClass();
        try {
            Object objA = cVar.a(aVar);
            if (objA == null) {
                return dVar;
            }
            aVar.f1256a = objA;
            return dVar;
        } catch (Exception e10) {
            dVar.f1261b.setException(e10);
            return dVar;
        }
    }
}
