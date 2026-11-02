package cd;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends ByteArrayOutputStream {
    public final byte[] e() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        kotlin.jvm.internal.j.d(buf, "buf");
        return buf;
    }
}
