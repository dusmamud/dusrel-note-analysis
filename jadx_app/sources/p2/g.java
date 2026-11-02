package p2;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements t2.c<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f32739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32740c;

    public g(List list, String str, boolean z10) {
        this.f32738a = str;
        this.f32739b = Collections.unmodifiableList(list);
        this.f32740c = z10;
    }
}
