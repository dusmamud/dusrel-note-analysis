package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
final class zzjo implements ThreadFactory {
    final /* synthetic */ ThreadFactory zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ AtomicLong zzc;
    final /* synthetic */ Boolean zzd;

    public zzjo(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zza = threadFactory;
        this.zzb = str;
        this.zzc = atomicLong;
        this.zzd = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.zza.newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        String str = this.zzb;
        if (str != null) {
            AtomicLong atomicLong = this.zzc;
            Objects.requireNonNull(atomicLong);
            threadNewThread.setName(String.format(Locale.ROOT, str, Long.valueOf(atomicLong.getAndIncrement())));
        }
        if (this.zzd != null) {
            threadNewThread.setDaemon(true);
        }
        return threadNewThread;
    }
}
