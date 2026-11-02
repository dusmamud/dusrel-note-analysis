package qb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j DISCOUNTED_RECURRING_PAYMENT;
    public static final j FREE_TRIAL;
    public static final j SINGLE_PAYMENT;

    static {
        j jVar = new j("FREE_TRIAL", 0);
        FREE_TRIAL = jVar;
        j jVar2 = new j("SINGLE_PAYMENT", 1);
        SINGLE_PAYMENT = jVar2;
        j jVar3 = new j("DISCOUNTED_RECURRING_PAYMENT", 2);
        DISCOUNTED_RECURRING_PAYMENT = jVar3;
        $VALUES = new j[]{jVar, jVar2, jVar3};
    }

    public j() {
        throw null;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
