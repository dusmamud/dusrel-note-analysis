package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class p9 extends IOException {
    public p9(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
