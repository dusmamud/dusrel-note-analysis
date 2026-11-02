package k8;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class l extends Handler {
    private final Looper zza;

    public l() {
        this.zza = Looper.getMainLooper();
    }

    public l(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }

    public l(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zza = Looper.getMainLooper();
    }
}
