package l1;

import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static m1.b a(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j10;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i10 = byteBufferDuplicate.getShort() & 65535;
        if (i10 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                j10 = -1;
                break;
            }
            int i12 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j10 = ((long) byteBufferDuplicate.getInt()) & KeyboardMap.kValueMask;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i12) {
                break;
            }
            i11++;
        }
        if (j10 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j10 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j11 = ((long) byteBufferDuplicate.getInt()) & KeyboardMap.kValueMask;
            for (int i13 = 0; i13 < j11; i13++) {
                int i14 = byteBufferDuplicate.getInt();
                long j12 = ((long) byteBufferDuplicate.getInt()) & KeyboardMap.kValueMask;
                byteBufferDuplicate.getInt();
                if (1164798569 == i14 || 1701669481 == i14) {
                    byteBufferDuplicate.position((int) (j12 + j10));
                    m1.b bVar = new m1.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f31034b = byteBufferDuplicate;
                    bVar.f31033a = iPosition;
                    int i15 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f31035c = i15;
                    bVar.f31036d = bVar.f31034b.getShort(i15);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
