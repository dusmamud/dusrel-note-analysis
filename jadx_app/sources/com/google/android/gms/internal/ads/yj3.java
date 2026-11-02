package com.google.android.gms.internal.ads;

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
public final class yj3 {
    public static final yj3 zza;
    public static final yj3 zzb;
    public static final yj3 zzc;
    public static final yj3 zzd;
    public static final yj3 zze;
    public static final yj3 zzf;
    public static final yj3 zzg;
    public static final yj3 zzh;
    public static final yj3 zzi;
    public static final yj3 zzj;
    public static final yj3 zzk;
    public static final yj3 zzl;
    public static final yj3 zzm;
    public static final yj3 zzn;
    public static final yj3 zzo;
    public static final yj3 zzp;
    public static final yj3 zzq;
    public static final yj3 zzr;
    private static final /* synthetic */ yj3[] zzu;
    private final zj3 zzs;
    private final int zzt;

    static {
        yj3 yj3Var = new yj3("DOUBLE", 0, zj3.zzd, 1);
        zza = yj3Var;
        yj3 yj3Var2 = new yj3("FLOAT", 1, zj3.zzc, 5);
        zzb = yj3Var2;
        zj3 zj3Var = zj3.zzb;
        yj3 yj3Var3 = new yj3("INT64", 2, zj3Var, 0);
        zzc = yj3Var3;
        yj3 yj3Var4 = new yj3("UINT64", 3, zj3Var, 0);
        zzd = yj3Var4;
        zj3 zj3Var2 = zj3.zza;
        yj3 yj3Var5 = new yj3("INT32", 4, zj3Var2, 0);
        zze = yj3Var5;
        yj3 yj3Var6 = new yj3("FIXED64", 5, zj3Var, 1);
        zzf = yj3Var6;
        yj3 yj3Var7 = new yj3("FIXED32", 6, zj3Var2, 5);
        zzg = yj3Var7;
        yj3 yj3Var8 = new yj3("BOOL", 7, zj3.zze, 0);
        zzh = yj3Var8;
        yj3 yj3Var9 = new yj3("STRING", 8, zj3.zzf, 2);
        zzi = yj3Var9;
        zj3 zj3Var3 = zj3.zzi;
        yj3 yj3Var10 = new yj3("GROUP", 9, zj3Var3, 3);
        zzj = yj3Var10;
        yj3 yj3Var11 = new yj3("MESSAGE", 10, zj3Var3, 2);
        zzk = yj3Var11;
        yj3 yj3Var12 = new yj3("BYTES", 11, zj3.zzg, 2);
        zzl = yj3Var12;
        yj3 yj3Var13 = new yj3("UINT32", 12, zj3Var2, 0);
        zzm = yj3Var13;
        yj3 yj3Var14 = new yj3("ENUM", 13, zj3.zzh, 0);
        zzn = yj3Var14;
        yj3 yj3Var15 = new yj3("SFIXED32", 14, zj3Var2, 5);
        zzo = yj3Var15;
        yj3 yj3Var16 = new yj3("SFIXED64", 15, zj3Var, 1);
        zzp = yj3Var16;
        yj3 yj3Var17 = new yj3("SINT32", 16, zj3Var2, 0);
        zzq = yj3Var17;
        yj3 yj3Var18 = new yj3("SINT64", 17, zj3Var, 0);
        zzr = yj3Var18;
        zzu = new yj3[]{yj3Var, yj3Var2, yj3Var3, yj3Var4, yj3Var5, yj3Var6, yj3Var7, yj3Var8, yj3Var9, yj3Var10, yj3Var11, yj3Var12, yj3Var13, yj3Var14, yj3Var15, yj3Var16, yj3Var17, yj3Var18};
    }

    public yj3(String str, int i10, zj3 zj3Var, int i11) {
        super(str, i10);
        this.zzs = zj3Var;
        this.zzt = i11;
    }

    public static yj3[] values() {
        return (yj3[]) zzu.clone();
    }

    public final zj3 a() {
        return this.zzs;
    }

    public final int b() {
        return this.zzt;
    }
}
