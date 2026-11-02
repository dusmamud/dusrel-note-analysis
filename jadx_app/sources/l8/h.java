package l8;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(j2.g.a("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
