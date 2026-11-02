package q;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f33098a = null;

    public static void a(Context context) {
        if ((context instanceof h0) || (context.getResources() instanceof j0)) {
            return;
        }
        context.getResources();
        int i10 = q0.f33175a;
    }
}
