package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zg extends dh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f22589b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f22590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f22591b;

        public final zg a() throws GeneralSecurityException {
            Integer num = this.f22590a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f22591b != null) {
                return new zg(num.intValue(), this.f22591b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public final void b(int i10) throws GeneralSecurityException {
            if (i10 != 32 && i10 != 48 && i10 != 64) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i10)));
            }
            this.f22590a = Integer.valueOf(i10);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f22592b = new b("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f22593c = new b("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f22594d = new b("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22595a;

        public b(String str) {
            this.f22595a = str;
        }

        public final String toString() {
            return this.f22595a;
        }
    }

    public zg(int i10, b bVar) {
        this.f22588a = i10;
        this.f22589b = bVar;
    }

    public static a b() {
        a aVar = new a();
        aVar.f22590a = null;
        aVar.f22591b = b.f22594d;
        return aVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.mc
    public final boolean a() {
        return this.f22589b != b.f22594d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zg)) {
            return false;
        }
        zg zgVar = (zg) obj;
        return zgVar.f22588a == this.f22588a && zgVar.f22589b == this.f22589b;
    }

    public final int hashCode() {
        return Objects.hash(zg.class, Integer.valueOf(this.f22588a), this.f22589b);
    }

    public final String toString() {
        return "AesSiv Parameters (variant: " + String.valueOf(this.f22589b) + ", " + this.f22588a + "-byte key)";
    }
}
