package s0;

import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f34026a;

    public j(LocaleList localeList) {
        this.f34026a = localeList;
    }

    @Override // s0.i
    public final Object a() {
        return this.f34026a;
    }

    public final boolean equals(Object obj) {
        return this.f34026a.equals(((i) obj).a());
    }

    public final int hashCode() {
        return this.f34026a.hashCode();
    }

    public final String toString() {
        return this.f34026a.toString();
    }
}
