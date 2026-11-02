package k1;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f29624b;

    public c(Context context, Uri uri) {
        this.f29623a = context;
        this.f29624b = uri;
    }

    @Override // k1.a
    public final a a(String str, String str2) {
        Uri uriCreateDocument;
        Context context = this.f29623a;
        try {
            uriCreateDocument = DocumentsContract.createDocument(context.getContentResolver(), this.f29624b, str, str2);
        } catch (Exception unused) {
            uriCreateDocument = null;
        }
        if (uriCreateDocument != null) {
            return new c(context, uriCreateDocument);
        }
        return null;
    }

    @Override // k1.a
    public final Uri c() {
        return this.f29624b;
    }
}
