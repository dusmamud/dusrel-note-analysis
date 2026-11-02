package nc;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallerInitializer;
import dev.liquidglass.liquid_glass.PipelineCacheKeeper;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31974b;

    public /* synthetic */ r(Object obj, int i10) {
        this.f31973a = i10;
        this.f31974b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f31973a;
        Object obj = this.f31974b;
        switch (i10) {
            case 0:
                PipelineCacheKeeper.a aVar = PipelineCacheKeeper.f25419a;
                ((File) obj).delete();
                break;
            default:
                ProfileInstallerInitializer.lambda$writeInBackground$2((Context) obj);
                break;
        }
    }
}
