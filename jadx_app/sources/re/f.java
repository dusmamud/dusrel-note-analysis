package re;

/* JADX INFO: loaded from: classes2.dex */
public enum f {
    READ("r"),
    WRITE("rw");

    private String value;

    f(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }
}
