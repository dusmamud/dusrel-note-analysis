package com.google.android.gms.internal.mlkit_genai_speech;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes2.dex */
public final class zzin extends zzio {
    public static int zza(long j10) {
        if (j10 > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }
}
