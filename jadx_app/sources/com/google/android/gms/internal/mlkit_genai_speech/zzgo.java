package com.google.android.gms.internal.mlkit_genai_speech;

import j2.j;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgo {
    public static int zza(int i10, int i11, String str) {
        String strZzb;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strZzb = zzgt.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException(j.a(i11, "negative size: "));
            }
            strZzb = zzgt.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strZzb);
    }

    public static int zzb(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzq(i10, i11, "index"));
        }
        return i10;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzgt.zzb(str, obj2));
    }

    public static void zze(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(zzgt.zzb(str, Character.valueOf(c10)));
        }
    }

    public static void zzh(boolean z10, String str, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(zzgt.zzb(str, Integer.valueOf(i10)));
        }
    }

    public static void zzi(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(zzgt.zzb(str, Long.valueOf(j10)));
        }
    }

    public static void zzj(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(zzgt.zzb(str, obj));
        }
    }

    public static void zzk(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw new IllegalArgumentException(zzgt.zzb(str, obj, obj2));
        }
    }

    public static void zzl(int i10, int i11, int i12) {
        String strZzq;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strZzq = zzq(i10, i12, "start index");
            } else {
                strZzq = (i11 < 0 || i11 > i12) ? zzq(i11, i12, "end index") : zzgt.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strZzq);
        }
    }

    public static void zzm(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void zzn(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void zzo(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalStateException(zzgt.zzb(str, obj));
        }
    }

    public static void zzp(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw new IllegalStateException(zzgt.zzb("%s -> %s", obj, obj2));
        }
    }

    private static String zzq(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzgt.zzb("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzgt.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(j.a(i11, "negative size: "));
    }
}
