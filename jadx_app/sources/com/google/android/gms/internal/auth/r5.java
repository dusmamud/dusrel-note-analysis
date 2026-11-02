package com.google.android.gms.internal.auth;

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
public final class r5 {
    public static final r5 zza;
    public static final r5 zzb;
    public static final r5 zzc;
    public static final r5 zzd;
    public static final r5 zze;
    public static final r5 zzf;
    public static final r5 zzg;
    public static final r5 zzh;
    public static final r5 zzi;
    public static final r5 zzj;
    public static final r5 zzk;
    public static final r5 zzl;
    public static final r5 zzm;
    public static final r5 zzn;
    public static final r5 zzo;
    public static final r5 zzp;
    public static final r5 zzq;
    public static final r5 zzr;
    private static final /* synthetic */ r5[] zzs;
    private final s5 zzt;

    static {
        r5 r5Var = new r5("DOUBLE", 0, s5.DOUBLE);
        zza = r5Var;
        r5 r5Var2 = new r5("FLOAT", 1, s5.FLOAT);
        zzb = r5Var2;
        s5 s5Var = s5.LONG;
        r5 r5Var3 = new r5("INT64", 2, s5Var);
        zzc = r5Var3;
        r5 r5Var4 = new r5("UINT64", 3, s5Var);
        zzd = r5Var4;
        s5 s5Var2 = s5.INT;
        r5 r5Var5 = new r5("INT32", 4, s5Var2);
        zze = r5Var5;
        r5 r5Var6 = new r5("FIXED64", 5, s5Var);
        zzf = r5Var6;
        r5 r5Var7 = new r5("FIXED32", 6, s5Var2);
        zzg = r5Var7;
        r5 r5Var8 = new r5("BOOL", 7, s5.BOOLEAN);
        zzh = r5Var8;
        r5 r5Var9 = new r5("STRING", 8, s5.STRING);
        zzi = r5Var9;
        s5 s5Var3 = s5.MESSAGE;
        r5 r5Var10 = new r5("GROUP", 9, s5Var3);
        zzj = r5Var10;
        r5 r5Var11 = new r5("MESSAGE", 10, s5Var3);
        zzk = r5Var11;
        r5 r5Var12 = new r5("BYTES", 11, s5.BYTE_STRING);
        zzl = r5Var12;
        r5 r5Var13 = new r5("UINT32", 12, s5Var2);
        zzm = r5Var13;
        r5 r5Var14 = new r5("ENUM", 13, s5.ENUM);
        zzn = r5Var14;
        r5 r5Var15 = new r5("SFIXED32", 14, s5Var2);
        zzo = r5Var15;
        r5 r5Var16 = new r5("SFIXED64", 15, s5Var);
        zzp = r5Var16;
        r5 r5Var17 = new r5("SINT32", 16, s5Var2);
        zzq = r5Var17;
        r5 r5Var18 = new r5("SINT64", 17, s5Var);
        zzr = r5Var18;
        zzs = new r5[]{r5Var, r5Var2, r5Var3, r5Var4, r5Var5, r5Var6, r5Var7, r5Var8, r5Var9, r5Var10, r5Var11, r5Var12, r5Var13, r5Var14, r5Var15, r5Var16, r5Var17, r5Var18};
    }

    public r5(String str, int i10, s5 s5Var) {
        super(str, i10);
        this.zzt = s5Var;
    }

    public static r5[] values() {
        return (r5[]) zzs.clone();
    }

    public final s5 a() {
        return this.zzt;
    }
}
