package t0;

import android.util.Base64;
import com.google.android.gms.internal.ads.ki;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f34251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f34252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f34253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f34254g;

    public f() {
        throw null;
    }

    public f(String str, String str2, String str3, List<List<byte[]>> list, String str4, String str5) {
        str.getClass();
        this.f34248a = str;
        str2.getClass();
        this.f34249b = str2;
        this.f34250c = str3;
        list.getClass();
        this.f34251d = list;
        this.f34252e = str4;
        this.f34253f = str5;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("-");
        sb2.append(str2);
        sb2.append("-");
        sb2.append(str3);
        this.f34254g = ki.c(sb2, "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f34248a + ", mProviderPackage: " + this.f34249b + ", mQuery: " + this.f34250c + ", mSystemFont: " + this.f34252e + ", mVariationSettings: " + this.f34253f + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List<List<byte[]>> list = this.f34251d;
            if (i10 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List<byte[]> list2 = list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list2.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i10++;
        }
    }
}
