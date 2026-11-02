package r9;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static final boolean a(int i10) {
        if (i10 != 7) {
            return Build.VERSION.SDK_INT >= 31 && i10 == 26;
        }
        return true;
    }
}
