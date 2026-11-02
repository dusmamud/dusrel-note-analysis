package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    private static final /* synthetic */ c1[] $VALUES;
    public static final c1 EDITIONS;
    public static final c1 PROTO2;
    public static final c1 PROTO3;

    static {
        c1 c1Var = new c1("PROTO2", 0);
        PROTO2 = c1Var;
        c1 c1Var2 = new c1("PROTO3", 1);
        PROTO3 = c1Var2;
        c1 c1Var3 = new c1("EDITIONS", 2);
        EDITIONS = c1Var3;
        $VALUES = new c1[]{c1Var, c1Var2, c1Var3};
    }

    public c1() {
        throw null;
    }

    public static c1 valueOf(String name) {
        return (c1) Enum.valueOf(c1.class, name);
    }

    public static c1[] values() {
        return (c1[]) $VALUES.clone();
    }
}
