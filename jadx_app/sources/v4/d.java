package v4;

/* JADX INFO: loaded from: classes.dex */
public enum d {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    d(long j10) {
        this.mValue = j10;
    }

    public final long a() {
        return this.mValue;
    }
}
