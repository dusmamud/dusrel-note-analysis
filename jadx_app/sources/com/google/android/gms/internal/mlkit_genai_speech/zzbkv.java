package com.google.android.gms.internal.mlkit_genai_speech;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbkv implements zzbht {
    private static final Logger zza = Logger.getLogger(zzbkv.class.getName());
    private static final Constructor zzb;
    private static final Method zzc;
    private static final RuntimeException zzd;
    private static final Object[] zze;
    private final Object zzf;

    static {
        Throwable th;
        Method method;
        Method method2;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method2 = cls.getMethod("add", Long.TYPE);
            try {
                cls.getMethod("sum", null);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i10];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    } else {
                        i10++;
                    }
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
                method = method2;
                zza.logp(Level.FINE, "io.grpc.internal.ReflectionLongAdderCounter", "<clinit>", "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                method2 = method;
                constructor = null;
            }
        } catch (Throwable th3) {
            th = th3;
            method = null;
        }
        if (th != null || constructor == null) {
            zzb = null;
            zzc = null;
            zzd = new RuntimeException(th);
        } else {
            zzb = constructor;
            zzc = method2;
            zzd = null;
        }
        zze = new Object[]{1L};
    }

    public zzbkv() {
        RuntimeException runtimeException = zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.zzf = zzb.newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static boolean zzb() {
        return zzd == null;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbht
    public final void zza(long j10) {
        try {
            zzc.invoke(this.zzf, zze);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
