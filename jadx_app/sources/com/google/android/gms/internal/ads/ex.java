package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class ex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8955a;

    public ex(Context context) {
        Preconditions.checkNotNull(context, "Context can not be null");
        this.f8955a = context;
    }

    public final boolean a(Intent intent) {
        Preconditions.checkNotNull(intent, "Intent can not be null");
        return !this.f8955a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
