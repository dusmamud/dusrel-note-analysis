package t0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class n implements ThreadFactory {

    public static class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f34279a;

        public a(Runnable runnable) {
            super(runnable, "fonts-androidx");
            this.f34279a = 10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f34279a);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable);
    }
}
