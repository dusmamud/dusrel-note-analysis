package com.revenuecat.purchases;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b CACHED_OR_FETCHED;
    public static final b CACHE_ONLY;
    public static final a Companion;
    public static final b FETCH_CURRENT;
    public static final b NOT_STALE_CACHED_OR_CURRENT;

    public static final class a {
    }

    static {
        b bVar = new b("CACHE_ONLY", 0);
        CACHE_ONLY = bVar;
        b bVar2 = new b("FETCH_CURRENT", 1);
        FETCH_CURRENT = bVar2;
        b bVar3 = new b("NOT_STALE_CACHED_OR_CURRENT", 2);
        NOT_STALE_CACHED_OR_CURRENT = bVar3;
        b bVar4 = new b("CACHED_OR_FETCHED", 3);
        CACHED_OR_FETCHED = bVar4;
        $VALUES = new b[]{bVar, bVar2, bVar3, bVar4};
        Companion = new a();
    }

    public b() {
        throw null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
