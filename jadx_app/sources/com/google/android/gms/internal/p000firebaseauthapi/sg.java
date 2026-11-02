package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final enum sg extends rg.a {
    public sg() {
        super("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
    }

    @Override // com.google.android.gms.internal.firebase-auth-api.rg.a
    public final boolean a() {
        Boolean bool;
        if (!rg.a()) {
            return true;
        }
        try {
            bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            rg.f22149a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }
}
