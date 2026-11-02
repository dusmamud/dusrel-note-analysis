package re;

/* JADX INFO: loaded from: classes2.dex */
public enum c {
    NO_COMPRESSION(0),
    FASTEST(1),
    FASTER(2),
    FAST(3),
    MEDIUM_FAST(4),
    NORMAL(5),
    HIGHER(6),
    MAXIMUM(7),
    PRE_ULTRA(8),
    ULTRA(9);

    private final int level;

    c(int i10) {
        this.level = i10;
    }

    public final int a() {
        return this.level;
    }
}
