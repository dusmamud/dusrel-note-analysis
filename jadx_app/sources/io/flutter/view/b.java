package io.flutter.view;

import android.app.UiModeManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements UiModeManager.ContrastChangeListener, AccessibilityBridge.ContrastChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityBridge f28914a;

    public /* synthetic */ b(AccessibilityBridge accessibilityBridge) {
        this.f28914a = accessibilityBridge;
    }

    @Override // android.app.UiModeManager.ContrastChangeListener, io.flutter.view.AccessibilityBridge.ContrastChangedListener
    public final void onContrastChanged(float f10) {
        this.f28914a.lambda$new$0(f10);
    }
}
