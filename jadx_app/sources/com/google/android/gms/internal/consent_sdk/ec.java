package com.google.android.gms.internal.consent_sdk;

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
/* JADX INFO: loaded from: classes.dex */
public final class ec {
    public static final ec zza;
    public static final ec zzb;
    public static final ec zzc;
    public static final ec zzd;
    public static final ec zze;
    public static final ec zzf;
    public static final ec zzg;
    public static final ec zzh;
    public static final ec zzi;
    public static final ec zzj;
    public static final ec zzk;
    public static final ec zzl;
    public static final ec zzm;
    public static final ec zzn;
    public static final ec zzo;
    public static final ec zzp;
    public static final ec zzq;
    public static final ec zzr;
    private static final /* synthetic */ ec[] zzs;
    private final gc zzt;
    private final int zzu;

    static {
        ec ecVar = new ec("DOUBLE", 0, gc.zzd, 1);
        zza = ecVar;
        ec ecVar2 = new ec("FLOAT", 1, gc.zzc, 5);
        zzb = ecVar2;
        gc gcVar = gc.zzb;
        ec ecVar3 = new ec("INT64", 2, gcVar, 0);
        zzc = ecVar3;
        ec ecVar4 = new ec("UINT64", 3, gcVar, 0);
        zzd = ecVar4;
        gc gcVar2 = gc.zza;
        ec ecVar5 = new ec("INT32", 4, gcVar2, 0);
        zze = ecVar5;
        ec ecVar6 = new ec("FIXED64", 5, gcVar, 1);
        zzf = ecVar6;
        ec ecVar7 = new ec("FIXED32", 6, gcVar2, 5);
        zzg = ecVar7;
        ec ecVar8 = new ec("BOOL", 7, gc.zze, 0);
        zzh = ecVar8;
        ec ecVar9 = new ec("STRING", 8, gc.zzf, 2);
        zzi = ecVar9;
        gc gcVar3 = gc.zzi;
        ec ecVar10 = new ec("GROUP", 9, gcVar3, 3);
        zzj = ecVar10;
        ec ecVar11 = new ec("MESSAGE", 10, gcVar3, 2);
        zzk = ecVar11;
        ec ecVar12 = new ec("BYTES", 11, gc.zzg, 2);
        zzl = ecVar12;
        ec ecVar13 = new ec("UINT32", 12, gcVar2, 0);
        zzm = ecVar13;
        ec ecVar14 = new ec("ENUM", 13, gc.zzh, 0);
        zzn = ecVar14;
        ec ecVar15 = new ec("SFIXED32", 14, gcVar2, 5);
        zzo = ecVar15;
        ec ecVar16 = new ec("SFIXED64", 15, gcVar, 1);
        zzp = ecVar16;
        ec ecVar17 = new ec("SINT32", 16, gcVar2, 0);
        zzq = ecVar17;
        ec ecVar18 = new ec("SINT64", 17, gcVar, 0);
        zzr = ecVar18;
        zzs = new ec[]{ecVar, ecVar2, ecVar3, ecVar4, ecVar5, ecVar6, ecVar7, ecVar8, ecVar9, ecVar10, ecVar11, ecVar12, ecVar13, ecVar14, ecVar15, ecVar16, ecVar17, ecVar18};
    }

    public ec(String str, int i10, gc gcVar, int i11) {
        super(str, i10);
        this.zzt = gcVar;
        this.zzu = i11;
    }

    public static ec[] values() {
        return (ec[]) zzs.clone();
    }

    public final gc a() {
        return this.zzt;
    }

    public final int zza() {
        return this.zzu;
    }
}
