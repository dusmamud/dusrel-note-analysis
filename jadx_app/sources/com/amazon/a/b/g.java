package com.amazon.a.b;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f5934a = "license";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f5935b = "customerId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f5936c = "deviceId";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f5938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f5939f;

    public g(Map<String, String> map) throws com.amazon.a.a.n.a.a.g {
        if (map == null) {
            throw com.amazon.a.a.n.a.a.g.d();
        }
        this.f5937d = a(f5934a, map);
        this.f5938e = a(f5935b, map);
        this.f5939f = a(f5936c, map);
    }

    private String a(String str, Map<String, String> map) throws com.amazon.a.a.n.a.a.g {
        String str2 = map.get(str);
        if (a(str2)) {
            throw com.amazon.a.a.n.a.a.g.a(str);
        }
        return str2;
    }

    public String b() {
        return this.f5939f;
    }

    public String c() {
        return this.f5937d;
    }

    private boolean a(String str) {
        return str == null || str.length() == 0;
    }

    public String a() {
        return this.f5938e;
    }
}
