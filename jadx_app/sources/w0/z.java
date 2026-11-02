package w0;

import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<VelocityTracker, a0> f35626a = Collections.synchronizedMap(new WeakHashMap());

    public static class a {
        public static float a(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.getAxisVelocity(i10);
        }
    }
}
