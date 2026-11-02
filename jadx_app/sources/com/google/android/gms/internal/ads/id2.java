package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.IBinder;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class id2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UUID f10725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UUID f10726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final UUID f10727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final UUID f10728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final UUID f10729e;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            IBinder.getSuggestedMaxIpcSizeBytes();
        }
        f10725a = new UUID(0L, 0L);
        f10726b = new UUID(1186680826959645954L, -5988876978535335093L);
        f10727c = new UUID(-2129748144642739255L, 8654423357094679310L);
        f10728d = new UUID(-1301668207276963122L, -6645017420763422227L);
        f10729e = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
