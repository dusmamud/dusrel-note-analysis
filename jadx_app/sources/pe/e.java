package pe;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f32988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Deflater f32989c;

    @Override // pe.c
    public final void e() throws IOException {
        Deflater deflater = this.f32989c;
        if (!deflater.finished()) {
            deflater.finish();
            while (!deflater.finished()) {
                byte[] bArr = this.f32988b;
                int iDeflate = deflater.deflate(bArr, 0, bArr.length);
                if (iDeflate > 0) {
                    super.write(bArr, 0, iDeflate);
                }
            }
        }
        deflater.end();
        super.e();
    }

    @Override // pe.c, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // pe.c, java.io.OutputStream
    public final void write(int i10) throws IOException {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override // pe.c, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        Deflater deflater = this.f32989c;
        deflater.setInput(bArr, i10, i11);
        while (!deflater.needsInput()) {
            byte[] bArr2 = this.f32988b;
            int iDeflate = deflater.deflate(bArr2, 0, bArr2.length);
            if (iDeflate > 0) {
                super.write(bArr2, 0, iDeflate);
            }
        }
    }
}
