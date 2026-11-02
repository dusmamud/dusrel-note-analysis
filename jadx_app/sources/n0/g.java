package n0;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31507b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f31506a = i10;
        this.f31507b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31506a) {
            case 0:
                ((e.c) this.f31507b).getClass();
                break;
            default:
                ((Toolbar) this.f31507b).m();
                break;
        }
    }
}
