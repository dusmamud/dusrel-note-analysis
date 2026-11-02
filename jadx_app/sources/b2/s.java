package b2;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f4012a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f4013b = "media3.common";

    public static synchronized void a(String str) {
        if (f4012a.add(str)) {
            f4013b += ", " + str;
        }
    }
}
