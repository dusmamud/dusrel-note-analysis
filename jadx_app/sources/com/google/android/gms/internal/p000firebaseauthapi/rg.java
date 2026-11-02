package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class rg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f22149a = Logger.getLogger(rg.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f22150b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class a {
        public static final a zza;
        public static final a zzb;
        private static final /* synthetic */ a[] zzc;

        static {
            tg tgVar = new tg();
            zza = tgVar;
            sg sgVar = new sg();
            zzb = sgVar;
            zzc = new a[]{tgVar, sgVar};
        }

        public static a[] values() {
            return (a[]) zzc.clone();
        }

        public abstract boolean a();
    }

    public static boolean a() {
        return f22150b.get();
    }
}
