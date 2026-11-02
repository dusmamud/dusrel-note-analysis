package x1;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<Result> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Handler f36149e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile e f36151b = e.PENDING;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f36152c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f36153d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f36150a = new b(new a());

    public class a implements Callable<Result> {
        public a() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public final Result call() {
            c cVar = c.this;
            cVar.f36153d.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) cVar.a();
                Binder.flushPendingCommands();
                cVar.d(result);
                return result;
            } catch (Throwable th) {
                try {
                    cVar.f36152c.set(true);
                    throw th;
                } catch (Throwable th2) {
                    cVar.d(result);
                    throw th2;
                }
            }
        }
    }

    public class b extends FutureTask<Result> {
        public b(a aVar) {
            super(aVar);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            c cVar = c.this;
            AtomicBoolean atomicBoolean = cVar.f36153d;
            try {
                Result result = get();
                if (atomicBoolean.get()) {
                    return;
                }
                cVar.d(result);
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                if (atomicBoolean.get()) {
                    return;
                }
                cVar.d(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* JADX INFO: renamed from: x1.c$c, reason: collision with other inner class name */
    public class RunnableC0293c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f36156a;

        public RunnableC0293c(Object obj) {
            this.f36156a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            Object obj = this.f36156a;
            if (cVar.f36152c.get()) {
                cVar.b(obj);
            } else {
                cVar.c(obj);
            }
            cVar.f36151b = e.FINISHED;
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36158a;

        static {
            int[] iArr = new int[e.values().length];
            f36158a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36158a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        private static final /* synthetic */ e[] $VALUES;
        public static final e FINISHED;
        public static final e PENDING;
        public static final e RUNNING;

        static {
            e eVar = new e("PENDING", 0);
            PENDING = eVar;
            e eVar2 = new e("RUNNING", 1);
            RUNNING = eVar2;
            e eVar3 = new e("FINISHED", 2);
            FINISHED = eVar3;
            $VALUES = new e[]{eVar, eVar2, eVar3};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    public abstract Result a();

    public final void d(Result result) {
        Handler handler;
        synchronized (c.class) {
            try {
                if (f36149e == null) {
                    f36149e = new Handler(Looper.getMainLooper());
                }
                handler = f36149e;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new RunnableC0293c(result));
    }

    public void b(Result result) {
    }

    public void c(Result result) {
    }
}
