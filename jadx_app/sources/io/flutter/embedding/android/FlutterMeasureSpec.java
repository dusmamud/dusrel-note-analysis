package io.flutter.embedding.android;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
class FlutterMeasureSpec {

    public interface MeasureCallback {
        void onMeasure(int i10, int i11);
    }

    public static void onMeasure(int i10, int i11, MeasureCallback measureCallback) {
        int mode = View.MeasureSpec.getMode(i10);
        measureCallback.onMeasure(Math.max(View.MeasureSpec.getSize(i10), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i11), View.MeasureSpec.getMode(i11) == 0 ? 1 : 0));
    }
}
