package com.amazon.a.a.j;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5616a = "RESPONSE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f5617b = "RESET_OFFSET";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f5618d = "RECEIPT_STRING";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f5619e = "KIWI_EXECUTION_RESULT_CODE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f5620f = "RECEIPT_DELIVERED";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f5621g = "PURCHASE_REQUEST_ID";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f5622h = "userId";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f5623i = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f5624c = new HashMap();

    public Object a(String str) {
        return this.f5624c.get(str);
    }

    public boolean b(String str) {
        return this.f5624c.containsKey(str);
    }

    public Object c(String str) {
        return this.f5624c.remove(str);
    }

    public void a(String str, Object obj) {
        this.f5624c.put(str, obj);
    }

    public Object b() {
        return this.f5624c.get(f5616a);
    }

    public void c() {
        this.f5624c.remove(f5616a);
    }

    public boolean a(Class cls) {
        return b(f5616a) && a(f5616a).getClass().equals(cls);
    }

    public void a() {
        this.f5624c.clear();
    }

    public void a(Object obj) {
        if (!f5623i && obj == null) {
            throw new AssertionError();
        }
        this.f5624c.put(f5616a, obj);
    }
}
