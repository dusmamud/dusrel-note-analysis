package com.google.android.gms.internal.play_billing;

import androidx.biometric.BiometricManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f22677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f22678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f6 f22679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f22680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f22681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f22682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f22683g;

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    static {
        boolean z10;
        boolean z11;
        f6 f6Var;
        Unsafe unsafeI = i();
        f22677a = unsafeI;
        int i10 = z2.f22854a;
        f22678b = Memory.class;
        Class cls = Long.TYPE;
        boolean zO = o(cls);
        Class cls2 = Integer.TYPE;
        boolean zO2 = o(cls2);
        f6 d6Var = null;
        if (unsafeI != null) {
            if (zO) {
                d6Var = new e6(unsafeI);
            } else if (zO2) {
                d6Var = new d6(unsafeI);
            }
        }
        f22679c = d6Var;
        if (d6Var == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls3 = d6Var.f22666a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(g6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f22680d = z10;
        f6 f6Var2 = f22679c;
        if (f6Var2 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls4 = f6Var2.f22666a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z11 = true;
            } catch (Throwable th2) {
                Logger.getLogger(g6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z11 = false;
            }
        }
        f22681e = z11;
        f22682f = p(byte[].class);
        p(boolean[].class);
        a(boolean[].class);
        p(int[].class);
        a(int[].class);
        p(long[].class);
        a(long[].class);
        p(float[].class);
        a(float[].class);
        p(double[].class);
        a(double[].class);
        p(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (f6Var = f22679c) != null) {
            f6Var.f22666a.objectFieldOffset(fieldB);
        }
        f22683g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (f22681e) {
            f22679c.f22666a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field declaredField;
        Field declaredField2;
        int i10 = z2.f22854a;
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

    public static void c(Object obj, long j10, byte b10) {
        Unsafe unsafe = f22679c.f22666a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(BiometricManager.Authenticators.BIOMETRIC_WEAK << i11))));
    }

    public static void d(Object obj, long j10, byte b10) {
        Unsafe unsafe = f22679c.f22666a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(BiometricManager.Authenticators.BIOMETRIC_WEAK << i10))));
    }

    public static int e(Object obj, long j10) {
        return f22679c.f22666a.getInt(obj, j10);
    }

    public static long f(Object obj, long j10) {
        return f22679c.f22666a.getLong(obj, j10);
    }

    public static Object g(Class cls) {
        try {
            return f22677a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object h(Object obj, long j10) {
        return f22679c.f22666a.getObject(obj, j10);
    }

    public static Unsafe i() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new c6());
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
            Logger.getLogger(g6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void j(Object obj, long j10, int i10) {
        f22679c.f22666a.putInt(obj, j10, i10);
    }

    public static void k(Object obj, long j10, long j11) {
        f22679c.f22666a.putLong(obj, j10, j11);
    }

    public static void l(Object obj, long j10, Object obj2) {
        f22679c.f22666a.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean m(Object obj, long j10) {
        return ((byte) ((f22679c.f22666a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & BiometricManager.Authenticators.BIOMETRIC_WEAK)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean n(Object obj, long j10) {
        return ((byte) ((f22679c.f22666a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & BiometricManager.Authenticators.BIOMETRIC_WEAK)) != 0;
    }

    public static boolean o(Class cls) {
        int i10 = z2.f22854a;
        try {
            Class cls2 = f22678b;
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

    public static int p(Class cls) {
        if (f22681e) {
            return f22679c.f22666a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
