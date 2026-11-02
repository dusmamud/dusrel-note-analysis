package x2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLong f36451c = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, List<String>> f36452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36453b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(g2.j jVar) {
        this(Collections.EMPTY_MAP, 0L);
        Uri uri = jVar.f27092a;
    }

    public t(Map map, long j10) {
        this.f36452a = map;
        this.f36453b = j10;
    }
}
