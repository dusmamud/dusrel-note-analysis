package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ud extends fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f22307d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f22308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f22309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f22310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b f22311d;

        public final ud a() throws GeneralSecurityException {
            Integer num = this.f22308a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f22311d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f22309b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f22310c != null) {
                return new ud(num.intValue(), this.f22309b.intValue(), this.f22310c.intValue(), this.f22311d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public final void b() throws GeneralSecurityException {
            this.f22309b = 12;
        }

        public final void c(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f22308a = Integer.valueOf(i10);
        }

        public final void d() throws GeneralSecurityException {
            this.f22310c = 16;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f22312b = new b("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f22313c = new b("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f22314d = new b("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22315a;

        public b(String str) {
            this.f22315a = str;
        }

        public final String toString() {
            return this.f22315a;
        }
    }

    public ud(int i10, int i11, int i12, b bVar) {
        this.f22304a = i10;
        this.f22305b = i11;
        this.f22306c = i12;
        this.f22307d = bVar;
    }

    public static a b() {
        a aVar = new a();
        aVar.f22308a = null;
        aVar.f22309b = null;
        aVar.f22310c = null;
        aVar.f22311d = b.f22314d;
        return aVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.mc
    public final boolean a() {
        return this.f22307d != b.f22314d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ud)) {
            return false;
        }
        ud udVar = (ud) obj;
        return udVar.f22304a == this.f22304a && udVar.f22305b == this.f22305b && udVar.f22306c == this.f22306c && udVar.f22307d == this.f22307d;
    }

    public final int hashCode() {
        return Objects.hash(ud.class, Integer.valueOf(this.f22304a), Integer.valueOf(this.f22305b), Integer.valueOf(this.f22306c), this.f22307d);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.f22307d) + ", " + this.f22305b + "-byte IV, " + this.f22306c + "-byte tag, and " + this.f22304a + "-byte key)";
    }
}
