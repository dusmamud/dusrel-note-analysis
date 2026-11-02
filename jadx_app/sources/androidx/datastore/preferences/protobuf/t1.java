package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class t1 {
    private static final /* synthetic */ t1[] $VALUES;
    public static final t1 BOOL;
    public static final t1 BYTES;
    public static final t1 DOUBLE;
    public static final t1 ENUM;
    public static final t1 FIXED32;
    public static final t1 FIXED64;
    public static final t1 FLOAT;
    public static final t1 GROUP;
    public static final t1 INT32;
    public static final t1 INT64;
    public static final t1 MESSAGE;
    public static final t1 SFIXED32;
    public static final t1 SFIXED64;
    public static final t1 SINT32;
    public static final t1 SINT64;
    public static final t1 STRING;
    public static final t1 UINT32;
    public static final t1 UINT64;
    private final u1 javaType;
    private final int wireType;

    public final enum a extends t1 {
    }

    public final enum b extends t1 {
    }

    public final enum c extends t1 {
    }

    public final enum d extends t1 {
    }

    static {
        t1 t1Var = new t1("DOUBLE", 0, u1.DOUBLE, 1);
        DOUBLE = t1Var;
        t1 t1Var2 = new t1("FLOAT", 1, u1.FLOAT, 5);
        FLOAT = t1Var2;
        u1 u1Var = u1.LONG;
        t1 t1Var3 = new t1("INT64", 2, u1Var, 0);
        INT64 = t1Var3;
        t1 t1Var4 = new t1("UINT64", 3, u1Var, 0);
        UINT64 = t1Var4;
        u1 u1Var2 = u1.INT;
        t1 t1Var5 = new t1("INT32", 4, u1Var2, 0);
        INT32 = t1Var5;
        t1 t1Var6 = new t1("FIXED64", 5, u1Var, 1);
        FIXED64 = t1Var6;
        t1 t1Var7 = new t1("FIXED32", 6, u1Var2, 5);
        FIXED32 = t1Var7;
        t1 t1Var8 = new t1("BOOL", 7, u1.BOOLEAN, 0);
        BOOL = t1Var8;
        a aVar = new a("STRING", 8, u1.STRING, 2);
        STRING = aVar;
        u1 u1Var3 = u1.MESSAGE;
        b bVar = new b("GROUP", 9, u1Var3, 3);
        GROUP = bVar;
        c cVar = new c("MESSAGE", 10, u1Var3, 2);
        MESSAGE = cVar;
        d dVar = new d("BYTES", 11, u1.BYTE_STRING, 2);
        BYTES = dVar;
        t1 t1Var9 = new t1("UINT32", 12, u1Var2, 0);
        UINT32 = t1Var9;
        t1 t1Var10 = new t1("ENUM", 13, u1.ENUM, 0);
        ENUM = t1Var10;
        t1 t1Var11 = new t1("SFIXED32", 14, u1Var2, 5);
        SFIXED32 = t1Var11;
        t1 t1Var12 = new t1("SFIXED64", 15, u1Var, 1);
        SFIXED64 = t1Var12;
        t1 t1Var13 = new t1("SINT32", 16, u1Var2, 0);
        SINT32 = t1Var13;
        t1 t1Var14 = new t1("SINT64", 17, u1Var, 0);
        SINT64 = t1Var14;
        $VALUES = new t1[]{t1Var, t1Var2, t1Var3, t1Var4, t1Var5, t1Var6, t1Var7, t1Var8, aVar, bVar, cVar, dVar, t1Var9, t1Var10, t1Var11, t1Var12, t1Var13, t1Var14};
    }

    public t1(String $enum$name, int $enum$ordinal, final u1 javaType, final int wireType) {
        super($enum$name, $enum$ordinal);
        this.javaType = javaType;
        this.wireType = wireType;
    }

    public static t1 valueOf(String name) {
        return (t1) Enum.valueOf(t1.class, name);
    }

    public static t1[] values() {
        return (t1[]) $VALUES.clone();
    }

    public final u1 a() {
        return this.javaType;
    }

    public final int b() {
        return this.wireType;
    }
}
