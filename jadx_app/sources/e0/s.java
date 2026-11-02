package e0;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.constraintlayout.motion.widget.c f25581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View[] f25582b;

    public /* synthetic */ s(androidx.constraintlayout.motion.widget.c cVar, View[] viewArr) {
        this.f25581a = cVar;
        this.f25582b = viewArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.constraintlayout.motion.widget.c cVar = this.f25581a;
        int i10 = cVar.f1486p;
        View[] viewArr = this.f25582b;
        if (i10 != -1) {
            for (View view : viewArr) {
                view.setTag(cVar.f1486p, Long.valueOf(System.nanoTime()));
            }
        }
        if (cVar.f1487q != -1) {
            for (View view2 : viewArr) {
                view2.setTag(cVar.f1487q, null);
            }
        }
    }
}
