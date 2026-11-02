package com.google.android.gms.internal.mlkit_genai_speech;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafk extends IOException {
    public zzafk() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzafk(long j10, long j11, int i10, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j10 + ", limit: " + j11 + ", len: " + i10), th);
        Locale locale = Locale.US;
    }

    public zzafk(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
