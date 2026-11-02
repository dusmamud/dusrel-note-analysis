package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum ku implements lh3 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);

    public static final int zzg = 0;
    public static final int zzh = 1;
    public static final int zzi = 2;
    public static final int zzj = 3;
    public static final int zzk = 4;
    public static final int zzl = 5;
    private static final mh3<ku> zzm = new a();
    private final int zzn;

    public class a implements mh3<ku> {
    }

    ku(int i10) {
        this.zzn = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.lh3
    public final int zza() {
        return this.zzn;
    }
}
