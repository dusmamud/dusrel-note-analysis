package m2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31046d;

    public b(String str, int i10, int i11, String str2) {
        this.f31043a = str;
        this.f31044b = str2;
        this.f31045c = i10;
        this.f31046d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f31045c == bVar.f31045c && this.f31046d == bVar.f31046d && y8.g.a(this.f31043a, bVar.f31043a) && y8.g.a(this.f31044b, bVar.f31044b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31043a, this.f31044b, Integer.valueOf(this.f31045c), Integer.valueOf(this.f31046d)});
    }
}
