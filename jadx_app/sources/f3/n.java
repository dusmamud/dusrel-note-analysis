package f3;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface n extends b2.i {
    boolean a(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    boolean b(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    long c();

    void d(int i10) throws IOException;

    int e(int i10) throws IOException;

    int g(byte[] bArr, int i10, int i11) throws IOException;

    long getLength();

    long getPosition();

    void j();

    void k(int i10) throws IOException;

    boolean l(int i10, boolean z10) throws IOException;

    void n(byte[] bArr, int i10, int i11) throws IOException;

    void readFully(byte[] bArr, int i10, int i11) throws IOException;
}
