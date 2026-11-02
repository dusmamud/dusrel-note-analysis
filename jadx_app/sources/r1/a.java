package r1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final FloatBuffer f33581f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f33582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatBuffer f33583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f33586e;

    static {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        f33581f = floatBufferAsFloatBuffer;
    }

    public a(f fVar, int i10, int i11) {
        float[] fArr = new float[8];
        this.f33582a = fArr;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        this.f33583b = floatBufferAsFloatBuffer;
        this.f33586e = fVar;
        this.f33584c = i10;
        this.f33585d = i11;
    }
}
