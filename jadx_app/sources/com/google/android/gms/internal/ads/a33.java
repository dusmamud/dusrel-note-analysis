package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class a33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f6505a = Logger.getLogger(a33.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f6506b = new AtomicBoolean(false);

    public static boolean a() {
        return f6506b.get();
    }
}
