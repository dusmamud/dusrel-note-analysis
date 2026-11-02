package com.google.android.gms.internal.consent_sdk;

import androidx.biometric.BiometricManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f20709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f20710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ac f20711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f20712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f20713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f20714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f20715g;

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    static {
        boolean z10;
        boolean z11;
        ac acVar;
        Unsafe unsafeI = i();
        f20709a = unsafeI;
        int i10 = h9.f20782a;
        f20710b = Memory.class;
        Class cls = Long.TYPE;
        boolean zP = p(cls);
        Class cls2 = Integer.TYPE;
        boolean zP2 = p(cls2);
        ac ybVar = null;
        if (unsafeI != null) {
            if (zP) {
                ybVar = new zb(unsafeI);
            } else if (zP2) {
                ybVar = new yb(unsafeI);
            }
        }
        f20711c = ybVar;
        if (ybVar == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls3 = ybVar.f20699a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(bc.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f20712d = z10;
        ac acVar2 = f20711c;
        if (acVar2 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls4 = acVar2.f20699a.getClass();
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
                Logger.getLogger(bc.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z11 = false;
            }
        }
        f20713e = z11;
        f20714f = q(byte[].class);
        q(boolean[].class);
        a(boolean[].class);
        q(int[].class);
        a(int[].class);
        q(long[].class);
        a(long[].class);
        q(float[].class);
        a(float[].class);
        q(double[].class);
        a(double[].class);
        q(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (acVar = f20711c) != null) {
            acVar.f20699a.objectFieldOffset(fieldB);
        }
        f20715g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (f20713e) {
            f20711c.f20699a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field declaredField;
        Field declaredField2;
        int i10 = h9.f20782a;
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
        Unsafe unsafe = f20711c.f20699a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(BiometricManager.Authenticators.BIOMETRIC_WEAK << i11))));
    }

    public static void d(Object obj, long j10, byte b10) {
        Unsafe unsafe = f20711c.f20699a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(BiometricManager.Authenticators.BIOMETRIC_WEAK << i10))));
    }

    public static int e(Object obj, long j10) {
        return f20711c.f20699a.getInt(obj, j10);
    }

    public static long f(Object obj, long j10) {
        return f20711c.f20699a.getLong(obj, j10);
    }

    public static Object g(Class cls) {
        try {
            return f20709a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object h(Object obj, long j10) {
        return f20711c.f20699a.getObject(obj, j10);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new xb());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j10, byte b10) {
        f20711c.d(bArr, f20714f + j10, b10);
    }

    public static void k(Object obj, long j10, int i10) {
        f20711c.f20699a.putInt(obj, j10, i10);
    }

    public static void l(Object obj, long j10, long j11) {
        f20711c.f20699a.putLong(obj, j10, j11);
    }

    public static void m(Object obj, long j10, Object obj2) {
        f20711c.f20699a.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean n(Object obj, long j10) {
        return ((byte) ((f20711c.f20699a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & BiometricManager.Authenticators.BIOMETRIC_WEAK)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean o(Object obj, long j10) {
        return ((byte) ((f20711c.f20699a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & BiometricManager.Authenticators.BIOMETRIC_WEAK)) != 0;
    }

    public static boolean p(Class cls) {
        int i10 = h9.f20782a;
        try {
            Class cls2 = f20710b;
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

    public static int q(Class cls) {
        if (f20713e) {
            return f20711c.f20699a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
