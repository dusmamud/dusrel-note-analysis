package j0;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f29019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f29020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f29021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f29022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f29023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f29024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Handler f29025g = new Handler(Looper.getMainLooper());

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f29019a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f29020b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f29021c = declaredField2;
        Class<?> cls2 = f29019a;
        Class cls3 = Boolean.TYPE;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, cls3, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
                declaredMethod = null;
            }
        }
        f29022d = declaredMethod;
        Class<?> cls4 = f29019a;
        if (cls4 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls3);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
                declaredMethod2 = null;
            }
        }
        f29023e = declaredMethod2;
        Class<?> cls5 = f29019a;
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 == 26 || i10 == 27) && cls5 != null) {
            try {
                Class cls6 = Integer.TYPE;
                Class cls7 = Boolean.TYPE;
                Method declaredMethod3 = cls5.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls6, cls7, Configuration.class, Configuration.class, cls7, cls7);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f29024f = method;
    }

    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f29026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f29027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f29028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f29029d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f29030e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f29031f = false;

        public a(Activity activity) {
            this.f29027b = activity;
            this.f29028c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f29027b == activity) {
                this.f29027b = null;
                this.f29030e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (!this.f29030e || this.f29031f || this.f29029d) {
                return;
            }
            Object obj = this.f29026a;
            try {
                Object obj2 = f.f29021c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f29028c) {
                    f.f29025g.postAtFrontOfQueue(new e(f.f29020b.get(activity), obj2));
                    this.f29031f = true;
                    this.f29026a = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f29027b == activity) {
                this.f29029d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
