package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class od extends fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f21970d;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f21971b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f21972c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f21973d = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21974a;

        public a(String str) {
            this.f21974a = str;
        }

        public final String toString() {
            return this.f21974a;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f21975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f21976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f21977c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f21978d;

        public final od a() throws GeneralSecurityException {
            Integer num = this.f21975a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f21976b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f21978d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f21977c != null) {
                return new od(num.intValue(), this.f21976b.intValue(), this.f21977c.intValue(), this.f21978d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public final void b(int i10) throws GeneralSecurityException {
            if (i10 != 12 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
            }
            this.f21976b = Integer.valueOf(i10);
        }

        public final void c(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f21975a = Integer.valueOf(i10);
        }

        public final void d() throws GeneralSecurityException {
            this.f21977c = 16;
        }
    }

    public od(int i10, int i11, int i12, a aVar) {
        this.f21967a = i10;
        this.f21968b = i11;
        this.f21969c = i12;
        this.f21970d = aVar;
    }

    public static b b() {
        b bVar = new b();
        bVar.f21975a = null;
        bVar.f21976b = null;
        bVar.f21977c = null;
        bVar.f21978d = a.f21973d;
        return bVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.mc
    public final boolean a() {
        return this.f21970d != a.f21973d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof od)) {
            return false;
        }
        od odVar = (od) obj;
        return odVar.f21967a == this.f21967a && odVar.f21968b == this.f21968b && odVar.f21969c == this.f21969c && odVar.f21970d == this.f21970d;
    }

    public final int hashCode() {
        return Objects.hash(od.class, Integer.valueOf(this.f21967a), Integer.valueOf(this.f21968b), Integer.valueOf(this.f21969c), this.f21970d);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.f21970d) + ", " + this.f21968b + "-byte IV, " + this.f21969c + "-byte tag, and " + this.f21967a + "-byte key)";
    }
}
