package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
public enum zzbnf implements zzbfl {
    SUBCHANNEL_SHUTDOWN("subchannel shutdown"),
    CONNECTION_RESET("connection reset"),
    CONNECTION_TIMED_OUT("connection timed out"),
    CONNECTION_ABORTED("connection aborted"),
    SOCKET_ERROR("socket error"),
    UNKNOWN("unknown");

    private final String zzh;

    zzbnf(String str) {
        this.zzh = str;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbfl
    public final String zza() {
        return this.zzh;
    }
}
