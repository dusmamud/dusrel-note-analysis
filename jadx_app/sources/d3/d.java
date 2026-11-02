package d3;

import b2.j0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements y8.o {
    @Override // y8.o
    public final Object get() {
        try {
            Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
            objInvoke.getClass();
            return (j0.a) objInvoke;
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }
}
