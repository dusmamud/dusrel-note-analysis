package s0;

import com.google.android.gms.internal.ads.ym;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ym f34020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f34021c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.f34019a) {
                    return;
                }
                this.f34019a = true;
                this.f34021c = true;
                ym ymVar = this.f34020b;
                if (ymVar != null) {
                    try {
                        ((p5.i) ymVar.f19746a).d();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f34021c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.f34021c = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
