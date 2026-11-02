package qb;

/* JADX INFO: loaded from: classes2.dex */
public enum v {
    INFINITE_RECURRING(1),
    FINITE_RECURRING(2),
    NON_RECURRING(3),
    UNKNOWN(null);

    private final Integer identifier;

    v(Integer num) {
        this.identifier = num;
    }

    public final Integer a() {
        return this.identifier;
    }
}
