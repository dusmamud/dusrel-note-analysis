package s0;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f34024b = new h(new j(new LocaleList(new Locale[0])));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f34025a;

    public h(j jVar) {
        this.f34025a = jVar;
    }

    public static h a(String str) {
        if (str == null || str.isEmpty()) {
            return f34024b;
        }
        String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f5855a, -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = Locale.forLanguageTag(strArrSplit[i10]);
        }
        return new h(new j(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f34025a.equals(((h) obj).f34025a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34025a.f34026a.hashCode();
    }

    public final String toString() {
        return this.f34025a.f34026a.toString();
    }
}
