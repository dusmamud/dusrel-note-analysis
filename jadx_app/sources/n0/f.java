package n0;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e.c f31504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Typeface f31505b;

    public /* synthetic */ f(e.c cVar, Typeface typeface) {
        this.f31504a = cVar;
        this.f31505b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31504a.b(this.f31505b);
    }
}
