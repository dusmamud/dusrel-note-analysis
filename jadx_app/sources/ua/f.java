package ua;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final a Companion;
    public static final f NO_NETWORK;
    public static final f OTHER;
    public static final f TIMEOUT;

    public static final class a {
    }

    static {
        f fVar = new f("TIMEOUT", 0);
        TIMEOUT = fVar;
        f fVar2 = new f("NO_NETWORK", 1);
        NO_NETWORK = fVar2;
        f fVar3 = new f("OTHER", 2);
        OTHER = fVar3;
        $VALUES = new f[]{fVar, fVar2, fVar3};
        Companion = new a();
    }

    public f() {
        throw null;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
