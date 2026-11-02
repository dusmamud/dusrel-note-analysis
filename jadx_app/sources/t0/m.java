package t0;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f34273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f34276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f34277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f34278f;

    public m(Uri uri, int i10, int i11, boolean z10, String str, int i12) {
        uri.getClass();
        this.f34273a = uri;
        this.f34274b = i10;
        this.f34275c = i11;
        this.f34276d = z10;
        this.f34277e = str;
        this.f34278f = i12;
    }

    public m(String str, String str2) {
        this.f34273a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f34274b = 0;
        this.f34275c = 400;
        this.f34276d = false;
        this.f34277e = str2;
        this.f34278f = 0;
    }
}
