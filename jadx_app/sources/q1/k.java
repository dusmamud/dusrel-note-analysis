package q1;

import androidx.fragment.app.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f33255a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n fragment, String str) {
        super(str);
        kotlin.jvm.internal.j.e(fragment, "fragment");
        this.f33255a = fragment;
    }
}
