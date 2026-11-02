package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bx2 implements Executor {
    public static final bx2 zza;
    private static final /* synthetic */ bx2[] zzb;

    static {
        bx2 bx2Var = new bx2("INSTANCE", 0);
        zza = bx2Var;
        zzb = new bx2[]{bx2Var};
    }

    public static bx2[] values() {
        return (bx2[]) zzb.clone();
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
