package ca;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class k3 {
    private static final /* synthetic */ k3[] $VALUES;
    public static final k3 INAPP;
    public static final k3 SUBS;
    public static final k3 UNKNOWN;

    static {
        k3 k3Var = new k3("SUBS", 0);
        SUBS = k3Var;
        k3 k3Var2 = new k3("INAPP", 1);
        INAPP = k3Var2;
        k3 k3Var3 = new k3("UNKNOWN", 2);
        UNKNOWN = k3Var3;
        $VALUES = new k3[]{k3Var, k3Var2, k3Var3};
    }

    public k3() {
        throw null;
    }

    public static k3 valueOf(String str) {
        return (k3) Enum.valueOf(k3.class, str);
    }

    public static k3[] values() {
        return (k3[]) $VALUES.clone();
    }
}
