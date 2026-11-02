package i2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27961c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f27962a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f27963b = -3.4028235E38f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f27964c = -9223372036854775807L;
    }

    public h1(a aVar) {
        this.f27959a = aVar.f27962a;
        this.f27960b = aVar.f27963b;
        this.f27961c = aVar.f27964c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f27959a == h1Var.f27959a && this.f27960b == h1Var.f27960b && this.f27961c == h1Var.f27961c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f27959a), Float.valueOf(this.f27960b), Long.valueOf(this.f27961c)});
    }
}
