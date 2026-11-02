package ua;

/* JADX INFO: loaded from: classes2.dex */
public enum a0 {
    NONE(0),
    GZIP(1),
    BROTLI(2),
    ZSTD(3);

    public static final a Companion = new a();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f34750id;

    public static final class a {

        /* JADX INFO: renamed from: ua.a0$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0259a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34751a;

            static {
                int[] iArr = new int[a0.values().length];
                try {
                    iArr[a0.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a0.GZIP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a0.BROTLI.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a0.ZSTD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f34751a = iArr;
            }
        }
    }

    a0(int i10) {
        this.f34750id = i10;
    }

    public final int a() {
        return this.f34750id;
    }
}
