package n7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k7.b f31702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f31703b;

    public g(k7.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f31702a = bVar;
        this.f31703b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f31702a.equals(gVar.f31702a)) {
            return Arrays.equals(this.f31703b, gVar.f31703b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f31702a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f31703b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f31702a + ", bytes=[...]}";
    }
}
