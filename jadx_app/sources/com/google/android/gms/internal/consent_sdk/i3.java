package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.FormError;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class i3 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20809a;

    public i3(int i10, String str) {
        super(str);
        this.f20809a = i10;
    }

    public final FormError a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new FormError(this.f20809a, super.getMessage());
    }

    public i3(int i10, IOException iOException, String str) {
        super(str, iOException);
        this.f20809a = i10;
    }
}
