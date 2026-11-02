package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    private static final /* synthetic */ v[] $VALUES;
    public static final v BOOL;
    public static final v BOOL_LIST;
    public static final v BOOL_LIST_PACKED;
    public static final v BYTES;
    public static final v BYTES_LIST;
    public static final v DOUBLE;
    public static final v DOUBLE_LIST;
    public static final v DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final v ENUM;
    public static final v ENUM_LIST;
    public static final v ENUM_LIST_PACKED;
    public static final v FIXED32;
    public static final v FIXED32_LIST;
    public static final v FIXED32_LIST_PACKED;
    public static final v FIXED64;
    public static final v FIXED64_LIST;
    public static final v FIXED64_LIST_PACKED;
    public static final v FLOAT;
    public static final v FLOAT_LIST;
    public static final v FLOAT_LIST_PACKED;
    public static final v GROUP;
    public static final v GROUP_LIST;
    public static final v INT32;
    public static final v INT32_LIST;
    public static final v INT32_LIST_PACKED;
    public static final v INT64;
    public static final v INT64_LIST;
    public static final v INT64_LIST_PACKED;
    public static final v MAP;
    public static final v MESSAGE;
    public static final v MESSAGE_LIST;
    public static final v SFIXED32;
    public static final v SFIXED32_LIST;
    public static final v SFIXED32_LIST_PACKED;
    public static final v SFIXED64;
    public static final v SFIXED64_LIST;
    public static final v SFIXED64_LIST_PACKED;
    public static final v SINT32;
    public static final v SINT32_LIST;
    public static final v SINT32_LIST_PACKED;
    public static final v SINT64;
    public static final v SINT64_LIST;
    public static final v SINT64_LIST_PACKED;
    public static final v STRING;
    public static final v STRING_LIST;
    public static final v UINT32;
    public static final v UINT32_LIST;
    public static final v UINT32_LIST_PACKED;
    public static final v UINT64;
    public static final v UINT64_LIST;
    public static final v UINT64_LIST_PACKED;
    private static final v[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f2165id;
    private final c0 javaType;
    private final boolean primitiveScalar;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f2167b;

        static {
            int[] iArr = new int[c0.values().length];
            f2167b = iArr;
            try {
                iArr[c0.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2167b[c0.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2167b[c0.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f2166a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2166a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2166a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        b(boolean isList) {
            this.isList = isList;
        }
    }

    static {
        b bVar = b.SCALAR;
        c0 c0Var = c0.DOUBLE;
        v vVar = new v("DOUBLE", 0, 0, bVar, c0Var);
        DOUBLE = vVar;
        c0 c0Var2 = c0.FLOAT;
        v vVar2 = new v("FLOAT", 1, 1, bVar, c0Var2);
        FLOAT = vVar2;
        c0 c0Var3 = c0.LONG;
        v vVar3 = new v("INT64", 2, 2, bVar, c0Var3);
        INT64 = vVar3;
        v vVar4 = new v("UINT64", 3, 3, bVar, c0Var3);
        UINT64 = vVar4;
        c0 c0Var4 = c0.INT;
        v vVar5 = new v("INT32", 4, 4, bVar, c0Var4);
        INT32 = vVar5;
        v vVar6 = new v("FIXED64", 5, 5, bVar, c0Var3);
        FIXED64 = vVar6;
        v vVar7 = new v("FIXED32", 6, 6, bVar, c0Var4);
        FIXED32 = vVar7;
        c0 c0Var5 = c0.BOOLEAN;
        v vVar8 = new v("BOOL", 7, 7, bVar, c0Var5);
        BOOL = vVar8;
        c0 c0Var6 = c0.STRING;
        v vVar9 = new v("STRING", 8, 8, bVar, c0Var6);
        STRING = vVar9;
        c0 c0Var7 = c0.MESSAGE;
        v vVar10 = new v("MESSAGE", 9, 9, bVar, c0Var7);
        MESSAGE = vVar10;
        c0 c0Var8 = c0.BYTE_STRING;
        v vVar11 = new v("BYTES", 10, 10, bVar, c0Var8);
        BYTES = vVar11;
        v vVar12 = new v("UINT32", 11, 11, bVar, c0Var4);
        UINT32 = vVar12;
        c0 c0Var9 = c0.ENUM;
        v vVar13 = new v("ENUM", 12, 12, bVar, c0Var9);
        ENUM = vVar13;
        v vVar14 = new v("SFIXED32", 13, 13, bVar, c0Var4);
        SFIXED32 = vVar14;
        v vVar15 = new v("SFIXED64", 14, 14, bVar, c0Var3);
        SFIXED64 = vVar15;
        v vVar16 = new v("SINT32", 15, 15, bVar, c0Var4);
        SINT32 = vVar16;
        v vVar17 = new v("SINT64", 16, 16, bVar, c0Var3);
        SINT64 = vVar17;
        v vVar18 = new v("GROUP", 17, 17, bVar, c0Var7);
        GROUP = vVar18;
        b bVar2 = b.VECTOR;
        v vVar19 = new v("DOUBLE_LIST", 18, 18, bVar2, c0Var);
        DOUBLE_LIST = vVar19;
        v vVar20 = new v("FLOAT_LIST", 19, 19, bVar2, c0Var2);
        FLOAT_LIST = vVar20;
        v vVar21 = new v("INT64_LIST", 20, 20, bVar2, c0Var3);
        INT64_LIST = vVar21;
        v vVar22 = new v("UINT64_LIST", 21, 21, bVar2, c0Var3);
        UINT64_LIST = vVar22;
        v vVar23 = new v("INT32_LIST", 22, 22, bVar2, c0Var4);
        INT32_LIST = vVar23;
        v vVar24 = new v("FIXED64_LIST", 23, 23, bVar2, c0Var3);
        FIXED64_LIST = vVar24;
        v vVar25 = new v("FIXED32_LIST", 24, 24, bVar2, c0Var4);
        FIXED32_LIST = vVar25;
        v vVar26 = new v("BOOL_LIST", 25, 25, bVar2, c0Var5);
        BOOL_LIST = vVar26;
        v vVar27 = new v("STRING_LIST", 26, 26, bVar2, c0Var6);
        STRING_LIST = vVar27;
        v vVar28 = new v("MESSAGE_LIST", 27, 27, bVar2, c0Var7);
        MESSAGE_LIST = vVar28;
        v vVar29 = new v("BYTES_LIST", 28, 28, bVar2, c0Var8);
        BYTES_LIST = vVar29;
        v vVar30 = new v("UINT32_LIST", 29, 29, bVar2, c0Var4);
        UINT32_LIST = vVar30;
        v vVar31 = new v("ENUM_LIST", 30, 30, bVar2, c0Var9);
        ENUM_LIST = vVar31;
        v vVar32 = new v("SFIXED32_LIST", 31, 31, bVar2, c0Var4);
        SFIXED32_LIST = vVar32;
        v vVar33 = new v("SFIXED64_LIST", 32, 32, bVar2, c0Var3);
        SFIXED64_LIST = vVar33;
        v vVar34 = new v("SINT32_LIST", 33, 33, bVar2, c0Var4);
        SINT32_LIST = vVar34;
        v vVar35 = new v("SINT64_LIST", 34, 34, bVar2, c0Var3);
        SINT64_LIST = vVar35;
        b bVar3 = b.PACKED_VECTOR;
        v vVar36 = new v("DOUBLE_LIST_PACKED", 35, 35, bVar3, c0Var);
        DOUBLE_LIST_PACKED = vVar36;
        v vVar37 = new v("FLOAT_LIST_PACKED", 36, 36, bVar3, c0Var2);
        FLOAT_LIST_PACKED = vVar37;
        v vVar38 = new v("INT64_LIST_PACKED", 37, 37, bVar3, c0Var3);
        INT64_LIST_PACKED = vVar38;
        v vVar39 = new v("UINT64_LIST_PACKED", 38, 38, bVar3, c0Var3);
        UINT64_LIST_PACKED = vVar39;
        v vVar40 = new v("INT32_LIST_PACKED", 39, 39, bVar3, c0Var4);
        INT32_LIST_PACKED = vVar40;
        v vVar41 = new v("FIXED64_LIST_PACKED", 40, 40, bVar3, c0Var3);
        FIXED64_LIST_PACKED = vVar41;
        v vVar42 = new v("FIXED32_LIST_PACKED", 41, 41, bVar3, c0Var4);
        FIXED32_LIST_PACKED = vVar42;
        v vVar43 = new v("BOOL_LIST_PACKED", 42, 42, bVar3, c0Var5);
        BOOL_LIST_PACKED = vVar43;
        v vVar44 = new v("UINT32_LIST_PACKED", 43, 43, bVar3, c0Var4);
        UINT32_LIST_PACKED = vVar44;
        v vVar45 = new v("ENUM_LIST_PACKED", 44, 44, bVar3, c0Var9);
        ENUM_LIST_PACKED = vVar45;
        v vVar46 = new v("SFIXED32_LIST_PACKED", 45, 45, bVar3, c0Var4);
        SFIXED32_LIST_PACKED = vVar46;
        v vVar47 = new v("SFIXED64_LIST_PACKED", 46, 46, bVar3, c0Var3);
        SFIXED64_LIST_PACKED = vVar47;
        v vVar48 = new v("SINT32_LIST_PACKED", 47, 47, bVar3, c0Var4);
        SINT32_LIST_PACKED = vVar48;
        v vVar49 = new v("SINT64_LIST_PACKED", 48, 48, bVar3, c0Var3);
        SINT64_LIST_PACKED = vVar49;
        v vVar50 = new v("GROUP_LIST", 49, 49, bVar2, c0Var7);
        GROUP_LIST = vVar50;
        v vVar51 = new v("MAP", 50, 50, b.MAP, c0.VOID);
        MAP = vVar51;
        $VALUES = new v[]{vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8, vVar9, vVar10, vVar11, vVar12, vVar13, vVar14, vVar15, vVar16, vVar17, vVar18, vVar19, vVar20, vVar21, vVar22, vVar23, vVar24, vVar25, vVar26, vVar27, vVar28, vVar29, vVar30, vVar31, vVar32, vVar33, vVar34, vVar35, vVar36, vVar37, vVar38, vVar39, vVar40, vVar41, vVar42, vVar43, vVar44, vVar45, vVar46, vVar47, vVar48, vVar49, vVar50, vVar51};
        EMPTY_TYPES = new Type[0];
        v[] vVarArrValues = values();
        VALUES = new v[vVarArrValues.length];
        for (v vVar52 : vVarArrValues) {
            VALUES[vVar52.f2165id] = vVar52;
        }
    }

    public v(String $enum$name, int $enum$ordinal, int id2, b collection, c0 javaType) {
        int i10;
        super($enum$name, $enum$ordinal);
        this.f2165id = id2;
        this.collection = collection;
        this.javaType = javaType;
        int i11 = a.f2166a[collection.ordinal()];
        if (i11 == 1 || i11 == 2) {
            this.elementType = javaType.a();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (collection != b.SCALAR || (i10 = a.f2167b[javaType.ordinal()]) == 1 || i10 == 2 || i10 == 3) ? false : true;
    }

    public static v valueOf(String name) {
        return (v) Enum.valueOf(v.class, name);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }

    public final int a() {
        return this.f2165id;
    }
}
