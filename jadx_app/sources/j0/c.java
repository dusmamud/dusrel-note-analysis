package j0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f.a f29013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29014b;

    public c(f.a aVar, Object obj) {
        this.f29013a = aVar;
        this.f29014b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29013a.f29026a = this.f29014b;
    }
}
