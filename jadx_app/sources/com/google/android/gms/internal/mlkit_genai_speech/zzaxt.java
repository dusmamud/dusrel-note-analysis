package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
public enum zzaxt {
    UNARY,
    CLIENT_STREAMING,
    SERVER_STREAMING,
    BIDI_STREAMING,
    UNKNOWN;

    public final boolean zza() {
        return this == UNARY || this == SERVER_STREAMING;
    }
}
