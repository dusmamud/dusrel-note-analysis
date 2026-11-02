package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class ti3 extends o83 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16418b;

    public ti3() {
        this.f16418b = 1;
    }

    public static ti3 a(IOException iOException, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !ae1.g(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i11 == 2007 ? new th3("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1) : new ti3(iOException, i11, i10);
    }

    public ti3(IOException iOException, int i10, int i11) {
        super(i10 == 2000 ? i11 != 1 ? 2000 : 2001 : i10, iOException);
        this.f16418b = i11;
    }

    public ti3(String str, int i10, int i11) {
        super(str, i10 == 2000 ? i11 != 1 ? 2000 : 2001 : i10);
        this.f16418b = i11;
    }

    public ti3(String str, IOException iOException, int i10, int i11) {
        super(i10 == 2000 ? i11 != 1 ? 2000 : 2001 : i10, str, iOException);
        this.f16418b = i11;
    }
}
