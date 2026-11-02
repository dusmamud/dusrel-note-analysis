package com.google.mlkit.genai.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class GenAiUtils {
    private GenAiUtils() {
    }

    @KeepForSdk
    public static boolean isAiCoreCompatible(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.aicore", 0).versionCode >= 193575;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
