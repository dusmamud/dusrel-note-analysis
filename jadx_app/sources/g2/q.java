package g2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class q extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27135c;

    public q() {
        super(2008);
        this.f27135c = 1;
    }

    public static q a(IOException iOException, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !y8.b.b(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i11 == 2007 ? new p(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted") : new q(iOException, i11, i10);
    }

    public q(String str, int i10) {
        super(str, i10 == 2000 ? 2001 : i10);
        this.f27135c = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(IOException iOException, int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            i10 = 2001;
        }
        super(i10, iOException);
        this.f27135c = i11;
    }

    public q(int i10, IOException iOException, String str) {
        super(i10 == 2000 ? 2001 : i10, str, iOException);
        this.f27135c = 1;
    }
}
