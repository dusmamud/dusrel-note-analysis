package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class bj0 extends tj3 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f7260c;

    public bj0(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f7260c = new WeakReference(onGlobalLayoutListener);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f7260c.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
            return;
        }
        View view = (View) ((WeakReference) this.f16432a).get();
        ViewTreeObserver viewTreeObserver2 = null;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this);
        }
    }

    public final void q(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }
}
