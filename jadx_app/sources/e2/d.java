package e2;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25617a;

    public final synchronized void a() {
        this.f25617a = false;
    }

    public final synchronized boolean b() {
        if (this.f25617a) {
            return false;
        }
        this.f25617a = true;
        notifyAll();
        return true;
    }
}
