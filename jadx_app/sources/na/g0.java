package na;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 {
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 SHOULD_NOT_TRY_FALLBACK;
    public static final g0 SHOULD_RETRY;

    static {
        g0 g0Var = new g0("SHOULD_RETRY", 0);
        SHOULD_RETRY = g0Var;
        g0 g0Var2 = new g0("SHOULD_NOT_TRY_FALLBACK", 1);
        SHOULD_NOT_TRY_FALLBACK = g0Var2;
        $VALUES = new g0[]{g0Var, g0Var2};
    }

    public g0() {
        throw null;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }
}
