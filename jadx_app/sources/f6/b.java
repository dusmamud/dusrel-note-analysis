package f6;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f26653a;

    public b() {
        Handler handler;
        Handler handlerA;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handlerA = s0.g.a(mainLooper);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (IllegalAccessException e10) {
                e = e10;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
            } catch (InstantiationException e11) {
                e = e11;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
            } catch (NoSuchMethodException e12) {
                e = e12;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
            } catch (InvocationTargetException e13) {
                Throwable cause = e13.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException(cause);
                }
                throw ((Error) cause);
            }
            handlerA = handler;
        }
        this.f26653a = handlerA;
    }

    public final void a(Runnable runnable) {
        this.f26653a.removeCallbacks(runnable);
    }

    public final void b(Runnable delayInMillis, long runnable) {
        this.f26653a.postDelayed(delayInMillis, runnable);
    }
}
