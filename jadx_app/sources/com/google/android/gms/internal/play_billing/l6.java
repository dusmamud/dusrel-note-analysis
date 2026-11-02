package com.google.android.gms.internal.play_billing;

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
public final class l6 {
    public static final l6 zza;
    public static final l6 zzb;
    public static final l6 zzc;
    public static final l6 zzd;
    public static final l6 zze;
    public static final l6 zzf;
    public static final l6 zzg;
    public static final l6 zzh;
    public static final l6 zzi;
    public static final l6 zzj;
    public static final l6 zzk;
    public static final l6 zzl;
    public static final l6 zzm;
    public static final l6 zzn;
    public static final l6 zzo;
    public static final l6 zzp;
    public static final l6 zzq;
    public static final l6 zzr;
    private static final /* synthetic */ l6[] zzs;
    private final m6 zzt;
    private final int zzu;

    static {
        l6 l6Var = new l6("DOUBLE", 0, m6.zzd, 1);
        zza = l6Var;
        l6 l6Var2 = new l6("FLOAT", 1, m6.zzc, 5);
        zzb = l6Var2;
        m6 m6Var = m6.zzb;
        l6 l6Var3 = new l6("INT64", 2, m6Var, 0);
        zzc = l6Var3;
        l6 l6Var4 = new l6("UINT64", 3, m6Var, 0);
        zzd = l6Var4;
        m6 m6Var2 = m6.zza;
        l6 l6Var5 = new l6("INT32", 4, m6Var2, 0);
        zze = l6Var5;
        l6 l6Var6 = new l6("FIXED64", 5, m6Var, 1);
        zzf = l6Var6;
        l6 l6Var7 = new l6("FIXED32", 6, m6Var2, 5);
        zzg = l6Var7;
        l6 l6Var8 = new l6("BOOL", 7, m6.zze, 0);
        zzh = l6Var8;
        l6 l6Var9 = new l6("STRING", 8, m6.zzf, 2);
        zzi = l6Var9;
        m6 m6Var3 = m6.zzi;
        l6 l6Var10 = new l6("GROUP", 9, m6Var3, 3);
        zzj = l6Var10;
        l6 l6Var11 = new l6("MESSAGE", 10, m6Var3, 2);
        zzk = l6Var11;
        l6 l6Var12 = new l6("BYTES", 11, m6.zzg, 2);
        zzl = l6Var12;
        l6 l6Var13 = new l6("UINT32", 12, m6Var2, 0);
        zzm = l6Var13;
        l6 l6Var14 = new l6("ENUM", 13, m6.zzh, 0);
        zzn = l6Var14;
        l6 l6Var15 = new l6("SFIXED32", 14, m6Var2, 5);
        zzo = l6Var15;
        l6 l6Var16 = new l6("SFIXED64", 15, m6Var, 1);
        zzp = l6Var16;
        l6 l6Var17 = new l6("SINT32", 16, m6Var2, 0);
        zzq = l6Var17;
        l6 l6Var18 = new l6("SINT64", 17, m6Var, 0);
        zzr = l6Var18;
        zzs = new l6[]{l6Var, l6Var2, l6Var3, l6Var4, l6Var5, l6Var6, l6Var7, l6Var8, l6Var9, l6Var10, l6Var11, l6Var12, l6Var13, l6Var14, l6Var15, l6Var16, l6Var17, l6Var18};
    }

    public l6(String str, int i10, m6 m6Var, int i11) {
        super(str, i10);
        this.zzt = m6Var;
        this.zzu = i11;
    }

    public static l6[] values() {
        return (l6[]) zzs.clone();
    }

    public final m6 a() {
        return this.zzt;
    }

    public final int zza() {
        return this.zzu;
    }
}
