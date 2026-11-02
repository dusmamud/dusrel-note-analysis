package se;

import java.io.File;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f34234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f34235b;

    static {
        String str = File.separator;
        Charset charsetForName = Charset.forName("UTF-8");
        f34234a = charsetForName;
        f34235b = charsetForName;
    }
}
