package m8;

import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31382a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat("PhoneskyVerificationUtils");

    public final void a(String str) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", this.f31382a + " : " + str);
        }
    }
}
