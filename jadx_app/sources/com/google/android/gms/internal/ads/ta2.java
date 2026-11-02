package com.google.android.gms.internal.ads;

import android.view.View;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ta2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f16321a = new int[2];

    public final JSONObject a(View view) {
        if (view == null) {
            return za2.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = this.f16321a;
        view.getLocationOnScreen(iArr);
        return za2.a(iArr[0], iArr[1], width, height);
    }
}
