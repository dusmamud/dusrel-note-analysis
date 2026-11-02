package com.google.android.gms.internal.mlkit_genai_speech;

import android.content.Context;
import android.os.UserHandle;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
final class zzbch {
    private static volatile Method zza;

    private zzbch() {
    }

    public static Context zza(Context context, UserHandle userHandle, int i10) throws ReflectiveOperationException {
        if (zza == null) {
            synchronized (zzbch.class) {
                try {
                    if (zza == null) {
                        zza = Context.class.getMethod("createContextAsUser", UserHandle.class, Integer.TYPE);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (Context) zza.invoke(context, userHandle, 0);
    }
}
