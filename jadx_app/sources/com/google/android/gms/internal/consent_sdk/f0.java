package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f20753a;

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Activity activity = this.f20753a;
        return activity != null ? activity.getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f20753a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            super.startActivity(intent);
        }
    }
}
