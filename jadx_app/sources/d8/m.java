package d8;

/* JADX INFO: loaded from: classes.dex */
public enum m implements a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);

    private final int zzb;

    m(int i10) {
        this.zzb = i10;
    }

    @Override // d8.a
    public final int a() {
        return this.zzb;
    }
}
