package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class af0 extends ContextWrapper {
    public static Context a(Context context) {
        if (context instanceof af0) {
            return ((af0) context).getBaseContext();
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
