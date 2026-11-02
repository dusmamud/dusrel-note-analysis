package io.objectbox.model;

/* JADX INFO: loaded from: classes2.dex */
public final class ExternalPropertyType {
    public static final short Bson = 110;
    public static final short Decimal128 = 103;
    public static final short FlexMap = 107;
    public static final short FlexVector = 108;
    public static final short Int128 = 100;
    public static final short Int128Vector = 116;
    public static final short JavaScript = 111;
    public static final short Json = 109;
    public static final short JsonToNative = 112;
    public static final short MongoBinary = 126;
    public static final short MongoId = 123;
    public static final short MongoIdVector = 124;
    public static final short MongoRegex = 127;
    public static final short MongoTimestamp = 125;
    public static final short Reserved1 = 101;
    public static final short Reserved10 = 119;
    public static final short Reserved11 = 120;
    public static final short Reserved12 = 121;
    public static final short Reserved13 = 122;
    public static final short Reserved6 = 113;
    public static final short Reserved7 = 114;
    public static final short Reserved8 = 115;
    public static final short Reserved9 = 117;
    public static final short Unknown = 0;
    public static final short Uuid = 102;
    public static final short UuidString = 104;
    public static final short UuidV4 = 105;
    public static final short UuidV4String = 106;
    public static final short UuidVector = 118;
    public static final String[] names = {"Unknown", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "Int128", "Reserved1", "Uuid", "Decimal128", "UuidString", "UuidV4", "UuidV4String", "FlexMap", "FlexVector", "Json", "Bson", "JavaScript", "JsonToNative", "Reserved6", "Reserved7", "Reserved8", "Int128Vector", "Reserved9", "UuidVector", "Reserved10", "Reserved11", "Reserved12", "Reserved13", "MongoId", "MongoIdVector", "MongoTimestamp", "MongoBinary", "MongoRegex"};

    private ExternalPropertyType() {
    }

    public static String name(int i10) {
        return names[i10];
    }
}
