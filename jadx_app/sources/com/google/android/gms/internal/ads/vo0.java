package com.google.android.gms.internal.ads;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class vo0 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f18120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wo0 f18121b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo0(wo0 wo0Var, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.f18120a = runnable2;
        this.f18121b = wo0Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f18121b.f18676b);
        this.f18120a.run();
    }
}
