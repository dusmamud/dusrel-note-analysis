package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f2565b = new StringBuilder(128);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2564a = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e();
    }

    public final void e() {
        StringBuilder sb2 = this.f2565b;
        if (sb2.length() > 0) {
            Log.d(this.f2564a, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        e();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                e();
            } else {
                this.f2565b.append(c10);
            }
        }
    }
}
