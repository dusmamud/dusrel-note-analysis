package w0;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<View> f35542a;

    public l0(View view) {
        this.f35542a = new WeakReference<>(view);
    }

    public final void a(float f10) {
        View view = this.f35542a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = this.f35542a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = this.f35542a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(m0 m0Var) {
        View view = this.f35542a.get();
        if (view != null) {
            if (m0Var != null) {
                view.animate().setListener(new k0(m0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = this.f35542a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
