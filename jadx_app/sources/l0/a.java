package l0;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import j0.q;
import java.util.concurrent.Executor;
import s0.f;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class a {

    /* JADX INFO: renamed from: l0.a$a, reason: collision with other inner class name */
    public static class C0197a {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, 0);
        }

        public static void b(Context context, Intent intent) {
            context.startForegroundService(intent);
        }
    }

    public static class b {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static class c {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, 2);
        }
    }

    public static int a(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new q(context).f29068a.areNotificationsEnabled() ? 0 : -1;
    }

    public static Executor b(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? b.a(context) : new f(new Handler(context.getMainLooper()));
    }

    public static Intent c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return c.a(context, broadcastReceiver, intentFilter, str, handler);
        }
        return i10 >= 26 ? C0197a.a(context, broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }
}
