package m1;

import androidx.lifecycle.r0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f31034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31036d;

    public c() {
        if (r0.f2678a == null) {
            r0.f2678a = new r0();
        }
    }

    public final int a(int i10) {
        if (i10 < this.f31036d) {
            return this.f31034b.getShort(this.f31035c + i10);
        }
        return 0;
    }
}
