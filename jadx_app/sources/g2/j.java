package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f27091i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f27092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f27094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, String> f27095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f27096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f27097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f27099h;

    static {
        b2.s.a("media3.datasource");
    }

    public j(Uri uri, int i10, byte[] bArr, Map map, long j10, long j11, String str, int i11) {
        cd.k.a(j10 >= 0);
        cd.k.a(j10 >= 0);
        cd.k.a(j11 > 0 || j11 == -1);
        uri.getClass();
        this.f27092a = uri;
        this.f27093b = i10;
        this.f27094c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f27095d = Collections.unmodifiableMap(new HashMap(map));
        this.f27096e = j10;
        this.f27097f = j11;
        this.f27098g = str;
        this.f27099h = i11;
    }

    public final j a(long j10) {
        long j11 = this.f27097f;
        long j12 = j11 != -1 ? j11 - j10 : -1L;
        if (j10 == 0 && j11 == j12) {
            return this;
        }
        return new j(this.f27092a, this.f27093b, this.f27094c, this.f27095d, this.f27096e + j10, j12, this.f27098g, this.f27099h);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f27093b;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.f27092a);
        sb2.append(", ");
        sb2.append(this.f27096e);
        sb2.append(", ");
        sb2.append(this.f27097f);
        sb2.append(", ");
        sb2.append(this.f27098g);
        sb2.append(", ");
        return b0.f.c(this.f27099h, "]", sb2);
    }
}
