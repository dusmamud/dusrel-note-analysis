package com.revenuecat.purchases;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final a Companion;
    public static final e DEBUG;
    public static final e ERROR;
    public static final e INFO;
    public static final e VERBOSE;
    public static final e WARN;

    public static final class a {
    }

    static {
        e eVar = new e("VERBOSE", 0);
        VERBOSE = eVar;
        e eVar2 = new e("DEBUG", 1);
        DEBUG = eVar2;
        e eVar3 = new e("INFO", 2);
        INFO = eVar3;
        e eVar4 = new e("WARN", 3);
        WARN = eVar4;
        e eVar5 = new e("ERROR", 4);
        ERROR = eVar5;
        $VALUES = new e[]{eVar, eVar2, eVar3, eVar4, eVar5};
        Companion = new a();
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
