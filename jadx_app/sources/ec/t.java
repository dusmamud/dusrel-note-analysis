package ec;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Uri> f26024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f26025b;

    public t(Set set, LinkedHashSet linkedHashSet) {
        this.f26024a = set;
        this.f26025b = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f26024a.equals(tVar.f26024a) && this.f26025b.equals(tVar.f26025b);
    }

    public final int hashCode() {
        return this.f26025b.hashCode() + (this.f26024a.hashCode() * 31);
    }

    public final String toString() {
        return "PaywallComponentAssets(imageUris=" + this.f26024a + ", webViewUrls=" + this.f26025b + ')';
    }
}
