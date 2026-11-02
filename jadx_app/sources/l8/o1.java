package l8;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f30795a = new ArrayDeque(16);

    public final void a() throws IOException {
        ArrayDeque arrayDeque = this.f30795a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + c());
    }

    public final void b(long j10) throws IOException {
        long jC = c();
        if (jC != j10) {
            if (jC != -1) {
                if (jC != -2) {
                    return;
                } else {
                    jC = -2;
                }
            }
            throw new IOException("expected non-string scope or scope " + j10 + " but found " + jC);
        }
    }

    public final long c() {
        ArrayDeque arrayDeque = this.f30795a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }
}
