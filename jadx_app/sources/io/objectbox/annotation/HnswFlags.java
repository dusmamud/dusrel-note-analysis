package io.objectbox.annotation;

/* JADX INFO: loaded from: classes2.dex */
public @interface HnswFlags {
    boolean debugLogs() default false;

    boolean debugLogsDetailed() default false;

    boolean reparationLimitCandidates() default false;

    boolean vectorCacheSimdPaddingOff() default false;
}
