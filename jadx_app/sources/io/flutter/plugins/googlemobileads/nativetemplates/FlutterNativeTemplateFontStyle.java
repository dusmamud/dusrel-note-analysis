package io.flutter.plugins.googlemobileads.nativetemplates;

import android.graphics.Typeface;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public enum FlutterNativeTemplateFontStyle {
    NORMAL,
    BOLD,
    ITALIC,
    MONOSPACE;

    public static FlutterNativeTemplateFontStyle fromIntValue(int i10) {
        if (i10 >= 0 && i10 < values().length) {
            return values()[i10];
        }
        Log.w("NativeTemplateFontStyle", "Invalid index for NativeTemplateFontStyle: " + i10);
        return NORMAL;
    }

    public Typeface getTypeface() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return Typeface.DEFAULT;
        }
        if (iOrdinal == 1) {
            return Typeface.DEFAULT_BOLD;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE;
        }
        return Typeface.defaultFromStyle(2);
    }
}
