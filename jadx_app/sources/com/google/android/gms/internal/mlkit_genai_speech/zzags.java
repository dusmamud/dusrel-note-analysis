package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class zzags {
    public static final zzags zza;
    public static final zzags zzb;
    public static final zzags zzc;
    public static final zzags zzd;
    public static final zzags zze;
    public static final zzags zzf;
    public static final zzags zzg;
    public static final zzags zzh;
    public static final zzags zzi;
    public static final zzags zzj;
    private static final /* synthetic */ zzags[] zzk;
    private final Class zzl;

    static {
        zzags zzagsVar = new zzags("VOID", 0, Void.class, Void.class, null);
        zza = zzagsVar;
        Class cls = Integer.TYPE;
        zzags zzagsVar2 = new zzags("INT", 1, cls, Integer.class, 0);
        zzb = zzagsVar2;
        zzags zzagsVar3 = new zzags("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzagsVar3;
        zzags zzagsVar4 = new zzags("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzagsVar4;
        zzags zzagsVar5 = new zzags("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzagsVar5;
        zzags zzagsVar6 = new zzags("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzagsVar6;
        zzags zzagsVar7 = new zzags("STRING", 6, String.class, String.class, "");
        zzg = zzagsVar7;
        zzags zzagsVar8 = new zzags("BYTE_STRING", 7, zzafd.class, zzafd.class, zzafd.zza);
        zzh = zzagsVar8;
        zzags zzagsVar9 = new zzags("ENUM", 8, cls, Integer.class, null);
        zzi = zzagsVar9;
        zzags zzagsVar10 = new zzags("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzagsVar10;
        zzk = new zzags[]{zzagsVar, zzagsVar2, zzagsVar3, zzagsVar4, zzagsVar5, zzagsVar6, zzagsVar7, zzagsVar8, zzagsVar9, zzagsVar10};
    }

    private zzags(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.zzl = cls2;
    }

    public static zzags[] values() {
        return (zzags[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
