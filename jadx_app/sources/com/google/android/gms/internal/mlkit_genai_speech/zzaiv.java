package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
class zzaiv {
    public static final int zza(String str, byte[] bArr, int i10, int i11) {
        byte[] bytes = str.getBytes(zzagp.zza);
        int length = bytes.length;
        if (length - i10 > i11) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i10, length);
        return i10 + length;
    }
}
