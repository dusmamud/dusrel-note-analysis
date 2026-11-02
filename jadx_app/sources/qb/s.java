package qb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class s {
    private static final /* synthetic */ s[] $VALUES;
    public static final s PENDING;
    public static final s PURCHASED;
    public static final s UNSPECIFIED_STATE;

    static {
        s sVar = new s("UNSPECIFIED_STATE", 0);
        UNSPECIFIED_STATE = sVar;
        s sVar2 = new s("PURCHASED", 1);
        PURCHASED = sVar2;
        s sVar3 = new s("PENDING", 2);
        PENDING = sVar3;
        $VALUES = new s[]{sVar, sVar2, sVar3};
    }

    public s() {
        throw null;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
