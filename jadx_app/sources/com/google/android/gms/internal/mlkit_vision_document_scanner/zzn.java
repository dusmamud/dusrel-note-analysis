package com.google.android.gms.internal.mlkit_vision_document_scanner;

import com.google.android.gms.internal.mlkit_genai_speech.a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzn {
    public static void zza(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzb(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException("A SourcePolicy can only set internal() or external() once.");
        }
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static int zzd(int i10, int i11, String str) {
        String strZza;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strZza = zzo.zza("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException(a.b(i11, "negative size: ", new StringBuilder(String.valueOf(i11).length() + 15)));
            }
            strZza = zzo.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zze(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzg(i10, i11, "index"));
        }
        return i10;
    }

    public static void zzf(int i10, int i11, int i12) {
        String strZzg;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strZzg = zzg(i10, i12, "start index");
            } else {
                strZzg = (i11 < 0 || i11 > i12) ? zzg(i11, i12, "end index") : zzo.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strZzg);
        }
    }

    private static String zzg(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzo.zza("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzo.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(a.b(i11, "negative size: ", new StringBuilder(String.valueOf(i11).length() + 15)));
    }
}
