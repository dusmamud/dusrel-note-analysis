package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class xe extends fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f22477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22478b;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f22479b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f22480c = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22481a;

        public a(String str) {
            this.f22481a = str;
        }

        public final String toString() {
            return this.f22481a;
        }
    }

    public xe(a aVar, int i10) {
        this.f22477a = aVar;
        this.f22478b = i10;
    }

    public static xe b(a aVar, int i10) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new xe(aVar, i10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.mc
    public final boolean a() {
        return this.f22477a != a.f22480c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xe)) {
            return false;
        }
        xe xeVar = (xe) obj;
        return xeVar.f22477a == this.f22477a && xeVar.f22478b == this.f22478b;
    }

    public final int hashCode() {
        return Objects.hash(xe.class, this.f22477a, Integer.valueOf(this.f22478b));
    }

    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + String.valueOf(this.f22477a) + "salt_size_bytes: " + this.f22478b + ")";
    }
}
