package re;

/* JADX INFO: loaded from: classes2.dex */
public enum a {
    KEY_STRENGTH_128(1, 8, 16, 16),
    KEY_STRENGTH_192(2, 12, 24, 24),
    KEY_STRENGTH_256(3, 16, 32, 32);

    private int keyLength;
    private int macLength;
    private int rawCode;
    private int saltLength;

    a(int i10, int i11, int i12, int i13) {
        this.rawCode = i10;
        this.saltLength = i11;
        this.macLength = i12;
        this.keyLength = i13;
    }

    public static a a(int i10) {
        for (a aVar : values()) {
            if (aVar.rawCode == i10) {
                return aVar;
            }
        }
        return null;
    }

    public final int b() {
        return this.keyLength;
    }

    public final int c() {
        return this.macLength;
    }

    public final int e() {
        return this.rawCode;
    }

    public final int f() {
        return this.saltLength;
    }
}
