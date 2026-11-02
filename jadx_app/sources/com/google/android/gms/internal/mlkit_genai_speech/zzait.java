package com.google.android.gms.internal.mlkit_genai_speech;

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
final class zzait {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzais zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z10;
        boolean z11;
        zzais zzaisVar;
        Unsafe unsafeZzg = zzg();
        zzc = unsafeZzg;
        int i10 = zzaes.zza;
        zzd = Memory.class;
        Class cls = Long.TYPE;
        boolean zZzv = zzv(cls);
        zze = zZzv;
        Class cls2 = Integer.TYPE;
        boolean zZzv2 = zzv(cls2);
        zzais zzaiqVar = null;
        if (unsafeZzg != null) {
            if (zZzv) {
                zzaiqVar = new zzair(unsafeZzg);
            } else if (zZzv2) {
                zzaiqVar = new zzaiq(unsafeZzg);
            }
        }
        zzf = zzaiqVar;
        if (zzaiqVar == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls3 = zzaiqVar.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (zzB() == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th) {
                zzh(th);
            }
        }
        zzg = z10;
        zzais zzaisVar2 = zzf;
        if (zzaisVar2 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls4 = zzaisVar2.zza.getClass();
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
                zzh(th2);
                z11 = false;
            }
        }
        zzh = z11;
        zza = zzz(byte[].class);
        zzz(boolean[].class);
        zzA(boolean[].class);
        zzz(int[].class);
        zzA(int[].class);
        zzz(long[].class);
        zzA(long[].class);
        zzz(float[].class);
        zzA(float[].class);
        zzz(double[].class);
        zzA(double[].class);
        zzz(Object[].class);
        zzA(Object[].class);
        Field fieldZzB = zzB();
        if (fieldZzB != null && (zzaisVar = zzf) != null) {
            zzaisVar.zza.objectFieldOffset(fieldZzB);
        }
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzait() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i10 = zzaes.zza;
        Field fieldZzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (fieldZzC != null) {
            return fieldZzC;
        }
        Field fieldZzC2 = zzC(Buffer.class, "address");
        if (fieldZzC2 == null || fieldZzC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j10, byte b10) {
        Unsafe unsafe = zzf.zza;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(BiometricManager.Authenticators.BIOMETRIC_WEAK << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j10, byte b10) {
        Unsafe unsafe = zzf.zza;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(BiometricManager.Authenticators.BIOMETRIC_WEAK << i10))));
    }

    public static double zza(Object obj, long j10) {
        return zzf.zza(obj, j10);
    }

    public static float zzb(Object obj, long j10) {
        return zzf.zzb(obj, j10);
    }

    public static int zzc(Object obj, long j10) {
        return zzf.zza.getInt(obj, j10);
    }

    public static long zzd(Object obj, long j10) {
        return zzf.zza.getLong(obj, j10);
    }

    public static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object zzf(Object obj, long j10) {
        return zzf.zza.getObject(obj, j10);
    }

    public static Unsafe zzg() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zzaip());
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
            Logger.getLogger(zzait.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzait.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void zzm(Object obj, long j10, boolean z10) {
        zzf.zzc(obj, j10, z10);
    }

    public static void zzn(byte[] bArr, long j10, byte b10) {
        zzf.zzd(bArr, zza + j10, b10);
    }

    public static void zzo(Object obj, long j10, double d10) {
        zzf.zze(obj, j10, d10);
    }

    public static void zzp(Object obj, long j10, float f10) {
        zzf.zzf(obj, j10, f10);
    }

    public static void zzq(Object obj, long j10, int i10) {
        zzf.zza.putInt(obj, j10, i10);
    }

    public static void zzr(Object obj, long j10, long j11) {
        zzf.zza.putLong(obj, j10, j11);
    }

    public static void zzs(Object obj, long j10, Object obj2) {
        zzf.zza.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & BiometricManager.Authenticators.BIOMETRIC_WEAK)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & BiometricManager.Authenticators.BIOMETRIC_WEAK)) != 0;
    }

    public static boolean zzv(Class cls) {
        int i10 = zzaes.zza;
        try {
            Class cls2 = zzd;
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

    public static boolean zzw(Object obj, long j10) {
        return zzf.zzg(obj, j10);
    }

    public static boolean zzx() {
        return zzh;
    }

    public static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
