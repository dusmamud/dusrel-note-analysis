package h2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27545a;

    public final void f(int i10) {
        this.f27545a = i10 | this.f27545a;
    }

    public final boolean g(int i10) {
        return (this.f27545a & i10) == i10;
    }
}
