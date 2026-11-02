package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
final class ao extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f22936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f22937c = null;

    public /* synthetic */ ao(String str, Long l10, Object obj, an anVar) {
        this.f22935a = str;
        this.f22936b = l10;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f22936b;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public final boolean equals(Object obj) {
        boolean z10;
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (!this.f22935a.equals(integrityTokenRequest.nonce()) || ((l10 = this.f22936b) != null ? !l10.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() != null)) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if ((obj instanceof ao) && a()) {
            return z10;
        }
        return z10;
    }

    public final int hashCode() {
        int iHashCode = this.f22935a.hashCode() ^ 1000003;
        Long l10 = this.f22936b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode());
        return a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f22935a;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f22935a + ", cloudProjectNumber=" + this.f22936b;
        if (a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
