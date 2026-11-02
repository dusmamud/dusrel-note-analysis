package ua;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Date f34806b;

    public h(String eTag, Date date) {
        kotlin.jvm.internal.j.e(eTag, "eTag");
        this.f34805a = eTag;
        this.f34806b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.j.a(this.f34805a, hVar.f34805a) && kotlin.jvm.internal.j.a(this.f34806b, hVar.f34806b);
    }

    public final int hashCode() {
        int iHashCode = this.f34805a.hashCode() * 31;
        Date date = this.f34806b;
        return iHashCode + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        return "ETagData(eTag=" + this.f34805a + ", lastRefreshTime=" + this.f34806b + ')';
    }
}
