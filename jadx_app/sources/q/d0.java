package q;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f33048h;

    public final void a(int i10, int i11) {
        this.f33043c = i10;
        this.f33044d = i11;
        this.f33048h = true;
        if (this.f33047g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f33041a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f33042b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f33041a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f33042b = i11;
        }
    }
}
