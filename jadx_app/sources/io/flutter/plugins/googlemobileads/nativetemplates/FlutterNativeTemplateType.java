package io.flutter.plugins.googlemobileads.nativetemplates;

import android.util.Log;
import io.flutter.plugins.googlemobileads.R;

/* JADX INFO: loaded from: classes2.dex */
public enum FlutterNativeTemplateType {
    SMALL(R.layout.small_template_view_layout),
    MEDIUM(R.layout.medium_template_view_layout);

    private final int resourceId;

    FlutterNativeTemplateType(int i10) {
        this.resourceId = i10;
    }

    public static FlutterNativeTemplateType fromIntValue(int i10) {
        if (i10 >= 0 && i10 < values().length) {
            return values()[i10];
        }
        Log.w("NativeTemplateType", "Invalid template type index: " + i10);
        return MEDIUM;
    }

    public int resourceId() {
        return this.resourceId;
    }
}
