package v;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static Object a(Bundle bundle, String str) {
        return bundle.getParcelable(str, Uri.class);
    }
}
