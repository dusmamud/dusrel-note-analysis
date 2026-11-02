package k9;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static String a() throws Throwable {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (!kotlin.jvm.internal.j.a(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                EGLContext EGL_NO_CONTEXT = EGL14.EGL_NO_CONTEXT;
                kotlin.jvm.internal.j.d(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
                EGLSurface EGL_NO_SURFACE = EGL14.EGL_NO_SURFACE;
                kotlin.jvm.internal.j.d(EGL_NO_SURFACE, "EGL_NO_SURFACE");
                try {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr2 = new int[1];
                    if (EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                        kotlin.jvm.internal.j.d(eGLContextEglCreateContext, "eglCreateContext(...)");
                        try {
                            if (eGLContextEglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
                                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                                EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                                if (!EGL_NO_SURFACE.equals(EGL14.EGL_NO_SURFACE)) {
                                    EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, EGL_NO_SURFACE);
                                }
                                if (!eGLContextEglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
                                    EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                                }
                                EGL14.eglReleaseThread();
                                return null;
                            }
                            EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfigArr[0], new int[]{12375, 1, 12374, 1, 12344}, 0);
                            kotlin.jvm.internal.j.d(eGLSurfaceEglCreatePbufferSurface, "eglCreatePbufferSurface(...)");
                            try {
                                if (eGLSurfaceEglCreatePbufferSurface.equals(EGL14.EGL_NO_SURFACE)) {
                                    EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                                    EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                                    if (!eGLSurfaceEglCreatePbufferSurface.equals(EGL14.EGL_NO_SURFACE)) {
                                        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                                    }
                                    if (!eGLContextEglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
                                        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                                    }
                                    EGL14.eglReleaseThread();
                                    return null;
                                }
                                if (!EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                                    EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                                    EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                                    if (!eGLSurfaceEglCreatePbufferSurface.equals(EGL14.EGL_NO_SURFACE)) {
                                        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                                    }
                                    if (!eGLContextEglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
                                        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                                    }
                                    EGL14.eglReleaseThread();
                                    return null;
                                }
                                String strGlGetString = GLES20.glGetString(7937);
                                EGLSurface eGLSurface4 = EGL14.EGL_NO_SURFACE;
                                EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface4, eGLSurface4, EGL14.EGL_NO_CONTEXT);
                                if (!eGLSurfaceEglCreatePbufferSurface.equals(EGL14.EGL_NO_SURFACE)) {
                                    EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                                }
                                if (!eGLContextEglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
                                    EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                                }
                                EGL14.eglReleaseThread();
                                return strGlGetString;
                            } catch (Throwable th) {
                                th = th;
                                EGL_NO_CONTEXT = eGLContextEglCreateContext;
                                EGL_NO_SURFACE = eGLSurfaceEglCreatePbufferSurface;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            EGL_NO_CONTEXT = eGLContextEglCreateContext;
                        }
                        EGLSurface eGLSurface5 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface5, eGLSurface5, EGL14.EGL_NO_CONTEXT);
                        if (!EGL_NO_SURFACE.equals(EGL14.EGL_NO_SURFACE)) {
                            EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, EGL_NO_SURFACE);
                        }
                        if (!EGL_NO_CONTEXT.equals(EGL14.EGL_NO_CONTEXT)) {
                            EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, EGL_NO_CONTEXT);
                        }
                        EGL14.eglReleaseThread();
                        throw th;
                    }
                    EGLSurface eGLSurface6 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface6, eGLSurface6, EGL14.EGL_NO_CONTEXT);
                    if (!EGL_NO_SURFACE.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, EGL_NO_SURFACE);
                    }
                    if (!EGL_NO_CONTEXT.equals(EGL14.EGL_NO_CONTEXT)) {
                        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, EGL_NO_CONTEXT);
                    }
                    EGL14.eglReleaseThread();
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        return null;
    }
}
