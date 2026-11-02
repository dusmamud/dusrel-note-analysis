package k9;

import com.inotesapp.inotes.MainActivity;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements fd.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30081a;

    public /* synthetic */ n(int i10) {
        this.f30081a = i10;
    }

    @Override // fd.l
    public final Object invoke(Object obj) {
        switch (this.f30081a) {
            case 0:
                return MainActivity.deviceSeed$lambda$0(((Byte) obj).byteValue());
            default:
                return Unit.INSTANCE;
        }
    }
}
