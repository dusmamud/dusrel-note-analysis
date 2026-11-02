package com.google.android.gms.internal.mlkit_genai_speech;

import io.objectbox.model.PropertyFlags;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
final class zzbav {
    private static final int zza;
    private static final Queue zzb;

    static {
        int iMax = Math.max(PropertyFlags.ID_COMPANION, PropertyFlags.UNSIGNED);
        zza = iMax;
        zzb = new LinkedBlockingQueue(PropertyFlags.SYNC_CLOCK / iMax);
    }

    public static void zza(byte[] bArr) {
        if (bArr.length == zza) {
            zzb.offer(bArr);
        }
    }

    public static byte[] zzb() {
        return zzc(zza);
    }

    public static byte[] zzc(int i10) {
        byte[] bArr;
        return (i10 != zza || (bArr = (byte[]) zzb.poll()) == null) ? new byte[i10] : bArr;
    }
}
