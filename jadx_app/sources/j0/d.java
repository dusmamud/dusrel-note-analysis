package j0;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Application f29015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.a f29016b;

    public d(Application application, f.a aVar) {
        this.f29015a = application;
        this.f29016b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29015a.unregisterActivityLifecycleCallbacks(this.f29016b);
    }
}
