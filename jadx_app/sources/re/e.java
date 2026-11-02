package re;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e AES;
    public static final e NONE;
    public static final e ZIP_STANDARD;
    public static final e ZIP_STANDARD_VARIANT_STRONG;

    static {
        e eVar = new e("NONE", 0);
        NONE = eVar;
        e eVar2 = new e("ZIP_STANDARD", 1);
        ZIP_STANDARD = eVar2;
        e eVar3 = new e("ZIP_STANDARD_VARIANT_STRONG", 2);
        ZIP_STANDARD_VARIANT_STRONG = eVar3;
        e eVar4 = new e("AES", 3);
        AES = eVar4;
        $VALUES = new e[]{eVar, eVar2, eVar3, eVar4};
    }

    public e() {
        throw null;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
