package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaiz {
    public static final zzaiz zza;
    public static final zzaiz zzb;
    public static final zzaiz zzc;
    public static final zzaiz zzd;
    public static final zzaiz zze;
    public static final zzaiz zzf;
    public static final zzaiz zzg;
    public static final zzaiz zzh;
    public static final zzaiz zzi;
    public static final zzaiz zzj;
    public static final zzaiz zzk;
    public static final zzaiz zzl;
    public static final zzaiz zzm;
    public static final zzaiz zzn;
    public static final zzaiz zzo;
    public static final zzaiz zzp;
    public static final zzaiz zzq;
    public static final zzaiz zzr;
    private static final /* synthetic */ zzaiz[] zzs;
    private final zzaja zzt;
    private final int zzu;

    static {
        zzaiz zzaizVar = new zzaiz("DOUBLE", 0, zzaja.DOUBLE, 1);
        zza = zzaizVar;
        zzaiz zzaizVar2 = new zzaiz("FLOAT", 1, zzaja.FLOAT, 5);
        zzb = zzaizVar2;
        zzaja zzajaVar = zzaja.LONG;
        zzaiz zzaizVar3 = new zzaiz("INT64", 2, zzajaVar, 0);
        zzc = zzaizVar3;
        zzaiz zzaizVar4 = new zzaiz("UINT64", 3, zzajaVar, 0);
        zzd = zzaizVar4;
        zzaja zzajaVar2 = zzaja.INT;
        zzaiz zzaizVar5 = new zzaiz("INT32", 4, zzajaVar2, 0);
        zze = zzaizVar5;
        zzaiz zzaizVar6 = new zzaiz("FIXED64", 5, zzajaVar, 1);
        zzf = zzaizVar6;
        zzaiz zzaizVar7 = new zzaiz("FIXED32", 6, zzajaVar2, 5);
        zzg = zzaizVar7;
        zzaiz zzaizVar8 = new zzaiz("BOOL", 7, zzaja.BOOLEAN, 0);
        zzh = zzaizVar8;
        zzaiz zzaizVar9 = new zzaiz("STRING", 8, zzaja.STRING, 2);
        zzi = zzaizVar9;
        zzaja zzajaVar3 = zzaja.MESSAGE;
        zzaiz zzaizVar10 = new zzaiz("GROUP", 9, zzajaVar3, 3);
        zzj = zzaizVar10;
        zzaiz zzaizVar11 = new zzaiz("MESSAGE", 10, zzajaVar3, 2);
        zzk = zzaizVar11;
        zzaiz zzaizVar12 = new zzaiz("BYTES", 11, zzaja.BYTE_STRING, 2);
        zzl = zzaizVar12;
        zzaiz zzaizVar13 = new zzaiz("UINT32", 12, zzajaVar2, 0);
        zzm = zzaizVar13;
        zzaiz zzaizVar14 = new zzaiz("ENUM", 13, zzaja.ENUM, 0);
        zzn = zzaizVar14;
        zzaiz zzaizVar15 = new zzaiz("SFIXED32", 14, zzajaVar2, 5);
        zzo = zzaizVar15;
        zzaiz zzaizVar16 = new zzaiz("SFIXED64", 15, zzajaVar, 1);
        zzp = zzaizVar16;
        zzaiz zzaizVar17 = new zzaiz("SINT32", 16, zzajaVar2, 0);
        zzq = zzaizVar17;
        zzaiz zzaizVar18 = new zzaiz("SINT64", 17, zzajaVar, 0);
        zzr = zzaizVar18;
        zzs = new zzaiz[]{zzaizVar, zzaizVar2, zzaizVar3, zzaizVar4, zzaizVar5, zzaizVar6, zzaizVar7, zzaizVar8, zzaizVar9, zzaizVar10, zzaizVar11, zzaizVar12, zzaizVar13, zzaizVar14, zzaizVar15, zzaizVar16, zzaizVar17, zzaizVar18};
    }

    private zzaiz(String str, int i10, zzaja zzajaVar, int i11) {
        super(str, i10);
        this.zzt = zzajaVar;
        this.zzu = i11;
    }

    public static zzaiz[] values() {
        return (zzaiz[]) zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzaja zzb() {
        return this.zzt;
    }
}
