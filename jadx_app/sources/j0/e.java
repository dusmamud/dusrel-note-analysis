package j0;

import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f29017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29018b;

    public e(Object obj, Object obj2) {
        this.f29017a = obj;
        this.f29018b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = f.f29022d;
            Object obj = this.f29018b;
            Object obj2 = this.f29017a;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                f.f29023e.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
