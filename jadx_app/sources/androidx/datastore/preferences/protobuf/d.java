package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f2036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f2037b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f2036a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f2037b = cls2 != null;
    }

    public static boolean a() {
        return (f2036a == null || f2037b) ? false : true;
    }
}
