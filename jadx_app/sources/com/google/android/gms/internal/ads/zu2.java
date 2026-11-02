package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class zu2 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f20403a = new ArrayDeque(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f20404b;

    static {
        yu2 yu2Var = yu2.f19868a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th = this.f20404b;
        while (true) {
            ArrayDeque arrayDeque = this.f20403a;
            if (arrayDeque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) arrayDeque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (Throwable unused) {
                        xu2.f19398a.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th2);
                    }
                }
            }
        }
        if (this.f20404b != null || th == null) {
            return;
        }
        Object obj = lq2.f12523a;
        if (IOException.class.isInstance(th)) {
            throw ((Throwable) IOException.class.cast(th));
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new AssertionError(th);
        }
        throw ((Error) th);
    }
}
