package com.google.android.gms.internal.mlkit_genai_speech;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzagr extends IOException {
    private boolean zza;

    public zzagr(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public final void zza() {
        this.zza = true;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public zzagr(String str) {
        super(str);
    }

    public zzagr(String str, IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}
