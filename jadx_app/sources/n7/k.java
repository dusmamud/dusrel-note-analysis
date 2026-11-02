package n7;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f31706a;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f31707a;

        public a(Runnable runnable) {
            this.f31707a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f31707a.run();
            } catch (Exception e10) {
                r7.a.b("Executor", "Background execution failure.", e10);
            }
        }
    }

    public k(ExecutorService executorService) {
        this.f31706a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f31706a.execute(new a(runnable));
    }
}
