package xa;

/* JADX INFO: loaded from: classes2.dex */
public enum k {
    AppStart("app_start"),
    Foreground("foreground"),
    IdentityChange("identity_change"),
    Read("read");

    private final String wireName;

    k(String str) {
        this.wireName = str;
    }

    public final String a() {
        return this.wireName;
    }
}
