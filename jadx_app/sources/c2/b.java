package c2;

import com.google.android.gms.internal.ads.ki;
import e2.d0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f4370a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f4371e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f4375d;

        public a(int i10, int i11, int i12) {
            this.f4372a = i10;
            this.f4373b = i11;
            this.f4374c = i12;
            this.f4375d = d0.E(i12) ? d0.y(i12, i11) : -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4372a == aVar.f4372a && this.f4373b == aVar.f4373b && this.f4374c == aVar.f4374c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4372a), Integer.valueOf(this.f4373b), Integer.valueOf(this.f4374c)});
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
            sb2.append(this.f4372a);
            sb2.append(", channelCount=");
            sb2.append(this.f4373b);
            sb2.append(", encoding=");
            return ki.b(sb2, this.f4374c, ']');
        }
    }

    /* JADX INFO: renamed from: c2.b$b, reason: collision with other inner class name */
    public static final class C0072b extends Exception {
        public C0072b(a aVar) {
            super("Unhandled input format: " + aVar);
        }
    }

    boolean c();

    ByteBuffer d();

    void e(ByteBuffer byteBuffer);

    a f(a aVar) throws C0072b;

    void flush();

    void g();

    boolean isActive();

    void reset();
}
