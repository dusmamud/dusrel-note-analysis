package a2;

import android.app.ForegroundServiceStartNotAllowedException;
import android.media.metrics.NetworkEvent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException a(IllegalStateException illegalStateException) {
        return (ForegroundServiceStartNotAllowedException) illegalStateException;
    }

    public static /* synthetic */ NetworkEvent.Builder b() {
        return new NetworkEvent.Builder();
    }
}
