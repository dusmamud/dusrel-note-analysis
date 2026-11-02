package h1;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f27543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<String> f27544b;

    public e(SharedPreferences prefs, Set<String> set) {
        j.e(prefs, "prefs");
        this.f27543a = prefs;
        this.f27544b = set;
    }
}
