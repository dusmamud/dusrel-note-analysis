package bd;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends ad.a {

    /* JADX INFO: renamed from: bd.a$a, reason: collision with other inner class name */
    public static final class C0067a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Integer f4263a;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f4263a = num2;
        }
    }
}
