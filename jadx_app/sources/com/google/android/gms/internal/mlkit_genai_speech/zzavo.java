package com.google.android.gms.internal.mlkit_genai_speech;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzavo {
    private SocketAddress zza;
    private InetSocketAddress zzb;
    private final Map zzc = Collections.EMPTY_MAP;
    private String zzd;
    private String zze;

    private zzavo() {
    }

    public final zzavo zza(String str) {
        this.zze = str;
        return this;
    }

    public final zzavo zzb(SocketAddress socketAddress) {
        zzgo.zzc(socketAddress, "proxyAddress");
        this.zza = socketAddress;
        return this;
    }

    public final zzavo zzc(InetSocketAddress inetSocketAddress) {
        zzgo.zzc(inetSocketAddress, "targetAddress");
        this.zzb = inetSocketAddress;
        return this;
    }

    public final zzavo zzd(String str) {
        this.zzd = str;
        return this;
    }

    public final zzavq zze() {
        return new zzavq(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public /* synthetic */ zzavo(zzavp zzavpVar) {
    }
}
