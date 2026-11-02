package ca;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class q3 {
    private static final /* synthetic */ q3[] $VALUES;
    public static final q3 MY_APP;
    public static final q3 REVENUECAT;

    static {
        q3 q3Var = new q3("REVENUECAT", 0);
        REVENUECAT = q3Var;
        q3 q3Var2 = new q3("MY_APP", 1);
        MY_APP = q3Var2;
        $VALUES = new q3[]{q3Var, q3Var2};
    }

    public q3() {
        throw null;
    }

    public static q3 valueOf(String str) {
        return (q3) Enum.valueOf(q3.class, str);
    }

    public static q3[] values() {
        return (q3[]) $VALUES.clone();
    }
}
