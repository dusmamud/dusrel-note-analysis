package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class t1 implements Executor {
    public static final t1 zza;
    private static final /* synthetic */ t1[] zzb;

    static {
        t1 t1Var = new t1("INSTANCE", 0);
        zza = t1Var;
        zzb = new t1[]{t1Var};
    }

    public static t1[] values() {
        return (t1[]) zzb.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
