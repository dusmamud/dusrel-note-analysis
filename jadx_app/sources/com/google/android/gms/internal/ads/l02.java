package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l02 implements ne1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f12159b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f12160a;

    public l02(Handler handler) {
        this.f12160a = handler;
    }

    public static /* synthetic */ void g(e02 e02Var) {
        ArrayList arrayList = f12159b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(e02Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static e02 h() {
        e02 e02Var;
        ArrayList arrayList = f12159b;
        synchronized (arrayList) {
            try {
                e02Var = arrayList.isEmpty() ? new e02() : (e02) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return e02Var;
    }

    @Override // com.google.android.gms.internal.ads.ne1
    public final e02 a(int i10) {
        e02 e02VarH = h();
        e02VarH.f8571a = this.f12160a.obtainMessage(i10);
        return e02VarH;
    }

    @Override // com.google.android.gms.internal.ads.ne1
    public final boolean b(e02 e02Var) {
        Message message = e02Var.f8571a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = this.f12160a.sendMessageAtFrontOfQueue(message);
        e02Var.f8571a = null;
        g(e02Var);
        return zSendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.gms.internal.ads.ne1
    public final boolean c(a52 a52Var) {
        return this.f12160a.postDelayed(a52Var, 1000L);
    }

    @Override // com.google.android.gms.internal.ads.ne1
    public final boolean d(Runnable runnable) {
        return this.f12160a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.ne1
    public final boolean e(long j10) {
        return this.f12160a.sendEmptyMessageAtTime(2, j10);
    }

    @Override // com.google.android.gms.internal.ads.ne1
    public final e02 f(int i10, Object obj) {
        e02 e02VarH = h();
        e02VarH.f8571a = this.f12160a.obtainMessage(i10, obj);
        return e02VarH;
    }

    @Override // com.google.android.gms.internal.ads.ne1
    public final Looper zza() {
        return this.f12160a.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.ne1
    public final boolean zzb(int i10) {
        return this.f12160a.hasMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.ne1
    public final e02 zze(int i10, int i11, int i12) {
        e02 e02VarH = h();
        e02VarH.f8571a = this.f12160a.obtainMessage(i10, i11, i12);
        return e02VarH;
    }

    @Override // com.google.android.gms.internal.ads.ne1
    public final e02 zzf(Object obj) {
        e02 e02VarH = h();
        e02VarH.f8571a = this.f12160a.obtainMessage(31, 0, 0, obj);
        return e02VarH;
    }

    @Override // com.google.android.gms.internal.ads.ne1
    public final boolean zzh(int i10) {
        return this.f12160a.sendEmptyMessage(i10);
    }

    @Override // com.google.android.gms.internal.ads.ne1
    public final boolean zzi(int i10, int i11) {
        return this.f12160a.sendEmptyMessageDelayed(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.ne1
    public final void zzk(int i10) {
        this.f12160a.removeMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.ne1
    public final void zzl() {
        this.f12160a.removeCallbacksAndMessages(null);
    }
}
