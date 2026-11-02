package b2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class w extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4069b;

    public w(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f4068a = z10;
        this.f4069b = i10;
    }

    public static w a(RuntimeException runtimeException, String str) {
        return new w(str, runtimeException, true, 1);
    }

    public static w b(String str, Exception exc) {
        return new w(str, exc, true, 4);
    }

    public static w c(String str) {
        return new w(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.getMessage());
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f4068a);
        sb2.append(", dataType=");
        return b0.f.c(this.f4069b, "}", sb2);
    }
}
