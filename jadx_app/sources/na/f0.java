package na;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 {
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 SHOULD_FALLBACK_TO_CACHED_OFFERINGS;
    public static final f0 SHOULD_NOT_FALLBACK;

    static {
        f0 f0Var = new f0("SHOULD_FALLBACK_TO_CACHED_OFFERINGS", 0);
        SHOULD_FALLBACK_TO_CACHED_OFFERINGS = f0Var;
        f0 f0Var2 = new f0("SHOULD_NOT_FALLBACK", 1);
        SHOULD_NOT_FALLBACK = f0Var2;
        $VALUES = new f0[]{f0Var, f0Var2};
    }

    public f0() {
        throw null;
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }
}
