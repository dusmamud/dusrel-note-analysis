package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FlutterOverlaySurface {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f28483id;
    private final Surface surface;

    public FlutterOverlaySurface(int i10, Surface surface) {
        this.f28483id = i10;
        this.surface = surface;
    }

    public int getId() {
        return this.f28483id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
