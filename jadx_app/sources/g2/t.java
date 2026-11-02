package g2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f27138a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, String> f27139b;

    public final synchronized Map<String, String> a() {
        try {
            if (this.f27139b == null) {
                this.f27139b = Collections.unmodifiableMap(new HashMap(this.f27138a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f27139b;
    }
}
