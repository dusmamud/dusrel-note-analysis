package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f2032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f2033b;

    public interface a {
        int getNumber();
    }

    public interface b {
        boolean a();
    }

    public interface c<E> extends List<E>, RandomAccess {
        boolean I();

        void f();

        c<E> m(int capacity);
    }

    static {
        Charset.forName("US-ASCII");
        f2032a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2033b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new k.a(bArr, 0, 0, false).e(0);
        } catch (b0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static void a(Object obj, String message) {
        if (obj == null) {
            throw new NullPointerException(message);
        }
    }

    public static int b(long n10) {
        return (int) (n10 ^ (n10 >>> 32));
    }
}
