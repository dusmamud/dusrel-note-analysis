package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class yd extends fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f22526b;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f22527b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f22528c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f22529d = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22530a;

        public a(String str) {
            this.f22530a = str;
        }

        public final String toString() {
            return this.f22530a;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f22531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f22532b;

        public final yd a() throws GeneralSecurityException {
            Integer num = this.f22531a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f22532b != null) {
                return new yd(num.intValue(), this.f22532b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public final void b(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f22531a = Integer.valueOf(i10);
        }
    }

    public yd(int i10, a aVar) {
        this.f22525a = i10;
        this.f22526b = aVar;
    }

    public static b b() {
        b bVar = new b();
        bVar.f22531a = null;
        bVar.f22532b = a.f22529d;
        return bVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.mc
    public final boolean a() {
        return this.f22526b != a.f22529d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yd)) {
            return false;
        }
        yd ydVar = (yd) obj;
        return ydVar.f22525a == this.f22525a && ydVar.f22526b == this.f22526b;
    }

    public final int hashCode() {
        return Objects.hash(yd.class, Integer.valueOf(this.f22525a), this.f22526b);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.f22526b) + ", " + this.f22525a + "-byte key)";
    }
}
