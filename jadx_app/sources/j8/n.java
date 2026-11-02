package j8;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class n extends Handler {
    private final Looper zaa;

    public n() {
        this.zaa = Looper.getMainLooper();
    }

    public n(Looper looper) {
        super(looper);
        this.zaa = Looper.getMainLooper();
    }

    public n(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zaa = Looper.getMainLooper();
    }
}
