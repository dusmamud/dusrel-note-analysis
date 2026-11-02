package e0;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0.c f25583a;

    public t(a0.c cVar) {
        this.f25583a = cVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return (float) this.f25583a.a(f10);
    }
}
