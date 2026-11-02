package dev.fluttercommunity.workmanager;

import com.inotesapp.inotes.QuickNoteTileService;
import x2.i0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25348b;

    public /* synthetic */ k(Object obj, int i10) {
        this.f25347a = i10;
        this.f25348b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25347a;
        Object obj = this.f25348b;
        switch (i10) {
            case 0:
                DartInitializationWatchdog.timeoutRunnable$lambda$0((DartInitializationWatchdog) obj);
                break;
            case 1:
                ((fd.l) obj).invoke(null);
                break;
            case 2:
                int i11 = QuickNoteTileService.f23131a;
                ((QuickNoteTileService) obj).a();
                break;
            default:
                ((i0) obj).z();
                break;
        }
    }
}
