package e0;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0.c f25536a;

    public m(a0.c cVar) {
        this.f25536a = cVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return (float) this.f25536a.a(f10);
    }
}
