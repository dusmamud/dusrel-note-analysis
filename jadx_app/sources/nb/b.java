package nb;

/* JADX INFO: loaded from: classes2.dex */
public enum b {
    SUBSCRIPTION("SUBSCRIPTION"),
    NON_SUBSCRIPTION("NON_SUBSCRIPTION"),
    UNKNOWN("UNKNOWN");

    private final String value;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31912a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.NON_SUBSCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.SUBSCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31912a = iArr;
        }
    }

    b(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }
}
