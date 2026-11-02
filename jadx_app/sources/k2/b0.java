package k2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f29635a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f29635a.post(runnable);
    }
}
