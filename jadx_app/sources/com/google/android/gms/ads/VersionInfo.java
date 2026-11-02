package com.google.android.gms.ads;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class VersionInfo {
    protected final int zza;
    protected final int zzb;
    protected final int zzc;

    public VersionInfo(int i10, int i11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public int getMajorVersion() {
        return this.zza;
    }

    public int getMicroVersion() {
        return this.zzc;
    }

    public int getMinorVersion() {
        return this.zzb;
    }

    public String toString() {
        Locale locale = Locale.US;
        return this.zza + "." + this.zzb + "." + this.zzc;
    }
}
