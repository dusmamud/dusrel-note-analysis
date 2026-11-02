package androidx.credentials;

import android.app.UiModeManager;
import android.os.Bundle;
import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s {
    public static /* bridge */ /* synthetic */ UiModeManager.ContrastChangeListener a(Object obj) {
        return (UiModeManager.ContrastChangeListener) obj;
    }

    public static /* synthetic */ android.credentials.ClearCredentialStateRequest b(Bundle bundle) {
        return new android.credentials.ClearCredentialStateRequest(bundle);
    }

    public static /* synthetic */ BackEvent d(int i10, float f10, float f11, float f12) {
        return new BackEvent(f10, f11, f12, i10);
    }
}
