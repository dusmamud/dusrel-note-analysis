package androidx.datastore.preferences.protobuf;

import androidx.biometric.BiometricManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f2146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f2147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f2148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f2149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f2150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f2151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f2152g;

    public class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return a();
        }
    }

    public static final class b extends e {
        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final boolean c(long target, Object offset) {
            return r1.f2152g ? r1.b(target, offset) : r1.c(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final double d(long target, Object offset) {
            return Double.longBitsToDouble(g(target, offset));
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final float e(long target, Object offset) {
            return Float.intBitsToFloat(f(target, offset));
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final void j(Object obj, long j10, boolean z10) {
            if (r1.f2152g) {
                r1.k(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                r1.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final void k(Object target, long offset, byte value) {
            if (r1.f2152g) {
                r1.k(target, offset, value);
            } else {
                r1.l(target, offset, value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final void l(Object target, long offset, double value) {
            o(target, offset, Double.doubleToLongBits(value));
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final void m(Object target, long offset, float value) {
            n(target, Float.floatToIntBits(value), offset);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final boolean r() {
            return false;
        }
    }

    public static final class c extends e {
        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final boolean c(long target, Object offset) {
            return r1.f2152g ? r1.b(target, offset) : r1.c(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final double d(long target, Object offset) {
            return Double.longBitsToDouble(g(target, offset));
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final float e(long target, Object offset) {
            return Float.intBitsToFloat(f(target, offset));
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final void j(Object obj, long j10, boolean z10) {
            if (r1.f2152g) {
                r1.k(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                r1.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final void k(Object target, long offset, byte value) {
            if (r1.f2152g) {
                r1.k(target, offset, value);
            } else {
                r1.l(target, offset, value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final void l(Object target, long offset, double value) {
            o(target, offset, Double.doubleToLongBits(value));
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final void m(Object target, long offset, float value) {
            n(target, Float.floatToIntBits(value), offset);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final boolean r() {
            return false;
        }
    }

    public static final class d extends e {
        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final boolean c(long target, Object offset) {
            return this.f2153a.getBoolean(offset, target);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final double d(long target, Object offset) {
            return this.f2153a.getDouble(offset, target);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final float e(long target, Object offset) {
            return this.f2153a.getFloat(offset, target);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final void j(Object target, long offset, boolean value) {
            this.f2153a.putBoolean(target, offset, value);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final void k(Object target, long offset, byte value) {
            this.f2153a.putByte(target, offset, value);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final void l(Object target, long offset, double value) {
            this.f2153a.putDouble(target, offset, value);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final void m(Object target, long offset, float value) {
            this.f2153a.putFloat(target, offset, value);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f2153a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                r1.a(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public final boolean r() {
            Unsafe unsafe = this.f2153a;
            if (unsafe != null) {
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (r1.g() != null) {
                        try {
                            Class<?> cls3 = this.f2153a.getClass();
                            cls3.getMethod("getByte", cls2);
                            cls3.getMethod("putByte", cls2, Byte.TYPE);
                            cls3.getMethod("getInt", cls2);
                            cls3.getMethod("putInt", cls2, Integer.TYPE);
                            cls3.getMethod("getLong", cls2);
                            cls3.getMethod("putLong", cls2, cls2);
                            cls3.getMethod("copyMemory", cls2, cls2, cls2);
                            cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                            return true;
                        } catch (Throwable th) {
                            r1.a(th);
                            return false;
                        }
                    }
                } catch (Throwable th2) {
                    r1.a(th2);
                }
            }
            return false;
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Unsafe f2153a;

        public e(Unsafe unsafe) {
            this.f2153a = unsafe;
        }

        public final int a(Class<?> clazz) {
            return this.f2153a.arrayBaseOffset(clazz);
        }

        public final int b(Class<?> clazz) {
            return this.f2153a.arrayIndexScale(clazz);
        }

        public abstract boolean c(long target, Object offset);

        public abstract double d(long target, Object offset);

        public abstract float e(long target, Object offset);

        public final int f(long target, Object offset) {
            return this.f2153a.getInt(offset, target);
        }

        public final long g(long target, Object offset) {
            return this.f2153a.getLong(offset, target);
        }

        public final Object h(long target, Object offset) {
            return this.f2153a.getObject(offset, target);
        }

        public final long i(Field field) {
            return this.f2153a.objectFieldOffset(field);
        }

        public abstract void j(Object target, long offset, boolean value);

        public abstract void k(Object target, long offset, byte value);

        public abstract void l(Object target, long offset, double value);

        public abstract void m(Object target, long offset, float value);

        public final void n(Object target, int offset, long value) {
            this.f2153a.putInt(target, value, offset);
        }

        public final void o(Object target, long offset, long value) {
            this.f2153a.putLong(target, offset, value);
        }

        public final void p(Object target, long offset, Object value) {
            this.f2153a.putObject(target, offset, value);
        }

        public boolean q() {
            Unsafe unsafe = this.f2153a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                r1.a(th);
                return false;
            }
        }

        public abstract boolean r();
    }

    static {
        Unsafe unsafeI = i();
        f2146a = unsafeI;
        f2147b = androidx.datastore.preferences.protobuf.d.f2036a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        e dVar = null;
        if (unsafeI != null) {
            if (!androidx.datastore.preferences.protobuf.d.a()) {
                dVar = new d(unsafeI);
            } else if (zH) {
                dVar = new c(unsafeI);
            } else if (zH2) {
                dVar = new b(unsafeI);
            }
        }
        f2148c = dVar;
        f2149d = dVar == null ? false : dVar.r();
        f2150e = dVar == null ? false : dVar.q();
        f2151f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && dVar != null) {
            dVar.i(fieldG);
        }
        f2152g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(r1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j10, Object obj) {
        return ((byte) ((f2148c.f((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & BiometricManager.Authenticators.BIOMETRIC_WEAK)) != 0;
    }

    public static boolean c(long j10, Object obj) {
        return ((byte) ((f2148c.f((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & BiometricManager.Authenticators.BIOMETRIC_WEAK)) != 0;
    }

    public static <T> T d(Class<T> cls) {
        try {
            return (T) f2146a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int e(Class<?> clazz) {
        if (f2150e) {
            return f2148c.a(clazz);
        }
        return -1;
    }

    public static void f(Class clazz) {
        if (f2150e) {
            f2148c.b(clazz);
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (androidx.datastore.preferences.protobuf.d.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean h(Class<?> addressClass) {
        if (!androidx.datastore.preferences.protobuf.d.a()) {
            return false;
        }
        try {
            Class<?> cls = f2147b;
            Class cls2 = Boolean.TYPE;
            cls.getMethod("peekLong", addressClass, cls2);
            cls.getMethod("pokeLong", addressClass, Long.TYPE, cls2);
            Class cls3 = Integer.TYPE;
            cls.getMethod("pokeInt", addressClass, cls3, cls2);
            cls.getMethod("peekInt", addressClass, cls2);
            cls.getMethod("pokeByte", addressClass, Byte.TYPE);
            cls.getMethod("peekByte", addressClass);
            cls.getMethod("pokeByteArray", addressClass, byte[].class, cls3, cls3);
            cls.getMethod("peekByteArray", addressClass, byte[].class, cls3, cls3);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] target, long index, byte value) {
        f2148c.k(target, f2151f + index, value);
    }

    public static void k(Object target, long offset, byte value) {
        long j10 = (-4) & offset;
        int iF = f2148c.f(j10, target);
        int i10 = ((~((int) offset)) & 3) << 3;
        m(target, ((255 & value) << i10) | (iF & (~(BiometricManager.Authenticators.BIOMETRIC_WEAK << i10))), j10);
    }

    public static void l(Object target, long offset, byte value) {
        long j10 = (-4) & offset;
        int i10 = (((int) offset) & 3) << 3;
        m(target, ((255 & value) << i10) | (f2148c.f(j10, target) & (~(BiometricManager.Authenticators.BIOMETRIC_WEAK << i10))), j10);
    }

    public static void m(Object target, int offset, long value) {
        f2148c.n(target, offset, value);
    }

    public static void n(Object target, long offset, long value) {
        f2148c.o(target, offset, value);
    }

    public static void o(Object target, long offset, Object value) {
        f2148c.p(target, offset, value);
    }
}
