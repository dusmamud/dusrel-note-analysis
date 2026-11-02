package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kf3 implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kf3 f11815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kf3 f11816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kf3 f11817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kf3 f11818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kf3 f11819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f11820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f11821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11822h;

    public kf3() {
        this.f11820f = null;
        this.f11819e = this;
        this.f11818d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f11820f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f11821g;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11820f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11821g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f11820f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f11821g;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f11821g;
        this.f11821g = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f11820f);
        String strValueOf2 = String.valueOf(this.f11821g);
        return com.google.android.recaptcha.internal.d.b(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, com.amazon.a.a.o.b.f.f5856b, strValueOf2);
    }

    public kf3(kf3 kf3Var, Object obj, kf3 kf3Var2, kf3 kf3Var3) {
        this.f11815a = kf3Var;
        this.f11820f = obj;
        this.f11822h = 1;
        this.f11818d = kf3Var2;
        this.f11819e = kf3Var3;
        kf3Var3.f11818d = this;
        kf3Var2.f11819e = this;
    }
}
