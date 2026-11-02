package w0;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class v implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f35618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f35619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f35620c;

    public v(View view, Runnable runnable) {
        this.f35618a = view;
        this.f35619b = view.getViewTreeObserver();
        this.f35620c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        v vVar = new v(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(vVar);
        view.addOnAttachStateChangeListener(vVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f35619b.isAlive();
        View view = this.f35618a;
        if (zIsAlive) {
            this.f35619b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f35620c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f35619b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f35619b.isAlive();
        View view2 = this.f35618a;
        if (zIsAlive) {
            this.f35619b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
