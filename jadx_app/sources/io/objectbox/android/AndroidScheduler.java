package io.objectbox.android;

import android.os.Handler;
import android.os.Looper;
import io.objectbox.reactive.RunWithParam;
import io.objectbox.reactive.Scheduler;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public class AndroidScheduler extends Handler implements Scheduler {
    private static AndroidScheduler MAIN_THREAD;
    private final Deque<Runner> freeRunners;

    public class Runner implements Runnable {
        Object param;
        RunWithParam<Object> runWithParam;

        public Runner() {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.runWithParam.run(this.param);
            this.runWithParam = null;
            this.param = null;
            synchronized (AndroidScheduler.this.freeRunners) {
                try {
                    if (AndroidScheduler.this.freeRunners.size() < 20) {
                        AndroidScheduler.this.freeRunners.add(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public AndroidScheduler(Looper looper) {
        super(looper);
        this.freeRunners = new ArrayDeque();
    }

    public static synchronized Scheduler mainThread() {
        try {
            if (MAIN_THREAD == null) {
                MAIN_THREAD = new AndroidScheduler(Looper.getMainLooper());
            }
        } catch (Throwable th) {
            throw th;
        }
        return MAIN_THREAD;
    }

    @Override // io.objectbox.reactive.Scheduler
    public <T> void run(RunWithParam<T> runWithParam, T t6) {
        Runner runnerPoll;
        synchronized (this.freeRunners) {
            runnerPoll = this.freeRunners.poll();
        }
        if (runnerPoll == null) {
            runnerPoll = new Runner();
        }
        runnerPoll.runWithParam = runWithParam;
        runnerPoll.param = t6;
        post(runnerPoll);
    }
}
