package m2;

import e2.y;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31092d;

    public i(long j10, long j11, String str) {
        this.f31091c = str == null ? "" : str;
        this.f31089a = j10;
        this.f31090b = j11;
    }

    public final i a(i iVar, String str) {
        i iVar2;
        long j10;
        String strC = y.c(str, this.f31091c);
        if (iVar != null) {
            long j11 = iVar.f31090b;
            if (strC.equals(y.c(str, iVar.f31091c))) {
                long j12 = this.f31090b;
                if (j12 != -1) {
                    j10 = j11;
                    long j13 = this.f31089a;
                    iVar2 = null;
                    if (j13 + j12 == iVar.f31089a) {
                        return new i(j13, j10 != -1 ? j12 + j10 : -1L, strC);
                    }
                } else {
                    iVar2 = null;
                    j10 = j11;
                }
                if (j10 == -1) {
                    return iVar2;
                }
                long j14 = iVar.f31089a;
                if (j14 + j10 == this.f31089a) {
                    return new i(j14, j12 != -1 ? j10 + j12 : -1L, strC);
                }
                return iVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f31089a == iVar.f31089a && this.f31090b == iVar.f31090b && this.f31091c.equals(iVar.f31091c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f31092d == 0) {
            this.f31092d = this.f31091c.hashCode() + ((((527 + ((int) this.f31089a)) * 31) + ((int) this.f31090b)) * 31);
        }
        return this.f31092d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f31091c);
        sb2.append(", start=");
        sb2.append(this.f31089a);
        sb2.append(", length=");
        return android.support.v4.media.session.e.a(sb2, this.f31090b, ")");
    }
}
