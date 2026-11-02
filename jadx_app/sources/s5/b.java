package s5;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34058b;

    public b(String str) {
        this.f34057a = str;
        this.f34058b = 0;
    }

    public b(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f34057a = null;
        this.f34058b = 1;
    }
}
