package n6;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class u implements o6.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f31636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f31637c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<a> f31635a = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f31638d = new Object();

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f31639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f31640b;

        public a(u serialExecutor, Runnable runnable) {
            this.f31639a = serialExecutor;
            this.f31640b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f31640b.run();
                synchronized (this.f31639a.f31638d) {
                    this.f31639a.a();
                }
            } catch (Throwable th) {
                synchronized (this.f31639a.f31638d) {
                    this.f31639a.a();
                    throw th;
                }
            }
        }
    }

    public u(Executor executor) {
        this.f31636b = executor;
    }

    public final void a() {
        a aVarPoll = this.f31635a.poll();
        this.f31637c = aVarPoll;
        if (aVarPoll != null) {
            this.f31636b.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        synchronized (this.f31638d) {
            try {
                this.f31635a.add(new a(this, command));
                if (this.f31637c == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
