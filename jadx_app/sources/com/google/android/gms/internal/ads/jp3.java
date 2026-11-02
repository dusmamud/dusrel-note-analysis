package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
public final class jp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f11455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hp3 f11456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kp3 f11457c;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.hp3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.ip3] */
    public /* synthetic */ jp3(kp3 kp3Var, Context context) {
        this.f11457c = kp3Var;
        this.f11455a = new WeakReference(context);
        ?? r10 = new IntConsumer() { // from class: com.google.android.gms.internal.ads.hp3
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i10) {
                kp3 kp3Var2 = this.f10389a.f11457c;
                if (kp3Var2.f11970n0) {
                    return;
                }
                kp3Var2.G(1, 19, Integer.valueOf(i10));
            }
        };
        this.f11456b = r10;
        final l02 l02VarA = kp3Var.f11982u.a(kp3Var.f11979s, null);
        context.registerDeviceIdChangeListener(new Executor() { // from class: com.google.android.gms.internal.ads.ip3
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                l02VarA.d(runnable);
            }
        }, r10);
    }
}
