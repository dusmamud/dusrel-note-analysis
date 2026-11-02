package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2453b;

    public /* synthetic */ l(d3.c.g gVar, d3.y yVar) {
        this.f2452a = 2;
        this.f2453b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2452a) {
            case 0:
                ((n) this.f2453b).lambda$performCreateView$0();
                break;
            case 1:
                ((fd.a) this.f2453b).invoke();
                break;
            default:
                ((d3.y) this.f2453b).c();
                break;
        }
    }

    public /* synthetic */ l(Object obj, int i10) {
        this.f2452a = i10;
        this.f2453b = obj;
    }
}
