package re;

/* JADX INFO: loaded from: classes2.dex */
public enum b {
    ONE(1),
    TWO(2);

    private int versionNumber;

    b(int i10) {
        this.versionNumber = i10;
    }

    public static b a(int i10) throws me.a {
        for (b bVar : values()) {
            if (bVar.versionNumber == i10) {
                return bVar;
            }
        }
        throw new me.a("Unsupported Aes version");
    }

    public final int b() {
        return this.versionNumber;
    }
}
