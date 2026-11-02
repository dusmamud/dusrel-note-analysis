package ne;

/* JADX INFO: loaded from: classes2.dex */
public enum d {
    DEFAULT(10),
    DEFLATE_COMPRESSED(20),
    ZIP_64_FORMAT(45),
    AES_ENCRYPTED(51);

    private final int code;

    d(int i10) {
        this.code = i10;
    }

    public final int a() {
        return this.code;
    }
}
