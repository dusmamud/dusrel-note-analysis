package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
public final class z1 {
    public static boolean a(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr() && (hdrCapabilities = display.getHdrCapabilities()) != null) {
            for (int i10 : hdrCapabilities.getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
