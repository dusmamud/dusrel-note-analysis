package com.google.android.gms.internal.mlkit_genai_speech;

import com.amazon.a.a.o.b.f;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgh {
    private final String zza = f.f5855a;

    private zzgh(String str) {
    }

    public static zzgh zza(char c10) {
        return new zzgh(f.f5855a);
    }

    public static final CharSequence zzc(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final Appendable zzb(Appendable appendable, Iterator it) throws IOException {
        if (it.hasNext()) {
            appendable.append(zzc(it.next()));
            while (it.hasNext()) {
                appendable.append(this.zza);
                appendable.append(zzc(it.next()));
            }
        }
        return appendable;
    }
}
