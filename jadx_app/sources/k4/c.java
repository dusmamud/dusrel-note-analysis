package k4;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29888f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29890h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f29897o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29883a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f29884b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<String> f29885c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f29886d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29887e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29889g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29891i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f29892j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29893k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29894l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29895m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29896n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f29898p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f29899q = false;

    public static int a(String str, int i10, int i11, String str2) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }
}
