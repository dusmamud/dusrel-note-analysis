package o7;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f32363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f32364b;

    public a() {
        throw null;
    }

    public a(ArrayList arrayList, byte[] bArr) {
        this.f32363a = arrayList;
        this.f32364b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f32363a.equals(aVar.f32363a)) {
            return Arrays.equals(this.f32364b, aVar instanceof a ? aVar.f32364b : aVar.f32364b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f32363a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f32364b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f32363a + ", extras=" + Arrays.toString(this.f32364b) + "}";
    }
}
