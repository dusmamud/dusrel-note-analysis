package io.flutter.view;

import android.view.WindowInsetsAnimation;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m {
    public static /* synthetic */ WindowInsetsAnimation a(int i10, Interpolator interpolator, long j10) {
        return new WindowInsetsAnimation(i10, interpolator, j10);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo b(int i10) {
        return new AccessibilityNodeInfo.CollectionInfo(1, i10, false);
    }
}
