package ne;

/* JADX INFO: loaded from: classes2.dex */
public enum c {
    SPECIFICATION_VERSION((byte) 51),
    WINDOWS((byte) 0),
    UNIX((byte) 3);

    private final byte code;

    c(byte b10) {
        this.code = b10;
    }

    public final byte a() {
        return this.code;
    }
}
