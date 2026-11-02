package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawd {
    private static final AtomicLong zza = new AtomicLong();
    private final String zzb;
    private final String zzc;
    private final long zzd;

    public zzawd(String str, String str2, long j10) {
        zzgo.zzc(str, "typeName");
        zzgo.zzf(!str.isEmpty(), "empty type");
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j10;
    }

    public static zzawd zzb(Class cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return zzc(simpleName, str);
    }

    public static zzawd zzc(String str, String str2) {
        return new zzawd(str, str2, zza.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.zzb + "<" + this.zzd + ">");
        String str = this.zzc;
        if (str != null) {
            sb2.append(": (");
            sb2.append(str);
            sb2.append(')');
        }
        return sb2.toString();
    }

    public final long zza() {
        return this.zzd;
    }
}
