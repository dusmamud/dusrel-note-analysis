package ec;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public interface b extends Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    default void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    default void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    default void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    default void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.j.e(activity, "activity");
        kotlin.jvm.internal.j.e(outState, "outState");
    }
}
