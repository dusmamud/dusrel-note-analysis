package com.amazon.a.a.o.c.a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum d implements Serializable {
    SENSITIVE("Sensitive", true),
    INSENSITIVE("Insensitive", false),
    SYSTEM("System", !b.a());


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f5878d = -6343169151696340687L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f5880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient boolean f5881f;

    d(String str, boolean z10) {
        this.f5880e = str;
        this.f5881f = z10;
    }

    public static d a(String str) {
        for (d dVar : values()) {
            if (dVar.a().equals(str)) {
                return dVar;
            }
        }
        throw new IllegalArgumentException(b1.a.d("Invalid IOCase name: ", str));
    }

    private Object c() {
        return a(this.f5880e);
    }

    public boolean b() {
        return this.f5881f;
    }

    public boolean d(String str, String str2) {
        int length = str2.length();
        return str.regionMatches(!this.f5881f, str.length() - length, str2, 0, length);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f5880e;
    }

    public boolean b(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f5881f ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public boolean c(String str, String str2) {
        return str.regionMatches(!this.f5881f, 0, str2, 0, str2.length());
    }

    public boolean b(String str, int i10, String str2) {
        return str.regionMatches(!this.f5881f, i10, str2, 0, str2.length());
    }

    public String a() {
        return this.f5880e;
    }

    public int a(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f5881f ? str.compareTo(str2) : str.compareToIgnoreCase(str2);
    }

    public int a(String str, int i10, String str2) {
        int length = str.length() - str2.length();
        if (length < i10) {
            return -1;
        }
        while (i10 <= length) {
            if (b(str, i10, str2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
