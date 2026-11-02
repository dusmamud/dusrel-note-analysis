package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zza' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class aa {
    public static final aa zzA;
    public static final aa zzB;
    public static final aa zzC;
    public static final aa zzD;
    public static final aa zzE;
    public static final aa zzF;
    public static final aa zzG;
    public static final aa zzH;
    public static final aa zzI;
    public static final aa zzJ;
    public static final aa zzK;
    public static final aa zzL;
    public static final aa zzM;
    public static final aa zzN;
    public static final aa zzO;
    public static final aa zzP;
    public static final aa zzQ;
    public static final aa zzR;
    public static final aa zzS;
    public static final aa zzT;
    public static final aa zzU;
    public static final aa zzV;
    public static final aa zzW;
    public static final aa zzX;
    public static final aa zzY;
    private static final aa[] zzZ;
    public static final aa zza;
    private static final /* synthetic */ aa[] zzaa;
    public static final aa zzb;
    public static final aa zzc;
    public static final aa zzd;
    public static final aa zze;
    public static final aa zzf;
    public static final aa zzg;
    public static final aa zzh;
    public static final aa zzi;
    public static final aa zzj;
    public static final aa zzk;
    public static final aa zzl;
    public static final aa zzm;
    public static final aa zzn;
    public static final aa zzo;
    public static final aa zzp;
    public static final aa zzq;
    public static final aa zzr;
    public static final aa zzs;
    public static final aa zzt;
    public static final aa zzu;
    public static final aa zzv;
    public static final aa zzw;
    public static final aa zzx;
    public static final aa zzy;
    public static final aa zzz;
    private final int zzab;

    static {
        ma maVar = ma.DOUBLE;
        aa aaVar = new aa("DOUBLE", 0, 0, 1, maVar);
        zza = aaVar;
        ma maVar2 = ma.FLOAT;
        aa aaVar2 = new aa("FLOAT", 1, 1, 1, maVar2);
        zzb = aaVar2;
        ma maVar3 = ma.LONG;
        aa aaVar3 = new aa("INT64", 2, 2, 1, maVar3);
        zzc = aaVar3;
        aa aaVar4 = new aa("UINT64", 3, 3, 1, maVar3);
        zzd = aaVar4;
        ma maVar4 = ma.INT;
        aa aaVar5 = new aa("INT32", 4, 4, 1, maVar4);
        zze = aaVar5;
        aa aaVar6 = new aa("FIXED64", 5, 5, 1, maVar3);
        zzf = aaVar6;
        aa aaVar7 = new aa("FIXED32", 6, 6, 1, maVar4);
        zzg = aaVar7;
        ma maVar5 = ma.BOOLEAN;
        aa aaVar8 = new aa("BOOL", 7, 7, 1, maVar5);
        zzh = aaVar8;
        ma maVar6 = ma.STRING;
        aa aaVar9 = new aa("STRING", 8, 8, 1, maVar6);
        zzi = aaVar9;
        ma maVar7 = ma.MESSAGE;
        aa aaVar10 = new aa("MESSAGE", 9, 9, 1, maVar7);
        zzj = aaVar10;
        ma maVar8 = ma.BYTE_STRING;
        aa aaVar11 = new aa("BYTES", 10, 10, 1, maVar8);
        zzk = aaVar11;
        aa aaVar12 = new aa("UINT32", 11, 11, 1, maVar4);
        zzl = aaVar12;
        ma maVar9 = ma.ENUM;
        aa aaVar13 = new aa("ENUM", 12, 12, 1, maVar9);
        zzm = aaVar13;
        aa aaVar14 = new aa("SFIXED32", 13, 13, 1, maVar4);
        zzn = aaVar14;
        aa aaVar15 = new aa("SFIXED64", 14, 14, 1, maVar3);
        zzo = aaVar15;
        aa aaVar16 = new aa("SINT32", 15, 15, 1, maVar4);
        zzp = aaVar16;
        aa aaVar17 = new aa("SINT64", 16, 16, 1, maVar3);
        zzq = aaVar17;
        aa aaVar18 = new aa("GROUP", 17, 17, 1, maVar7);
        zzr = aaVar18;
        aa aaVar19 = new aa("DOUBLE_LIST", 18, 18, 2, maVar);
        zzs = aaVar19;
        aa aaVar20 = new aa("FLOAT_LIST", 19, 19, 2, maVar2);
        zzt = aaVar20;
        aa aaVar21 = new aa("INT64_LIST", 20, 20, 2, maVar3);
        zzu = aaVar21;
        aa aaVar22 = new aa("UINT64_LIST", 21, 21, 2, maVar3);
        zzv = aaVar22;
        aa aaVar23 = new aa("INT32_LIST", 22, 22, 2, maVar4);
        zzw = aaVar23;
        aa aaVar24 = new aa("FIXED64_LIST", 23, 23, 2, maVar3);
        zzx = aaVar24;
        aa aaVar25 = new aa("FIXED32_LIST", 24, 24, 2, maVar4);
        zzy = aaVar25;
        aa aaVar26 = new aa("BOOL_LIST", 25, 25, 2, maVar5);
        zzz = aaVar26;
        aa aaVar27 = new aa("STRING_LIST", 26, 26, 2, maVar6);
        zzA = aaVar27;
        aa aaVar28 = new aa("MESSAGE_LIST", 27, 27, 2, maVar7);
        zzB = aaVar28;
        aa aaVar29 = new aa("BYTES_LIST", 28, 28, 2, maVar8);
        zzC = aaVar29;
        aa aaVar30 = new aa("UINT32_LIST", 29, 29, 2, maVar4);
        zzD = aaVar30;
        aa aaVar31 = new aa("ENUM_LIST", 30, 30, 2, maVar9);
        zzE = aaVar31;
        aa aaVar32 = new aa("SFIXED32_LIST", 31, 31, 2, maVar4);
        zzF = aaVar32;
        aa aaVar33 = new aa("SFIXED64_LIST", 32, 32, 2, maVar3);
        zzG = aaVar33;
        aa aaVar34 = new aa("SINT32_LIST", 33, 33, 2, maVar4);
        zzH = aaVar34;
        aa aaVar35 = new aa("SINT64_LIST", 34, 34, 2, maVar3);
        zzI = aaVar35;
        aa aaVar36 = new aa("DOUBLE_LIST_PACKED", 35, 35, 3, maVar);
        zzJ = aaVar36;
        aa aaVar37 = new aa("FLOAT_LIST_PACKED", 36, 36, 3, maVar2);
        zzK = aaVar37;
        aa aaVar38 = new aa("INT64_LIST_PACKED", 37, 37, 3, maVar3);
        zzL = aaVar38;
        aa aaVar39 = new aa("UINT64_LIST_PACKED", 38, 38, 3, maVar3);
        zzM = aaVar39;
        aa aaVar40 = new aa("INT32_LIST_PACKED", 39, 39, 3, maVar4);
        zzN = aaVar40;
        aa aaVar41 = new aa("FIXED64_LIST_PACKED", 40, 40, 3, maVar3);
        zzO = aaVar41;
        aa aaVar42 = new aa("FIXED32_LIST_PACKED", 41, 41, 3, maVar4);
        zzP = aaVar42;
        aa aaVar43 = new aa("BOOL_LIST_PACKED", 42, 42, 3, maVar5);
        zzQ = aaVar43;
        aa aaVar44 = new aa("UINT32_LIST_PACKED", 43, 43, 3, maVar4);
        zzR = aaVar44;
        aa aaVar45 = new aa("ENUM_LIST_PACKED", 44, 44, 3, maVar9);
        zzS = aaVar45;
        aa aaVar46 = new aa("SFIXED32_LIST_PACKED", 45, 45, 3, maVar4);
        zzT = aaVar46;
        aa aaVar47 = new aa("SFIXED64_LIST_PACKED", 46, 46, 3, maVar3);
        zzU = aaVar47;
        aa aaVar48 = new aa("SINT32_LIST_PACKED", 47, 47, 3, maVar4);
        zzV = aaVar48;
        aa aaVar49 = new aa("SINT64_LIST_PACKED", 48, 48, 3, maVar3);
        zzW = aaVar49;
        aa aaVar50 = new aa("GROUP_LIST", 49, 49, 2, maVar7);
        zzX = aaVar50;
        aa aaVar51 = new aa("MAP", 50, 50, 4, ma.VOID);
        zzY = aaVar51;
        zzaa = new aa[]{aaVar, aaVar2, aaVar3, aaVar4, aaVar5, aaVar6, aaVar7, aaVar8, aaVar9, aaVar10, aaVar11, aaVar12, aaVar13, aaVar14, aaVar15, aaVar16, aaVar17, aaVar18, aaVar19, aaVar20, aaVar21, aaVar22, aaVar23, aaVar24, aaVar25, aaVar26, aaVar27, aaVar28, aaVar29, aaVar30, aaVar31, aaVar32, aaVar33, aaVar34, aaVar35, aaVar36, aaVar37, aaVar38, aaVar39, aaVar40, aaVar41, aaVar42, aaVar43, aaVar44, aaVar45, aaVar46, aaVar47, aaVar48, aaVar49, aaVar50, aaVar51};
        aa[] aaVarArrValues = values();
        zzZ = new aa[aaVarArrValues.length];
        for (aa aaVar52 : aaVarArrValues) {
            zzZ[aaVar52.zzab] = aaVar52;
        }
    }

    public aa(String str, int i10, int i11, int i12, ma maVar) {
        super(str, i10);
        this.zzab = i11;
        int i13 = i12 - 1;
        if (i13 == 1 || i13 == 3) {
            maVar.getClass();
        }
        if (i12 == 1) {
            ma maVar2 = ma.VOID;
            maVar.ordinal();
        }
    }

    public static aa[] values() {
        return (aa[]) zzaa.clone();
    }

    public final int zza() {
        return this.zzab;
    }
}
