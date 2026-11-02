package com.google.android.gms.internal.ads;

import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class e02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Message f8571a;

    public e02() {
        throw null;
    }

    public final void a() {
        Message message = this.f8571a;
        message.getClass();
        message.sendToTarget();
        this.f8571a = null;
        l02.g(this);
    }
}
