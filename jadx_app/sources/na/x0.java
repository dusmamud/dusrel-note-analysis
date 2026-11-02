package na;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class x0 {
    private static final /* synthetic */ x0[] $VALUES;
    public static final x0 SHOULD_BE_MARKED_SYNCED;
    public static final x0 SHOULD_NOT_CONSUME;
    public static final x0 SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME;

    static {
        x0 x0Var = new x0("SHOULD_BE_MARKED_SYNCED", 0);
        SHOULD_BE_MARKED_SYNCED = x0Var;
        x0 x0Var2 = new x0("SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME", 1);
        SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME = x0Var2;
        x0 x0Var3 = new x0("SHOULD_NOT_CONSUME", 2);
        SHOULD_NOT_CONSUME = x0Var3;
        $VALUES = new x0[]{x0Var, x0Var2, x0Var3};
    }

    public x0() {
        throw null;
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) $VALUES.clone();
    }
}
