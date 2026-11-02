package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public abstract class tj3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static MessageDigest f16431b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16432a;

    public tj3(int i10) {
        switch (i10) {
            case 4:
                this.f16432a = new xp();
                break;
            default:
                this.f16432a = new Object();
                break;
        }
    }

    public boolean a() {
        return j() == 3 && l() && k() == 0;
    }

    public abstract boolean b(long j10, Object obj);

    public MessageDigest c() {
        synchronized (this.f16432a) {
            MessageDigest messageDigest = f16431b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    f16431b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f16431b;
        }
    }

    public abstract void d(Object obj, long j10, boolean z10);

    public abstract float e(long j10, Object obj);

    public abstract void f(int i10, long j10);

    public abstract void g(Object obj, long j10, float f10);

    public abstract double h(long j10, Object obj);

    public abstract void i(Object obj, long j10, double d10);

    public abstract int j();

    public abstract int k();

    public abstract boolean l();

    public abstract void m();

    public abstract void n();

    public abstract xq o();

    public abstract int p();

    public tj3(View view) {
        this.f16432a = new WeakReference(view);
    }
}
