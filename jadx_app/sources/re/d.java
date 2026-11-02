package re;

/* JADX INFO: loaded from: classes2.dex */
public enum d {
    STORE(0),
    DEFLATE(8),
    AES_INTERNAL_ONLY(99);

    private int code;

    d(int i10) {
        this.code = i10;
    }

    public static d b(int i10) throws me.a {
        for (d dVar : values()) {
            if (dVar.code == i10) {
                return dVar;
            }
        }
        throw new me.a("Unknown compression method");
    }

    public final int a() {
        return this.code;
    }
}
