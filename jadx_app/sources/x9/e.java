package x9;

import fd.l;
import kotlin.Unit;
import kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f36626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f36627b;

    public /* synthetic */ e(l lVar, v vVar) {
        this.f36626a = lVar;
        this.f36627b = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd.l
    public final Object invoke(Object obj) {
        Throwable th = (Exception) obj;
        Throwable th2 = (Throwable) this.f36627b.f30216a;
        if (th2 != null) {
            th = th2;
        }
        this.f36626a.invoke(th);
        return Unit.INSTANCE;
    }
}
