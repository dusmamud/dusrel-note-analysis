package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final class ji extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public ji(ii iiVar, hi hiVar, long j10) {
        Locale locale = Locale.US;
        Long lValueOf = Long.valueOf(j10);
        super(String.format(locale, wi.a("bk3t6gFTc30="), Long.valueOf(iiVar.a()), Long.valueOf(hiVar.a()), lValueOf));
        Optional.of(hiVar);
        Optional.of(lValueOf);
    }

    public ji(ii iiVar, Exception exc) {
        super(String.format(Locale.US, wi.a("bk0="), Long.valueOf(iiVar.a())), exc);
        Optional.empty();
        Optional.empty();
    }
}
