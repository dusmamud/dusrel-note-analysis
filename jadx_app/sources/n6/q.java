package n6;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f31631a;

    static {
        int[] iArr = new int[e6.x.values().length];
        try {
            iArr[e6.x.METERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e6.x.UNMETERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e6.x.NOT_ROAMING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f31631a = iArr;
    }
}
