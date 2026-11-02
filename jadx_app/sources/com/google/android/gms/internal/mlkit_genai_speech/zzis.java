package com.google.android.gms.internal.mlkit_genai_speech;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzis {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j10, Object obj2, Object obj3) {
        while (!d.a(unsafe, obj, j10, obj2, obj3)) {
            if (unsafe.getObject(obj, j10) != obj2) {
                return false;
            }
        }
        return true;
    }
}
