package com.google.android.gms.ads.internal.util.client;

import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.firebase.encoders.FieldDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {
    public static int a(int i10, int i11, String str) {
        return str.length() + i10 + i11;
    }

    public static FieldDescriptor b(int i10, FieldDescriptor.Builder builder) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i10);
        return builder.withProperty(zzayVar.zzb()).build();
    }

    public static String c(char c10, String str, String str2) {
        return str + str2 + c10;
    }
}
