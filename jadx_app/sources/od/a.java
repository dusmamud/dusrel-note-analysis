package od;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f32545a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.j.d(charsetForName, "forName(...)");
        f32545a = charsetForName;
        kotlin.jvm.internal.j.d(Charset.forName("UTF-16"), "forName(...)");
        kotlin.jvm.internal.j.d(Charset.forName("UTF-16BE"), "forName(...)");
        kotlin.jvm.internal.j.d(Charset.forName("UTF-16LE"), "forName(...)");
        kotlin.jvm.internal.j.d(Charset.forName("US-ASCII"), "forName(...)");
        kotlin.jvm.internal.j.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
