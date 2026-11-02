package qb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class t {
    private static final /* synthetic */ t[] $VALUES;
    public static final t AMAZON_PURCHASE;
    public static final t GALAXY_PURCHASE;
    public static final t GOOGLE_PURCHASE;
    public static final t GOOGLE_RESTORED_PURCHASE;

    static {
        t tVar = new t("GOOGLE_PURCHASE", 0);
        GOOGLE_PURCHASE = tVar;
        t tVar2 = new t("GOOGLE_RESTORED_PURCHASE", 1);
        GOOGLE_RESTORED_PURCHASE = tVar2;
        t tVar3 = new t("AMAZON_PURCHASE", 2);
        AMAZON_PURCHASE = tVar3;
        t tVar4 = new t("GALAXY_PURCHASE", 3);
        GALAXY_PURCHASE = tVar4;
        $VALUES = new t[]{tVar, tVar2, tVar3, tVar4};
    }

    public t() {
        throw null;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
