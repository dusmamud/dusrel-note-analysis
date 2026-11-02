package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import n8.a;

/* JADX INFO: loaded from: classes2.dex */
final class zzu implements Executor {
    private final Handler zza = new a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
