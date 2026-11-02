package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h1 f22684b = new h1(new a("Failure occurred while trying to finish a future."));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f22685a;

    public class a extends Throwable {
        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    public h1(Throwable th) {
        th.getClass();
        this.f22685a = th;
    }
}
