package e2;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class f implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f25634g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f25635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f25636b = new int[1];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EGLDisplay f25637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLContext f25638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLSurface f25639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SurfaceTexture f25640f;

    public f(Handler handler) {
        this.f25635a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f25635a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f25640f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
