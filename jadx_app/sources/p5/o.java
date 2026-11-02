package p5;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f32861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f32862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f32863c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f32861a = true;
        f32862b = true;
        f32863c = i10 >= 28;
    }
}
