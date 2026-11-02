package l1;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
