package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.biometric.BiometricManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f21612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f21613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f21614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f21615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f21616e;

    public static final class a extends b {
        @Override // com.google.android.gms.internal.firebase-auth-api.ja.b
        public final double a(Object obj, long j10) {
            return Double.longBitsToDouble(j(j10, obj));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.ja.b
        public final void c(Object obj, long j10, double d10) {
            e(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.ja.b
        public final void d(Object obj, long j10, float f10) {
            b(obj, Float.floatToIntBits(f10), j10);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.ja.b
        public final void f(Object obj, long j10, boolean z10) {
            if (ja.f21616e) {
                ja.e(obj, j10, z10);
            } else {
                ja.h(obj, j10, z10);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.ja.b
        public final float g(Object obj, long j10) {
            return Float.intBitsToFloat(i(j10, obj));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.ja.b
        public final boolean h(long j10, Object obj) {
            if (ja.f21616e) {
                return ((byte) (ja.f21614c.i((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3)))) != 0;
            }
            return ((byte) (ja.f21614c.i((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3)))) != 0;
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Unsafe f21617a;

        public b(Unsafe unsafe) {
            this.f21617a = unsafe;
        }

        public abstract double a(Object obj, long j10);

        public final void b(Object obj, int i10, long j10) {
            this.f21617a.putInt(obj, j10, i10);
        }

        public abstract void c(Object obj, long j10, double d10);

        public abstract void d(Object obj, long j10, float f10);

        public final void e(Object obj, long j10, long j11) {
            this.f21617a.putLong(obj, j10, j11);
        }

        public abstract void f(Object obj, long j10, boolean z10);

        public abstract float g(Object obj, long j10);

        public abstract boolean h(long j10, Object obj);

        public final int i(long j10, Object obj) {
            return this.f21617a.getInt(obj, j10);
        }

        public final long j(long j10, Object obj) {
            return this.f21617a.getLong(obj, j10);
        }
    }

    public static final class c extends b {
        @Override // com.google.android.gms.internal.firebase-auth-api.ja.b
        public final double a(Object obj, long j10) {
            return Double.longBitsToDouble(j(j10, obj));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.ja.b
        public final void c(Object obj, long j10, double d10) {
            e(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.ja.b
        public final void d(Object obj, long j10, float f10) {
            b(obj, Float.floatToIntBits(f10), j10);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.ja.b
        public final void f(Object obj, long j10, boolean z10) {
            if (ja.f21616e) {
                ja.e(obj, j10, z10);
            } else {
                ja.h(obj, j10, z10);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.ja.b
        public final float g(Object obj, long j10) {
            return Float.intBitsToFloat(i(j10, obj));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.ja.b
        public final boolean h(long j10, Object obj) {
            if (ja.f21616e) {
                return ((byte) (ja.f21614c.i((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3)))) != 0;
            }
            return ((byte) (ja.f21614c.i((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3)))) != 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    static {
        b aVar;
        Unsafe unsafe;
        boolean z10;
        b bVar;
        Unsafe unsafe2;
        Unsafe unsafeF = f();
        f21612a = unsafeF;
        f21613b = l7.f21766a;
        Class cls = Long.TYPE;
        boolean zK = k(cls);
        Class cls2 = Integer.TYPE;
        boolean zK2 = k(cls2);
        if (unsafeF == null) {
            aVar = null;
        } else if (zK) {
            aVar = new c(unsafeF);
        } else if (zK2) {
            aVar = new a(unsafeF);
        } else {
            aVar = null;
        }
        f21614c = aVar;
        if (aVar != null && (unsafe2 = aVar.f21617a) != null) {
            try {
                Class<?> cls3 = unsafe2.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                i();
            } catch (Throwable th) {
                Logger.getLogger(ja.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            }
        }
        b bVar2 = f21614c;
        if (bVar2 == null || (unsafe = bVar2.f21617a) == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls4 = unsafe.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z10 = true;
            } catch (Throwable th2) {
                Logger.getLogger(ja.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th2)));
                z10 = false;
            }
        }
        f21615d = z10;
        g(byte[].class);
        g(boolean[].class);
        j(boolean[].class);
        g(int[].class);
        j(int[].class);
        g(long[].class);
        j(long[].class);
        g(float[].class);
        j(float[].class);
        g(double[].class);
        j(double[].class);
        g(Object[].class);
        j(Object[].class);
        Field fieldI = i();
        if (fieldI != null && (bVar = f21614c) != null) {
            bVar.f21617a.objectFieldOffset(fieldI);
        }
        f21616e = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static <T> T a(Class<T> cls) {
        try {
            return (T) f21612a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void b(Object obj, int i10, long j10) {
        f21614c.b(obj, i10, j10);
    }

    public static void c(Object obj, long j10, long j11) {
        f21614c.e(obj, j10, j11);
    }

    public static void d(Object obj, long j10, Object obj2) {
        f21614c.f21617a.putObject(obj, j10, obj2);
    }

    public static void e(Object obj, long j10, boolean z10) {
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        long j11 = (-4) & j10;
        int i10 = f21614c.i(j11, obj);
        int i11 = ((~((int) j10)) & 3) << 3;
        b(obj, ((255 & b10) << i11) | (i10 & (~(BiometricManager.Authenticators.BIOMETRIC_WEAK << i11))), j11);
    }

    public static Unsafe f() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new la());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(ja.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void g(Class cls) {
        if (f21615d) {
            f21614c.f21617a.arrayBaseOffset(cls);
        }
    }

    public static void h(Object obj, long j10, boolean z10) {
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        b(obj, ((255 & b10) << i10) | (f21614c.i(j11, obj) & (~(BiometricManager.Authenticators.BIOMETRIC_WEAK << i10))), j11);
    }

    public static Field i() {
        Field declaredField;
        Field declaredField2;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    public static void j(Class cls) {
        if (f21615d) {
            f21614c.f21617a.arrayIndexScale(cls);
        }
    }

    public static boolean k(Class<?> cls) {
        try {
            Class<?> cls2 = f21613b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Object l(long j10, Object obj) {
        return f21614c.f21617a.getObject(obj, j10);
    }
}
