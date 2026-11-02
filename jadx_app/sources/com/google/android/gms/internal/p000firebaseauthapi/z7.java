package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class z7 extends IOException {
    public z7(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public z7(int i10, int i11, int i12, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sb2 = new StringBuilder("Pos: ");
        sb2.append(i10);
        sb2.append(", limit: ");
        sb2.append(i11);
        sb2.append(", len: ");
        sb2.append(i12);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sb2.toString()), indexOutOfBoundsException);
    }
}
