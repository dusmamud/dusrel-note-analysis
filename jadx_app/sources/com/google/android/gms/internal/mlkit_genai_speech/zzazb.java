package com.google.android.gms.internal.mlkit_genai_speech;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzazb implements zzaxo {
    private static final byte[] zza = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    private zzazb() {
        throw null;
    }

    private static boolean zzb(byte b10) {
        return b10 < 32 || b10 >= 126 || b10 == 37;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzaxo
    public final /* bridge */ /* synthetic */ byte[] zza(Object obj) {
        byte[] bytes = ((String) obj).getBytes(StandardCharsets.UTF_8);
        int i10 = 0;
        while (true) {
            int length = bytes.length;
            if (i10 >= length) {
                return bytes;
            }
            if (zzb(bytes[i10])) {
                byte[] bArr = new byte[((length - i10) * 3) + i10];
                if (i10 != 0) {
                    System.arraycopy(bytes, 0, bArr, 0, i10);
                }
                int i11 = i10;
                while (i10 < bytes.length) {
                    int i12 = i11 + 1;
                    byte b10 = bytes[i10];
                    if (zzb(b10)) {
                        bArr[i11] = 37;
                        byte[] bArr2 = zza;
                        bArr[i12] = bArr2[(b10 >> 4) & 15];
                        bArr[i11 + 2] = bArr2[b10 & 15];
                        i11 += 3;
                    } else {
                        bArr[i11] = b10;
                        i11 = i12;
                    }
                    i10++;
                }
                return Arrays.copyOf(bArr, i11);
            }
            i10++;
        }
    }

    public /* synthetic */ zzazb(zzazc zzazcVar) {
    }
}
