package a3;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import z8.n0;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f272a;

    public v(n nVar) {
        this.f272a = nVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        n0<Integer> n0Var = n.f191j;
        this.f272a.i();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        n0<Integer> n0Var = n.f191j;
        this.f272a.i();
    }
}
