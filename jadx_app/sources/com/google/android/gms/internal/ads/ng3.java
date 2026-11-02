package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ng3 extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng3(long j10, long j11, int i10, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j10 + ", limit: " + j11 + ", len: " + i10), indexOutOfBoundsException);
        Locale locale = Locale.US;
    }

    public ng3(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
