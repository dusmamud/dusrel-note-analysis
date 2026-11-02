package r1;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import j2.g;
import j2.i;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f33644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float[] f33645h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33651f;

    static {
        float[] fArr = new float[16];
        f33644g = fArr;
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = new float[16];
        f33645h = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, 0.0f, 1.0f, 0.0f);
        Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
    }

    public static void a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbA = i.a(str, ": glError 0x");
        sbA.append(Integer.toHexString(iGlGetError));
        String string = sbA.toString();
        Log.e("Texture2dProgram", string);
        throw new RuntimeException(string);
    }

    public static void b(int i10, String str) {
        if (i10 < 0) {
            throw new RuntimeException(g.a("Unable to locate '", str, "' in program"));
        }
    }

    public static int c(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        a("glCreateShader type=" + i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Log.e("Texture2dProgram", "Could not compile shader " + i10 + ":");
        StringBuilder sb2 = new StringBuilder(" ");
        sb2.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        Log.e("Texture2dProgram", sb2.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }
}
