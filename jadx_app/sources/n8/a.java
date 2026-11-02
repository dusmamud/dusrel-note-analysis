package n8;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends Handler {
    public a(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
