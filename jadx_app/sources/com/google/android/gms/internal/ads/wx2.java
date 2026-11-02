package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class wx2 {
    public static Executor a(final Executor executor, final dx2 dx2Var) {
        executor.getClass();
        return executor == bx2.zza ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.sx2
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e10) {
                    dx2Var.e(e10);
                }
            }
        };
    }
}
