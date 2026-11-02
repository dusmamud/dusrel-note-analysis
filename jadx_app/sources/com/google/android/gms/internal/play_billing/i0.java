package com.google.android.gms.internal.play_billing;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22688a;

    static {
        int[] iArr = new int[TimeUnit.values().length];
        f22688a = iArr;
        try {
            iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f22688a[TimeUnit.MICROSECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f22688a[TimeUnit.MILLISECONDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f22688a[TimeUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f22688a[TimeUnit.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f22688a[TimeUnit.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f22688a[TimeUnit.DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
