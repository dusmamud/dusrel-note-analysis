package com.amazon.a.a.i;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f5564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a[] f5565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f5566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f5567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f5568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f5569i;

    public enum a {
        DEFAULT,
        HELP,
        DEEPLINK
    }

    public c(String str, String str2, String str3, boolean z10) {
        this(str, str2, str3, z10, false);
    }

    public String a() {
        return this.f5564d[this.f5568h];
    }

    public String[] b() {
        return this.f5564d;
    }

    public a[] c() {
        return this.f5565e;
    }

    public String d() {
        return this.f5563c;
    }

    public String e() {
        return this.f5562b;
    }

    public String f() {
        return this.f5561a;
    }

    public int g() {
        return this.f5569i;
    }

    public boolean h() {
        return this.f5566f;
    }

    public boolean i() {
        return this.f5567g;
    }

    public String toString() {
        return "PromptContent: [ title:" + this.f5561a + ", message: " + this.f5563c + ", label: " + this.f5564d[0] + ", visible: " + this.f5566f + ", shouldShowFixup: " + this.f5567g + "]";
    }

    public c(String str, String str2, String str3, boolean z10, boolean z11) {
        this(str, str2, new String[]{str3}, new a[]{a.DEFAULT}, z10, z11, 0);
    }

    public c(String str, String str2, String[] strArr, a[] aVarArr, boolean z10, boolean z11, int i10) {
        this(new String[]{str}, str2, strArr, aVarArr, z10, z11, i10);
    }

    public c(String[] strArr, String str, String[] strArr2, a[] aVarArr, boolean z10, boolean z11, int i10) {
        this(strArr, str, strArr2, aVarArr, z10, z11, i10, -1);
    }

    public c(String[] strArr, String str, String[] strArr2, a[] aVarArr, boolean z10, boolean z11, int i10, int i11) {
        String str2 = strArr[0];
        this.f5561a = str2;
        if (strArr.length > 1) {
            this.f5562b = strArr[1];
        } else {
            this.f5562b = str2;
        }
        this.f5563c = str;
        this.f5564d = strArr2;
        this.f5565e = aVarArr;
        this.f5566f = z10;
        this.f5567g = z11;
        this.f5568h = i10;
        this.f5569i = i11;
    }
}
