package s0;

import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    public static class a {
        public static <T> T a(Bundle bundle, String str, Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }
    }

    public static <T> T a(Bundle bundle, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.a(bundle, str, cls);
        }
        T t6 = (T) bundle.getParcelable(str);
        if (cls.isInstance(t6)) {
            return t6;
        }
        return null;
    }
}
