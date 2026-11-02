package v0;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f35151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f35152b;

    public c(F f10, S s6) {
        this.f35151a = f10;
        this.f35152b = s6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Objects.equals(cVar.f35151a, this.f35151a) && Objects.equals(cVar.f35152b, this.f35152b);
    }

    public final int hashCode() {
        F f10 = this.f35151a;
        int iHashCode = f10 == null ? 0 : f10.hashCode();
        S s6 = this.f35152b;
        return (s6 != null ? s6.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f35151a + " " + this.f35152b + "}";
    }
}
