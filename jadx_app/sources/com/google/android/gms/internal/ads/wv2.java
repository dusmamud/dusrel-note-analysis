package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class wv2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wv2 f18780b = new wv2(new a("Failure occurred while trying to finish a future."));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f18781a;

    public class a extends Throwable {
        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    public wv2(Throwable th) {
        th.getClass();
        this.f18781a = th;
    }
}
