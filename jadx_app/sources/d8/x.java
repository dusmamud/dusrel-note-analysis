package d8;

/* JADX INFO: loaded from: classes.dex */
public enum x implements a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);

    private final int zzb;

    x(int i10) {
        this.zzb = i10;
    }

    @Override // d8.a
    public final int a() {
        return this.zzb;
    }
}
