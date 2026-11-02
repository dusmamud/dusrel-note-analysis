package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class cj0 extends tj3 implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f7907c;

    public cj0(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f7907c = new WeakReference(onScrollChangedListener);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.f7907c.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
            return;
        }
        View view = (View) ((WeakReference) this.f16432a).get();
        ViewTreeObserver viewTreeObserver2 = null;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserver2.removeOnScrollChangedListener(this);
        }
    }

    public final void q(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }
}
