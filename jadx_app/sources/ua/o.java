package ua;

import java.net.URL;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f34877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f34878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f34879c;

    public o(URL url, LinkedHashMap linkedHashMap, JSONObject jSONObject) {
        this.f34877a = url;
        this.f34878b = linkedHashMap;
        this.f34879c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f34877a.equals(oVar.f34877a) && this.f34878b.equals(oVar.f34878b) && kotlin.jvm.internal.j.a(this.f34879c, oVar.f34879c);
    }

    public final int hashCode() {
        int iHashCode = (this.f34878b.hashCode() + (this.f34877a.hashCode() * 31)) * 31;
        JSONObject jSONObject = this.f34879c;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        return "HTTPRequest(fullURL=" + this.f34877a + ", headers=" + this.f34878b + ", body=" + this.f34879c + ')';
    }
}
