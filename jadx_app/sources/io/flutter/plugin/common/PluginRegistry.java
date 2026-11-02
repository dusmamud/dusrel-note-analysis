package io.flutter.plugin.common;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public interface PluginRegistry {

    public interface ActivityResultListener {
        boolean onActivityResult(int i10, int i11, Intent intent);
    }

    public interface NewIntentListener {
        boolean onNewIntent(Intent intent);
    }

    public interface RequestPermissionsResultListener {
        boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);
    }

    public interface UserLeaveHintListener {
        void onUserLeaveHint();
    }

    public interface WindowFocusChangedListener {
        void onWindowFocusChanged(boolean z10);
    }
}
