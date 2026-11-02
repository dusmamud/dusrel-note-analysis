package j9;

import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f29236a = TimeZone.getTimeZone("UTC");

    public static void a(StringBuilder sb2, int i10, int i11) {
        String string = Integer.toString(i10);
        for (int length = i11 - string.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(string);
    }
}
